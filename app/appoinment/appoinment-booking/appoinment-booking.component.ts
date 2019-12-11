import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, Validators } from '@angular/forms';
import { DoctorService } from 'src/app/doctor/doctor.service';
import { Doctor } from 'src/app/model/doctor.model';
import { Appointment } from 'src/app/model/appointment.model';
import { AuthService } from 'src/app/services/auth.service';
import { User } from 'src/app/model/user.model';

@Component({
  selector: 'app-appoinment-booking',
  templateUrl: './appoinment-booking.component.html',
  styleUrls: ['./appoinment-booking.component.css']
})
export class AppoinmentBookingComponent implements OnInit {

  constructor(private doctorService: DoctorService, private authService: AuthService) { }
  appointmentBookingForm: FormGroup;
  doctors: Doctor[];
  appointment: Appointment;
  loggedUser: User;
  userName: string;
  bookedDoctor: Doctor;
  ngOnInit() {
    this.appointmentBookingForm = new FormGroup({
      'firstname': new FormControl(null, [Validators.required, Validators.pattern('^[a-zA-Z0-9]+$'), Validators.maxLength(50)]),
      'lastname': new FormControl(null, [Validators.required, Validators.pattern('^[a-zA-Z0-9]+$'), Validators.maxLength(50)]),
      'appointmentDate': new FormControl(null, [Validators.required]),
      'disease': new FormControl(null, [Validators.required, Validators.pattern('^[a-zA-Z0-9]+$'), Validators.maxLength(50)]),
      'doctorId': new FormControl(null, [Validators.required, Validators.maxLength(20)]),
    })


    this.doctorService.getDoctors().subscribe((data: Doctor[]) => {
      this.doctors = [...data]
      console.log(this.doctors);

    })
    this.userName = this.authService.loggedUser;
    this.authService.getUser(this.userName).subscribe((data) => {
      this.loggedUser = data;
      console.log("user")
      console.log(this.loggedUser)
    })

    //  let today = new Date()
    //let tomorrow = new Date(today)
    //tomorrow.setDate(tomorrow.getDate() + 1)
    //console.log(tomorrow.getMonth()+1+"-"+tomorrow.getDate()+"-"+tomorrow.getFullYear())
  }



  get firstname() {
    return this.appointmentBookingForm.get('firstname');
  }
  get lastname() {
    return this.appointmentBookingForm.get('lastname');
  }
  get appointmentDate() {
    return this.appointmentBookingForm.get('appointmentDate');
  }
  get disease() {
    return this.appointmentBookingForm.get('disease');
  }
  get doctorId() {
    return this.appointmentBookingForm.get('doctorId');
  }


  onSignAppointmentBookingSubmit() {


    // this.userName = this.authService.loggedUser;
    // this.authService.getUser(this.userName).subscribe((data) => {
    //   this.loggedUser = data;
    //   console.log("user")
    //   console.log(this.loggedUser)
    // })


   // let id = this.appointmentBookingForm.get('doctorId').value;
    // console.log("id" + id)
    // this.doctorService.getDoctor(id).subscribe((data) => {
    //   this.bookedDoctor = data
    //   console.log("doctor")
    //   console.log(this.bookedDoctor)
    // })
    let id = this.appointmentBookingForm.get('doctorId').value;
    this.bookedDoctor = this.doctors.find(doctor => doctor.id== id);

    console.log(this.appointmentBookingForm.value)
    this.appointment = {
      patientFirstName: this.appointmentBookingForm.get('firstname').value,
      patientLastName: this.appointmentBookingForm.get('lastname').value,
      appointmentDate: this.appointmentBookingForm.get('appointmentDate').value,
      status: 0,
      disease: this.appointmentBookingForm.get('disease').value,
      doctor: this.bookedDoctor,
      user: this.loggedUser,
     // doctor:this.getDoctor(id),
     // user: this.getUser()
    }
    console.log("app")
    console.log(this.appointment)

  }
}
