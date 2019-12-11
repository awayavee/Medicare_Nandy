import { User } from './user.model';
import { Doctor } from './doctor.model';

export interface Appointment {
    patientFirstName: string;
    patientLastName: string;
    appointmentDate: Date;
    status: number;
    disease: string;
    doctor: Doctor;
    user: User
}