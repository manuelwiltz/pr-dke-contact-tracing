import {Component} from '@angular/core';
import {PersonService} from "../../../services/person.service";
import {emptyPerson, Person} from "../../../entities/Person";
import {Router} from "@angular/router";

@Component({
  selector: 'app-add-person',
  templateUrl: './add-person.component.html',
  styleUrls: ['./add-person.component.scss']
})
export class AddPersonComponent {

  public person: Person = emptyPerson;

  public allPeople: Person[] = [];
  public selectedPeople: Person[] = [];

  constructor(private personService: PersonService, private router: Router) {
  }

  ngOnInit() {
      this.personService.getPeople().subscribe((allPeople) => {
        this.allPeople = allPeople.filter(value => value.svnr !== this.person.svnr);
      });
  }

  savePerson() {
    this.personService.addPerson(this.person).subscribe((newPerson) => {
      console.log('newPerson', newPerson);
      this.router.navigate(['ct-home']);
    });
  }

  updateSelectedPeople() {
    const svnrs = this.selectedPeople.map(s => s.svnr.toString());
    this.person.contacts = svnrs;
  }

}
