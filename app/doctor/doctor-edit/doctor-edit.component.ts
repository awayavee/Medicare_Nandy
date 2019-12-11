import { Component, OnInit } from '@angular/core';
import { Doctor } from 'src/app/model/doctor.model';
import { FormGroup, FormControl, Validators } from '@angular/forms';
import { ActivatedRoute, Router, Params } from '@angular/router';
import { DoctorService } from '../doctor.service';
import { MedicareServices } from 'src/app/model/medicareservices.model';

@Component({
  selector: 'app-doctor-edit',
  templateUrl: './doctor-edit.component.html',
  styleUrls: ['./doctor-edit.component.css']
})
export class DoctorEditComponent implements OnInit {

  doctorEditForm:FormGroup;
  signupForm: FormGroup;
  doctorEdited: boolean = false;
  doctor:Doctor;
  doctorId:number;
  medicareService:MedicareServices;
  constructor(private route:ActivatedRoute,private router:Router,private doctorService:DoctorService) { }

  ngOnInit() {
    this.doctorEditForm=new FormGroup({
     // 'username': new FormControl(null, [Validators.required,Validators.pattern('^[a-zA-Z0-9]+$'), Validators.maxLength(50)]),
      'firstname': new FormControl(null, [Validators.required,Validators.pattern('^[a-zA-Z0-9]+$'), Validators.maxLength(50)]),
      'lastname': new FormControl(null, [Validators.required,Validators.pattern('^[a-zA-Z0-9]+$'), Validators.maxLength(50)]),
      'age': new FormControl(null, [Validators.required,Validators.pattern('^[0-9]+$'), Validators.maxLength(2)]),
      'gender': new FormControl(null, [Validators.required, Validators.maxLength(10)]),
      'dateOfBirth': new FormControl(null, [Validators.required]),
      'contactNo': new FormControl(null,[Validators.required, Validators.pattern('^[0-9]+$'), Validators.maxLength(10),Validators.minLength(10)]),
      'altContactNo': new FormControl(null, [Validators.pattern('^[0-9]+$'),Validators.maxLength(10),Validators.minLength(10)]),
      'email': new FormControl(null, [Validators.required,Validators.email,Validators.maxLength(50)]),
      'password': new FormControl(null, [Validators.required,Validators.maxLength(15)]),
      'address1': new FormControl(null, [Validators.required,Validators.maxLength(100)]),
      'address2': new FormControl(null, [Validators.maxLength(100)]),
      'city': new FormControl(null, [Validators.required,Validators.maxLength(50)]),
      'state': new FormControl(null, [Validators.required,Validators.maxLength(50)]),
      'zipcode': new FormControl(null, [Validators.required,Validators.maxLength(10),Validators.pattern('^[0-9]+$')]),
      'degree': new FormControl(null, [Validators.required,Validators.maxLength(50)]),
      'speciality': new FormControl(null, [Validators.required,Validators.maxLength(50)]),
      'workhours': new FormControl(null, [Validators.required,Validators.maxLength(20)]),
      'hospitalname': new FormControl(null, [Validators.required,Validators.maxLength(100)]),
      'medicareServices':new FormControl(null, [Validators.required, Validators.maxLength(100)]),
      'serviceDescription':new FormControl(null, [Validators.required, Validators.maxLength(200)]),
      'amount':new FormControl(null, [Validators.required, Validators.pattern('^[0-9]+$')]),
    })

    this.route.params.subscribe((params: Params) => {
      const doctorId = params['id'];
      this.doctorId = doctorId;
      this.doctorService.getDoctor(doctorId).subscribe((doctor: Doctor) => {
        doctor.dateOfBirth = new Date(doctor.dateOfBirth)
        if (doctor) {
          console.log(doctor)
          this.doctorEditForm.patchValue({
            firstname:doctor.firstName,
            lastname:doctor.lastName,
            age:doctor.age,
            gender:doctor.gender==="male"?true:false,
            dateOfBirth: doctor.dateOfBirth.toISOString().slice(0, 10),
            contactNo:doctor.contactNo,
            altContactNo:doctor.altContactNo,
            email:doctor.email,
            password:doctor.password,
            address1:doctor.address1,
            address2:doctor.address2,
            city:doctor.city,
            state:doctor.state,
            zipcode:doctor.zipCode,
            degree:doctor.degree,
            speciality:doctor.speciality,
            workhours:doctor.workHours,
            hospitalname:doctor.hospitalName,
            medicareServices:doctor.medicareServices.medicareService,
            serviceDescription:doctor.medicareServices.serviceDescription,
            amount:doctor.medicareServices.amount

          });
        } else {
          this.router.navigate(['']);
        }
      });
    })
  }

