import { Injectable } from "@angular/core";
import { HttpClient, HttpHeaders } from "@angular/common/http";
import { Observable, Subject, Observer } from "rxjs";
import { AuthService } from "../services/auth.service";
import { Patient } from '../model/patient.model';
import { environment } from 'src/environments/environment';

@Injectable({
    providedIn: 'root'
})
export class PatientService {

    filter = new Subject();
    baseUrl = environment.baseUrl2;
    constructor(private httpClient: HttpClient, private authService: AuthService) {

    }
    /*
    getPatients(): Observable<any> {
        let header = new HttpHeaders();
        header = header.set('Authorization', 'Bearer ' + this.authService.accessToken);
        return this.http.get("http://localhost:8080/users/patients", { headers: header })
    }

    updatePatient(patient:Patient): Observable<any> {
        let header = new HttpHeaders();
        header = header.set('Authorization', 'Bearer ' + this.authService.accessToken);
        return this.http.put("http://localhost:8080/users/patients",patient,{ headers: header })
    }
  */  
    getPatient(id: number): Observable<any> {

        return Observable.create((observer: Observer<Patient>) => {
            this.getPatients().subscribe((patients: Patient[]) => {
                
                const patientList = patients.find(patient => patient.id== id);
                
               observer.next(patientList)
            })
        })
    }


    getPatients(): Observable<any> {
        const httpOptions = {
            headers: new HttpHeaders({
                'Authorization': 'Bearer ' + this.authService.accessToken
            })
        };
        return this.httpClient.get<Patient[]>(this.baseUrl + "/medicare/getallpatients", httpOptions);
    }
    updatePatient(patient: Patient): Observable<any> {
        const httpOptions = {
            headers: new HttpHeaders({
                'Content-Type': 'application/json',
                'Authorization': 'Bearer ' + this.authService.accessToken
            })

        };
        return this.httpClient.put<void>(this.baseUrl + "/medicare/patient", patient, httpOptions);
    }

    updateAgentStatus(id: number): Observable<any> {
        const httpOptions = {
            headers: new HttpHeaders({
                'Content-Type': 'application/json',
                'Authorization': 'Bearer ' + this.authService.accessToken
            })

        };
        return this.httpClient.put<void>(this.baseUrl + "/medicare/patientstatus", id, httpOptions);
    }
    
}