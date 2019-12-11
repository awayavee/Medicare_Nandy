import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, Validators } from '@angular/forms';
import { UserService } from 'src/app/services/user.service';
import { AuthService } from 'src/app/services/auth.service';
import { Doctor } from 'src/app/model/doctor.model';
import { User } from 'src/app/model/user.model';
import { MedicareServices } from 'src/app/model/medicareservices.model';

@Component({
  selector: 'app-doctor-signup',
  templateUrl: './doctor-signup.component.html',
  styleUrls: ['./doctor-signup.component.css']
})
export class DoctorSignupComponent implements OnInit {

  doctorRegisterForm: FormGroup;
  /*
  userNameTaken:boolean = false;
  userNameEmpty:boolean = true;
  submitStatus: boolean = false;
  signupForm: FormGroup;
  alreadyExist: boolean = false;
  */
  alreadyExist: boolean;
  error: string;
  submitStatus: boolean;
  user: User;
  newDoctor: Doctor;
  medicareService:MedicareServices;
  constructor(private userService: UserService, private authService: AuthService) { }

  ngOnInit() {

    this.doctorRegisterForm = new FormGroup({
      'username': new FormControl(null, [Validators.required, Validators.pattern('^[a-zA-Z0-9]+$'), Validators.maxLength(50)]),
      'firstname': new FormControl(null, [Validators.required, Validators.pattern('^[a-zA-Z0-9]+$'), Validators.maxLength(50)]),
      'lastname': new FormControl(null, [Validators.required, Validators.pattern('^[a-zA-Z0-9]+$'), Validators.maxLength(50)]),
      'age': new FormControl(null, [Validators.required, Validators.pattern('^[0-9]+$'), Validators.maxLength(2)]),
      'gender': new FormControl(null, [Validators.required, Validators.maxLength(10)]),
      'dateOfBirth': new FormControl(null, [Validators.required]),
      'contactNo': new FormControl(null, [Validators.required, Validators.pattern('^[0-9]+$'), Validators.maxLength(10), Validators.minLength(10)]),
      'altContactNo': new FormControl(null, [Validators.pattern('^[0-9]+$'), Validators.maxLength(10), Validators.minLength(10)]),
      'email': new FormControl(null, [Validators.required, Validators.email, Validators.maxLength(50)]),
      'password': new FormControl(null, [Validators.required, Validators.maxLength(15)]),
      'address1': new FormControl(null, [Validators.required, Validators.maxLength(100)]),
      'address2': new FormControl(null, [Validators.maxLength(100)]),
      'city': new FormControl(null, [Validators.required, Validators.maxLength(50)]),
      'state': new FormControl(null, [Validators.required, Validators.maxLength(50)]),
      'zipcode': new FormControl(null, [Validators.required, Validators.maxLength(10), Validators.pattern('^[0-9]+$')]),
      'degree': new FormControl(null, [Validators.required, Validators.maxLength(50)]),
      'speciality': new FormControl(null, [Validators.required, Validators.maxLength(50)]),
      'workhours': new FormControl(null, [Validators.required, Validators.maxLength(20)]),
      'hospitalname': new FormControl(null, [Validators.required, Validators.maxLength(100)]),
      'medicareServices':new FormControl(null, [Validators.required, Validators.maxLength(100)]),
      'serviceDescription':new FormControl(null, [Validators.required, Validators.maxLength(200)]),
      'amount':new FormControl(null, [Validators.required, Validators.pattern('^[0-9]+$')]),
    })
    console.log(this.doctorRegisterForm.get('firstname'));
  }

  // onSignUpSubmit(){
  //  console.log("helllo signup");
  //  console.log(this.doctorRegisterForm.value['firstname']);

  //  this.submitStatus = true;

  /*
    let doctor:Doctor;
    let user:User;
  
    user={
      username: this.doctorRegisterForm.get('username').value,
      firstname: this.doctorRegisterForm.get('firstname').value,
      lastname: this.doctorRegisterForm.get('lastname').value,
      password: this.doctorRegisterForm.get('password').value,
      doctor:{
        username: this.doctorRegisterForm.get('username').value,
        firstname: this.doctorRegisterForm.get('firstname').value,
        lastname: this.doctorRegisterForm.get('lastname').value,
        age:this.doctorRegisterForm.get('age').value,
        gender:this.doctorRegisterForm.get('gender').value,
        dateOfBirth:this.doctorRegisterForm.get('dateOfBirth').value,
        contactNo:this.doctorRegisterForm.get('contactNo').value,
        altContactNo:this.doctorRegisterForm.get('altContactNo').value,
        email:this.doctorRegisterForm.get('email').value,
        password: this.doctorRegisterForm.get('password').value,
        address1:this.doctorRegisterForm.get('address1').value,
        address2:this.doctorRegisterForm.get('address2').value,
        city:this.doctorRegisterForm.get('city').value,
        state:this.doctorRegisterForm.get('state').value,
        zipcode:this.doctorRegisterForm.get('zipcode').value,
        degree:this.doctorRegisterForm.get('degree').value,
        speciality:this.doctorRegisterForm.get('speciality').value,
        workhours:this.doctorRegisterForm.get('workhours').value,
        hospitalname:this.doctorRegisterForm.get('hospitalname').value


    
      }  
    }

    */

