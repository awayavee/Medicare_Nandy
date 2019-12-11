export interface Admin {
    id?:number;
    firstName: string;
    lastName: string;
    age: number;
    gender: string;
    dateOfBirth: Date;
    contactNo: string;
    altContactNo?: string;
    email: string;
    password: string
}