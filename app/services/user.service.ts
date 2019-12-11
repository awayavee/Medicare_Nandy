import { Injectable } from "@angular/core";
import { Observable, Observer } from "rxjs";
import { HttpClient, HttpHeaders } from "@angular/common/http";
import { environment } from 'src/environments/environment';
import { User } from '../model/user.model';

@Injectable({
    providedIn: 'root'
})

export class UserService {
    baseUrl = environment.baseUrl;
    constructor(private httpClient:HttpClient) {
    }
/*
    authenticate(user:User):Observable<any> {
        return this.httpClient.post(this.baseUrl + "/users", user)
    }
    userAvailable(username:string):Observable<boolean> {
        //return this.httpClient.get<boolean>(`http://localhost:8080/users/${username}`)
        return this.httpClient.get<boolean>(this.baseUrl+"/users/"+username)
    }
  */  
 addUser(user:User):Observable<any> {
    return this.httpClient.post(this.baseUrl + "/users", user)
}
}

