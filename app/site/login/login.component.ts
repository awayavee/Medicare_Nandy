import { Component, OnInit } from '@angular/core';
import { Router, ActivatedRoute, Params } from '@angular/router';
import { NgForm } from '@angular/forms';
import { AuthService } from 'src/app/services/auth.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  isLoginValid = true;
  authSource: string;
  error: string;
  status = true;
  constructor(private router: Router, private route: ActivatedRoute, private authService: AuthService) { }

  ngOnInit() {
    this.authSource = this.authService.authSource
  }


  onSubmit(form: NgForm) {

    /*

    console.log("in login component ts");
    this.authSource = ''
    this.authService.authSource = '';
    const username = form.value.username;
    console.log(username);
    const password = form.value.password;
    console.log(password);
    if (username === 'Chitransh') {
      this.isLoginValid = false;
    } else {
      this.authService.logIn(username, password).subscribe((data) => {
        this.authService.accessToken = data['token'];
        this.authService.isAdmin = data['role'] == 'ROLE_ADMIN' ? true : false;
        this.authService.loggedIn = true;
        if (this.authService.isAdmin) {
            this.authService.userAuthenticated = { username: username, firstname: 'Angad', lastname: 'Verma',  accessToken: this.authService.accessToken,status:true,password:"pwd" }
        }
        else {
            this.authService.userAuthenticated = { username: username, firstname: 'Chitransh', lastname: 'Customer', accessToken: this.authService.accessToken,status:true,password:"pwd" }
        }
        this.router.navigate(['/menu']);
    },(error)=>{
      this.isLoginValid = (error['status'] == 401) ? false : true;
    });
    }

*/

    this.authService.getUser(form.value.username).subscribe((data) => {
      if (data !== null) {
        this.status = data.status;
        this.isLoginValid=true;
      } else this.status = true;
    })



    const username = form.value.username;
    const password = form.value.password;




    this.authService.authenticate(username, password).subscribe((data) => {
      this.authService.loggedIn = true;
      this.authService.accessToken = data['token'];
      this.authService.loggedUser=username;
      // this.userAuthService.loggedIn = true;
      // this.userAuthService.setToken(data.token);
      // this.userAuthService.setRole(data.role);
      // this.userAuthService.setUser(username);
      // this.authencicateService.loggedIn = true;
      // this.authencicateService.isAdmin = data.role === 'ROLE_ADMIN';
      this.router.navigate(['/menu']);
    },
      (error) => {
        if (error.status == 401) {
          this.error = "Invalid username/password";
          if(this.status)
          this.isLoginValid = false;
        }


      });
  }

}
