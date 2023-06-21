import {Component} from '@angular/core';
import {Person} from "../../../entities/Person";
import {Router} from "@angular/router";
import {PersonService} from "../../../services/person.service";
import {ClusterService} from "../../../services/cluster.service";

@Component({
  selector: 'app-cluster',
  templateUrl: './cluster.component.html',
  styleUrls: ['./cluster.component.scss']
})
export class ClusterComponent {

  public people: Person[] = [];
  clusters: { contacts: string[] }[] = [];
  public clusterCount: number = 0;

  constructor(private personService: PersonService, private clusterService: ClusterService) {
  }

  ngOnInit() {
    this.personService.getPeople().subscribe((people) => {
      this.people = people;

      const { clusters, clusterCount } = this.clusterService.getCovidClusters(this.people);
      this.clusters = clusters.map(cluster => ({ contacts: cluster }));
      this.clusterCount = clusterCount;
    });
  }

  getClusterColor() {
    if (this.clusterCount > 5) {
      return 'orange';
    } else if (this.clusterCount > 25) {
      return 'red';
    } else {
      return 'green';
    }
  }

}
