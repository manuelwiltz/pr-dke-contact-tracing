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
    const visited: Set<number> = new Set();

    for (const person of people) {
      if (!visited.has(person.svnr) && person.sickInformation.sick) {
        const cluster: string[] = this.getCluster(person, people, visited);
        clusters.push(cluster);
      }
    }

    return {
      clusters,
      clusterCount: clusters.length,
    };
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
