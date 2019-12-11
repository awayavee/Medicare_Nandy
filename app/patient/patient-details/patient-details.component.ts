import { Component, OnInit, Input } from '@angular/core';
import { PatientService } from '../patient.service';
import { Patient } from 'src/app/model/patient.model';


@Component({
  selector: 'app-patient-details',
  templateUrl: './patient-details.component.html',
  styleUrls: ['./patient-details.component.css']
})
export class PatientDetailsComponent implements OnInit {

  @Input()
  patients:Patient[];
  tempPatients:Patient[];

  constructor(private patientService:PatientService) { }

  ngOnInit() {
    this.patientService.getPatients().subscribe((data:Patient[])=>{
      this.tempPatients= [...data]
      this.patients= [...data]
      console.log(this.patients)
    })

   
  }
  changeStatus(id: number) {
    this.patientService.updateAgentStatus(id).subscribe((data) => {
      this.ngOnInit();
//this.statusChanged=true;
    })
  }
}
