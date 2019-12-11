import { Injectable } from "@angular/core";
import { UserService } from "./user.service";
import { HttpClient, HttpHeaders } from "@angular/common/http";
import { Observable } from "rxjs";
import { User } from '../model/user.model';
import { environment } from 'src/environments/environment';

@Injectable({
    providedIn: 'root'
})

export class AuthService {

    loggedIn = false;
    isAdmin = false;
    redirectUrl: string = '/';
    userAuthenticated: User;
    authSource: string = '';
    accessToken: string;
    baseUrl = environment.baseUrl;


    loggedUser:string;
    constructor(private userService: UserService, private httpClient: HttpClient) {

    }
    /*
        logIn(username: string, password: string):Observable<any> {
            let header = new HttpHeaders();
            header = header.set('Authorization', 'Basic ' + btoa(username + ':' + password));
    
            return this.httpService.get("http://localhost:8080/authenticate", { headers: header })
        }
    */


    public authenticate(user: string, password: string): Observable<any> {
        let credentials = btoa(user + ':' + password);
        let headers = new HttpHeaders();
        headers = headers.set('Authorization', 'Basic ' + credentials);
        return this.httpClient.get(this.baseUrl + "/authenticate", { headers });
    }

    public getUser(user: string): Observable<any> {
        return this.httpClient.get<User>(this.baseUrl + "/users/getuser/" + user);
    }

    logOut() {
        this.redirectUrl = '/';
        this.loggedIn = false;
    }
    isUserAdmin() {
        return this.isAdmin;
    }

}