  onSubmitEditDoctor() {
    console.log(this.doctorEditForm);
    this.medicareService={
      medicareService:this.doctorEditForm.get('medicareServices').value,
      serviceDescription:this.doctorEditForm.get('serviceDescription').value,
      amount:this.doctorEditForm.get('amount').value,
    }
    this.doctor = {
      id:this.doctorId,
      firstName:this.doctorEditForm.value.firstname,
      lastName:this.doctorEditForm.value.lastname,
      age:this.doctorEditForm.value.age,
      gender:this.doctorEditForm.value.gender===true?"male":"female",
      dateOfBirth:this.doctorEditForm.value.dateOfBirth,
      contactNo:this.doctorEditForm.value.contactNo,
      altContactNo:this.doctorEditForm.value.altContactNo===""?null:this.doctorEditForm.value.altContactNo,
    // altContactNo:this.doctorEditForm.get('altContactNo').value,
      email:this.doctorEditForm.value.email,
      password:this.doctorEditForm.value.password,
      address1:this.doctorEditForm.value.address1,
      address2:this.doctorEditForm.value.address2,
      city:this.doctorEditForm.value.city,
      state:this.doctorEditForm.value.state,
      zipCode:this.doctorEditForm.value.zipcode,
      degree:this.doctorEditForm.value.degree,
      speciality:this.doctorEditForm.value.speciality,
      workHours:this.doctorEditForm.value.workhours,
      hospitalName:this.doctorEditForm.value.workhours,
      medicareServices:this.medicareService
    }
    console.log(this.doctor)
    this.doctorService.updateDoctor(this.doctor).subscribe();
    this.doctorEdited = true;
  }

  get username(){
    return this.doctorEditForm.get('username');
  }

  get firstname(){
    return this.doctorEditForm.get('firstname');
  }
  get lastname(){
    return this.doctorEditForm.get('lastname');
  }
  get age(){
    return this.doctorEditForm.get('age');
  }
  get gender(){
    return this.doctorEditForm.get('gender');
  }
  get dateOfBirth(){
    return this.doctorEditForm.get('dateOfBirth');
  }

  get contactNo(){
    return this.doctorEditForm.get('contactNo');
  }
  get altContactNo(){
    return this.doctorEditForm.get('altContactNo');
  }
  get email(){
    return this.doctorEditForm.get('email');
  }
  get password(){
    return this.doctorEditForm.get('password');
  }
  
  get address1(){
    return this.doctorEditForm.get('address1');
  }

  get address2(){
    return this.doctorEditForm.get('address2');
  }
  get city(){
    return this.doctorEditForm.get('city');
  }
  get state(){
    return this.doctorEditForm.get('state');
  }
  get zipcode(){
    return this.doctorEditForm.get('zipcode');
  }
  get degree(){
    return this.doctorEditForm.get('degree');
  }
  get speciality(){
    return this.doctorEditForm.get('speciality');
  }
  get workhours(){
    return this.doctorEditForm.get('workhours');
  }
  get hospitalname(){
    return this.doctorEditForm.get('hospitalname');
  }
  get medicareServices() {
    return this.doctorEditForm.get('medicareServices');
  }

  get serviceDescription() {
    return this.doctorEditForm.get('serviceDescription');
  }
  get amount() {
    return this.doctorEditForm.get('amount');
  }
  }


