import {Component} from '@angular/core';
import {ActivatedRoute, Router} from "@angular/router";
import {PersonService} from "../../../services/person.service";
import {Person} from "../../../entities/Person";
import {forkJoin} from "rxjs";
import {ClusterService} from "../../../services/cluster.service";

@Component({
  selector: 'app-bh-home',
  templateUrl: './bh-home.component.html',
  styleUrls: ['./bh-home.component.scss']
})
export class BhHomeComponent {

  public selectedState: string = '';
  public selectedCounty: string = '';

  public countyPeople: Person[] = [];

  public people: Person[] = [];
  public clusterCount: number = 0;

  public totalAmountOfPeople: number = 0;
  public sickPeople: number = 0;
  public symptomPeople: number = 0;
  public quarantinedPeople: number = 0;
  public potentialPeople: number = 0;
  public medicationAppointmentSize: number = 0;

  constructor(private personService: PersonService, private route: ActivatedRoute, private clusterService: ClusterService) {
  }

  ngOnInit() {
    this.route.params.subscribe((params) => {
      this.selectedState = params['state'];
      this.selectedCounty = params['county'];

      forkJoin([
        this.personService.getPeople(),
        this.personService.getPeopleByStateAndCounty(this.selectedState, this.selectedCounty),
        this.personService.getTotalAmountOfPeopleByStateAndCounty(this.selectedState, this.selectedCounty),
        this.personService.getMedicationAppointmentsByStateAndCounty(this.selectedState, this.selectedCounty)
      ])
        .subscribe(([people, countyPeople, size, medicationAppointmentSize]) => {
          this.people = people;
          this.countyPeople = countyPeople;
          this.totalAmountOfPeople = size;
          this.medicationAppointmentSize = medicationAppointmentSize;

          this.clusterCount = this.clusterService.getCovidClusters(people).clusterCount;

          this.sickPeople = this.countyPeople.filter(person => person.sickInformation.sick).length;
          this.symptomPeople = this.countyPeople.filter(person => person.sickInformation.symptoms).length;
          this.quarantinedPeople = this.countyPeople.filter(person => person.sickInformation.quarantine).length;
          this.potentialPeople = this.countyPeople.filter(person => person.sickInformation.potential).length;
        });
    });
  }

  getSickColor() {
    if (this.sickPeople / this.totalAmountOfPeople > 0.3) {
      return 'orange';
    } else if (this.sickPeople / this.totalAmountOfPeople > 0.6) {
      return 'red';
    } else {
      return 'green';
    }
  }

  getSymptomColor() {
    if (this.symptomPeople / this.totalAmountOfPeople > 0.3) {
      return 'orange';
    } else if (this.symptomPeople / this.totalAmountOfPeople > 0.6) {
      return 'red';
    } else {
      return 'green';
    }
  }

  getQuarantineColor() {
    if (this.quarantinedPeople / this.totalAmountOfPeople > 0.3) {
      return 'orange';
    } else if (this.quarantinedPeople / this.totalAmountOfPeople > 0.6) {
      return 'red';
    } else {
      return 'green';
    }
  }

  getPotentialColor() {
    if (this.potentialPeople / this.totalAmountOfPeople > 0.3) {
      return 'orange';
    } else if (this.potentialPeople / this.totalAmountOfPeople > 0.6) {
      return 'red';
    } else {
      return 'green';
    }
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
