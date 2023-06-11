import {NgModule} from '@angular/core';
import {BrowserModule} from '@angular/platform-browser';

import {AppRoutingModule} from './app-routing.module';
import {AppComponent} from './app.component';
import {LoginComponent} from './components/login/login.component';
import {AddPersonComponent} from './components/contact-tracer/add-person/add-person.component';
import {ListPersonComponent} from './components/contact-tracer/list-person/list-person.component';
import {CTHomeComponent} from './components/contact-tracer/ct-home/c-t-home.component';
import {
  MedicationAppointmentComponent
} from './components/bh-employee/medication-appointment/medication-appointment.component';
import {BhDashboardComponent} from './components/bh-employee/bh-dashboard/bh-dashboard.component';
import {BhHomeComponent} from './components/bh-employee/bh-home/bh-home.component';
import {AuthService} from "./services/auth.service";
import {PersonService} from "./services/person.service";
import {HttpClientModule} from "@angular/common/http";
import {ButtonModule} from 'primeng/button';
import {CardModule} from 'primeng/card';
import {ToolbarModule} from 'primeng/toolbar';
import {TableModule} from "primeng/table";
import {AccordionModule} from "primeng/accordion";
import {MenubarModule} from "primeng/menubar";
import {CalendarModule} from "primeng/calendar";
import {FormsModule} from "@angular/forms";
import {InputTextModule} from "primeng/inputtext";
import {InputNumberModule} from "primeng/inputnumber";
import { EditPersonComponent } from './components/contact-tracer/edit-person/edit-person.component';
import { SickInfoComponent } from './components/contact-tracer/sick-info/sick-info.component';
import {InputSwitchModule} from "primeng/inputswitch";
import {BrowserAnimationsModule} from "@angular/platform-browser/animations";
import {MultiSelectModule} from "primeng/multiselect";
import { ClusterComponent } from './components/contact-tracer/cluster/cluster.component';
import {DropdownModule} from "primeng/dropdown";

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    AddPersonComponent,
    ListPersonComponent,
    CTHomeComponent,
    MedicationAppointmentComponent,
    BhDashboardComponent,
    BhHomeComponent,
    EditPersonComponent,
    SickInfoComponent,
    ClusterComponent
  ],
  imports: [
    BrowserModule,
    BrowserAnimationsModule,
    AppRoutingModule,
    HttpClientModule,
    ButtonModule,
    CardModule,
    ToolbarModule,
    TableModule,
    AccordionModule,
    MenubarModule,
    CalendarModule,
    FormsModule,
    InputTextModule,
    InputNumberModule,
    InputSwitchModule,
    MultiSelectModule,
    DropdownModule,
  ],
  providers: [
    HttpClientModule,
    AuthService,
    PersonService
  ],
  bootstrap: [AppComponent]
})
export class AppModule {
}
