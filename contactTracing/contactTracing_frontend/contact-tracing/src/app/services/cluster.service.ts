import {Injectable} from '@angular/core';
import {Person} from "../entities/Person";

@Injectable({
  providedIn: 'root'
})
export class ClusterService {

  constructor() {
  }

  getCovidClusters(people: Person[]): { clusters: string[][], clusterCount: number } {
    const clusters: string[][] = [];
    const infectedContacts: { [svnr: string]: number } = {};

    for (const person of people) {
      if (person.sickInformation.sick) {
        for (const contact of person.contacts) {
          infectedContacts[contact] = (infectedContacts[contact] || 0) + 1;
        }
      }
    }

    for (const person of people) {
      const cluster: string[] = [];

      for (const contact of person.contacts) {
        if (infectedContacts[contact] > 2) {
          cluster.push(contact);
        }
      }

      if (cluster.length > 0) {
        clusters.push(cluster);
      }
    }

    const clusterCount = clusters.length;

    return {clusters, clusterCount};
  }

  private getCluster(person: Person, people: Person[], visited: Set<number>): string[] {
    const cluster: string[] = [];
    const queue: Person[] = [person];
    visited.add(person.svnr);

    while (queue.length > 0) {
      const currentPerson = queue.shift()!;
      cluster.push(currentPerson.svnr.toString());

      for (const contactSVNR of currentPerson.contacts) {
        const contactPerson = people.find(p => p.svnr === parseInt(contactSVNR));
        if (contactPerson && contactPerson.sickInformation.sick && !visited.has(contactPerson.svnr)) {
          queue.push(contactPerson);
          visited.add(contactPerson.svnr);
        }
      }
    }

    return cluster;
  }

}
