/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HospitalEnterprise;

import ComEnterprise.People;
import java.util.Date;
import java.util.HashMap;

/**
 *
 * @author namithajc
 */
public class Doctor {
    People person;
    private String specialization;
    private PatientCatalouge patientCatalouge;
    private AppointmentsCatalouge appointmentCatalouge;

    public Doctor(People person, String specialization, PatientCatalouge patientCatalouge,AppointmentsCatalouge appointmentsCatalouge) {
        this.person = person;
        this.specialization = specialization;
        this.patientCatalouge = patientCatalouge;
        this.appointmentCatalouge  = appointmentsCatalouge;
    }

    public AppointmentsCatalouge getAppointmentCatalouge() {
        return appointmentCatalouge;
    }

    public void setAppointmentCatalouge(AppointmentsCatalouge appointmentCatalouge) {
        this.appointmentCatalouge = appointmentCatalouge;
    }

    public People getPerson() {
        return person;
    }

    public void setPerson(People person) {
        this.person = person;
    }
    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
    public PatientCatalouge getPatientCatalouge() {
        return patientCatalouge;
    }

    public void setPatientCatalouge(PatientCatalouge patientCatalouge) {
        this.patientCatalouge = patientCatalouge;
    }

    public Doctor() {
    }

    @Override
    public String toString() {
        return "Doctor{" + "person=" + person + ", specialization=" + specialization + ", patientCatalouge=" + patientCatalouge + ", appointmentCatalouge=" + appointmentCatalouge + '}';
    }


   
}