  /*
  console.log(this.user);
 
  
  this.userService.authenticate(this.user).subscribe(null, (error) => {
    this.alreadyExist = (error['error']['status'] == 400) ? true : false
 
    if (this.alreadyExist) {
      this.submitStatus = false;
      return;
    }
  })
  this.authService.userAuthenticated.username = this.user.username;
  this.doctorRegisterForm.reset();
  }
 
  userTaken(){
    let username = this.signupForm.get('username').value
    if(username.length==0){
      return;
    }
    this.userService.userAvailable(username).subscribe((data=>{
      
      if(username.length == 0){
        this.userNameEmpty = true;
      }
      else{
        this.userNameEmpty = false;
      }
      this.userNameTaken= data;  
  
    }))
  }

*/

  get username() {
    return this.doctorRegisterForm.get('username');
  }

  get firstname() {
    return this.doctorRegisterForm.get('firstname');
  }
  get lastname() {
    return this.doctorRegisterForm.get('lastname');
  }
  get age() {
    return this.doctorRegisterForm.get('age');
  }
  get gender() {
    return this.doctorRegisterForm.get('gender');
  }
  get dateOfBirth() {
    return this.doctorRegisterForm.get('dateOfBirth');
  }

  get contactNo() {
    return this.doctorRegisterForm.get('contactNo');
  }
  get altContactNo() {
    return this.doctorRegisterForm.get('altContactNo');
  }
  get email() {
    return this.doctorRegisterForm.get('email');
  }
  get password() {
    return this.doctorRegisterForm.get('password');
  }

  get address1() {
    return this.doctorRegisterForm.get('address1');
  }

  get address2() {
    return this.doctorRegisterForm.get('address2');
  }
  get city() {
    return this.doctorRegisterForm.get('city');
  }
  get state() {
    return this.doctorRegisterForm.get('state');
  }
  get zipcode() {
    return this.doctorRegisterForm.get('zipcode');
  }
  get degree() {
    return this.doctorRegisterForm.get('degree');
  }
  get speciality() {
    return this.doctorRegisterForm.get('speciality');
  }
  get workhours() {
    return this.doctorRegisterForm.get('workhours');
  }
  get hospitalname() {
    return this.doctorRegisterForm.get('hospitalname');
  }

  get medicareServices() {
    return this.doctorRegisterForm.get('medicareServices');
  }

  get serviceDescription() {
    return this.doctorRegisterForm.get('serviceDescription');
  }
  get amount() {
    return this.doctorRegisterForm.get('amount');
  }
  onSignUpSubmit() {
    // console.log("helllo Admin signup");
    //console.log(this.adminRegisterForm.value['firstname']);
    this.medicareService={
      medicareService:this.doctorRegisterForm.get('medicareServices').value,
      serviceDescription:this.doctorRegisterForm.get('serviceDescription').value,
      amount:this.doctorRegisterForm.get('amount').value,
    }
    this.newDoctor = {
      firstName: this.doctorRegisterForm.get('firstname').value,
      lastName: this.doctorRegisterForm.get('lastname').value,
      age: this.doctorRegisterForm.get('age').value,
      gender: this.doctorRegisterForm.get('gender').value===true?"male":"female",
      dateOfBirth: this.doctorRegisterForm.get('dateOfBirth').value,
      contactNo: this.doctorRegisterForm.get('contactNo').value,
      altContactNo: this.doctorRegisterForm.get('altContactNo').value,
      email: this.doctorRegisterForm.get('email').value,
      password: this.doctorRegisterForm.get('password').value,
      address1: this.doctorRegisterForm.get('address1').value,
      address2: this.doctorRegisterForm.get('address2').value,
      city: this.doctorRegisterForm.get('city').value,
      state: this.doctorRegisterForm.get('state').value,
      zipCode: this.doctorRegisterForm.get('zipcode').value,
      degree: this.doctorRegisterForm.get('degree').value,
      speciality: this.doctorRegisterForm.get('speciality').value,
      workHours: this.doctorRegisterForm.get('workhours').value,
      hospitalName: this.doctorRegisterForm.get('hospitalname').value,
      medicareServices:this.medicareService
    }
    this.user = {
      username: this.doctorRegisterForm.get('username').value,
      password: this.doctorRegisterForm.get('password').value,
      doctor: this.newDoctor
    }
    console.log(this.user);

    this.userService.addUser(this.user).subscribe((data) => {
      // this.router.navigate(['/login']);
      this.submitStatus = true;
      this.alreadyExist = false;
      this.doctorRegisterForm.reset();
    },
      error => {
        this.error = error.error.message;
        if (error.error.message === 'User Already Exists')
          this.alreadyExist = true;
      });


  }

}