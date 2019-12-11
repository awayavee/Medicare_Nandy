import { Admin } from './admin.model';
import { Patient } from './patient.model';
import { Doctor } from './doctor.model';
import { Agent } from './agent.model';

export interface User {
    username: string;
    password: string;
    status?:boolean;
    admin?:Admin;
    patient?:Patient;
    doctor?:Doctor;
    agent?:Agent
    
}