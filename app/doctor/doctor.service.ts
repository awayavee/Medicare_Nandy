import { Injectable } from "@angular/core";
import { HttpClient, HttpHeaders } from "@angular/common/http";
import { Observable, Subject, Observer } from "rxjs";
import { AuthService } from "../services/auth.service";
import { Doctor } from '../model/doctor.model';
import { environment } from 'src/environments/environment';

@Injectable({
    providedIn: 'root'
})
export class DoctorService {
    configUrl: string = 'http://localhost:8080/';
    filter = new Subject();
    baseUrl = environment.baseUrl2;
    constructor(private httpClient: HttpClient, private authService: AuthService) {

    }

    /*
    getDoctors(): Observable<any> {
        let header = new HttpHeaders();
        header = header.set('Authorization', 'Bearer ' + this.authService.accessToken);
        return this.http.get("http://localhost:8080/users/doctors", { headers: header })
    }

    updateDoctor(doctor:Doctor): Observable<any> {
        let header = new HttpHeaders();
        header = header.set('Authorization', 'Bearer ' + this.authService.accessToken);
        return this.http.put("http://localhost:8080/users/doctors",doctor,{ headers: header })
    }
    
    getDoctor(id: number): Observable<any> {

        return Observable.create((observer: Observer<Doctor>) => {
            this.getDoctors().subscribe((doctors: Doctor[]) => {
                
                const docList = doctors.find(doctor => doctor.id== id);
                
                observer.next(docList)
            })
        })
    }
*/
    getDoctors(): Observable<any> {
        const httpOptions = {
            headers: new HttpHeaders({
                'Authorization': 'Bearer ' + this.authService.accessToken
            })
        };
        return this.httpClient.get<Doctor[]>(this.baseUrl + "/medicare/getalldoctors", httpOptions);
    }


    getDoctor(id: number): Observable<any> {

        return Observable.create((observer: Observer<Doctor>) => {
            this.getDoctors().subscribe((doctors: Doctor[]) => {
                
                const docList = doctors.find(doctor => doctor.id== id);
                
                observer.next(docList)
            })
        })
    }

    updateDoctor(doctor: Doctor): Observable<any> {
        const httpOptions = {
            headers: new HttpHeaders({
                'Content-Type': 'application/json',
                'Authorization': 'Bearer ' + this.authService.accessToken
            })

        };
        return this.httpClient.put<void>(this.baseUrl + "/medicare/doctor", doctor, httpOptions);
    }

    updateDoctorStatus(id: number): Observable<any> {
        const httpOptions = {
            headers: new HttpHeaders({
                'Content-Type': 'application/json',
                'Authorization': 'Bearer ' + this.authService.accessToken
            })

        };
        return this.httpClient.put<void>(this.baseUrl + "/medicare/doctorstatus", id, httpOptions);
    }
}