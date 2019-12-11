export interface Patient {
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
}