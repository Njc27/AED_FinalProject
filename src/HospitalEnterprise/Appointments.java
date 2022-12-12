/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HospitalEnterprise;

import ComEnterprise.People;
import java.util.Date;

/**
 *
 * @author namithajc
 */
public class Appointments {
    
    String appointmentTime;
    Date appointmentDate;
    People patient;

    public String getAppointmentTime() {
        return appointmentTime;
    }

    public void setAppointmentTime(String appointmentTime) {
        this.appointmentTime = appointmentTime;
    }

    public Date getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(Date appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    public People getPatient() {
        return patient;
    }

    public void setPatient(People patient) {
        this.patient = patient;
    }

    @Override
    public String toString() {
        return "Appointments{" + "appointmentTime=" + appointmentTime + ", appointmentDate=" + appointmentDate + ", patient=" + patient + '}';
    }
    
    
}
