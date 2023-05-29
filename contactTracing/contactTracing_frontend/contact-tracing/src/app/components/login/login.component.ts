import {Component} from '@angular/core';
import {AuthService, Role} from "../../services/auth.service";
import {Router} from "@angular/router";

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.scss']
})
export class LoginComponent {

  constructor(private router: Router, private authService: AuthService) {
  }

  selectRole(role: Role) {
    this.authService.setRole(role);

    if (this.authService.getRole() === "CT") {
      this.router.navigate(['ct-home']);
    } else if (this.authService.getRole() === "BH") {
      console.log('BH')
      this.router.navigate(['bh-home']);
    }
  }

}
