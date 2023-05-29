import {NgModule} from '@angular/core';
import {RouterModule, Routes} from '@angular/router';
import {CTHomeComponent} from "./components/contact-tracer/ct-home/c-t-home.component";
import {LoginComponent} from "./components/login/login.component";
import {AddPersonComponent} from "./components/contact-tracer/add-person/add-person.component";
import {BhHomeComponent} from "./components/bh-employee/bh-home/bh-home.component";
import {EditPersonComponent} from "./components/contact-tracer/edit-person/edit-person.component";
import {SickInfoComponent} from "./components/contact-tracer/sick-info/sick-info.component";

const routes: Routes = [
  {path: 'ct-home', component: CTHomeComponent},
  {path: 'bh-home', component: BhHomeComponent},
  {path: 'login', component: LoginComponent},
  {path: 'add', component: AddPersonComponent},
  {path: 'edit/:id', component: EditPersonComponent},
  {path: 'sickInfo/:id', component: SickInfoComponent},
  {path: '**', component: CTHomeComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {
}
