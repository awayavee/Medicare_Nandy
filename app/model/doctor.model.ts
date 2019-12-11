import { MedicareServices } from './medicareservices.model';

export interface Doctor {
    id?:number;
    firstName: string;
    lastName: string;
    age: number;
    gender: string;
    dateOfBirth: Date;
    contactNo: string;
    altContactNo?: string;
    email: string;
    password: string;
    address1: string;
    address2?: string;
    city: string;
    state: string;
    zipCode: string;
    degree: string;
    speciality: string;
    workHours: string;
    hospitalName: string;
    medicareServices:MedicareServices
}