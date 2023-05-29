import {ChangeDetectionStrategy, Component} from '@angular/core';
import {Router} from "@angular/router";
import {AuthService, Role} from "./services/auth.service";
import {MenuItem} from "primeng/api";

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss'],
})
export class AppComponent {
  title = 'contact-tracing';
  role: Role | undefined;
  public CTItems: MenuItem[] = [];
  public BHItems: MenuItem[] = [];

  constructor(private router: Router, private authService: AuthService) {

  }

  ngOnInit() {
    console.log('test');
    this.role = this.authService.getRole();

    if (this.role === undefined) {
      this.router.navigate(['login']);
    } else {
      this.router.navigate(['ct-home'])
    }

      this.CTItems = [
        {
          label: 'Übersicht',
          icon: 'pi pi-fw pi-user',
          routerLink: '/ct-home'
        },
        {
          label: 'Add Person',
          icon: 'pi pi-fw pi-file',
          routerLink: '/add',
        },
        {
          label: 'Edit',
          icon: 'pi pi-fw pi-pencil',
          disabled: true,
        },
        {
          label: 'Log out',
          icon: 'pi pi-fw pi-power-off',
          routerLink: '/login'
        }
      ];

    this.BHItems = [
      {
        label: 'Add Person',
        icon: 'pi pi-fw pi-file',
        routerLink: '/add',
      },
      {
        label: 'Log out',
        icon: 'pi pi-fw pi-power-off',
        routerLink: '/login'
      }
    ];
    }

}
