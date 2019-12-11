import { Component, OnInit, Input } from '@angular/core';
import { Doctor } from 'src/app/model/doctor.model';
import { DoctorService } from 'src/app/doctor/doctor.service';

@Component({
  selector: 'app-doctor-details',
  templateUrl: './doctor-details.component.html',
  styleUrls: ['./doctor-details.component.css']
})
export class DoctorDetailsComponent implements OnInit {

  @Input()
  doctors:Doctor[];
  tempDoctor:Doctor[];
  isMale:boolean;
  constructor(private doctorService:DoctorService) { }

  ngOnInit() {

    this.doctorService.getDoctors().subscribe((data: Doctor[]) => {
      this.tempDoctor = [...data]
      this.doctors = [...data]
      console.log(this.doctors);

  })
  }
  changeStatus(id: number) {
    this.doctorService.updateDoctorStatus(id).subscribe((data) => {
      this.ngOnInit();
//this.statusChanged=true;
    })
  }
}
