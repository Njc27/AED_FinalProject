/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HospitalEnterprise;

import java.util.ArrayList;

/**
 *
 * @author namithajc
 */
public class AppointmentsDirectory extends Appointments {
     ArrayList<Appointments> appointmentDir;
     
      public AppointmentsDirectory(ArrayList<Appointments> appLappointmentDirist) {
        this.appointmentDir = appointmentDir;
    }

    public AppointmentsDirectory() {
        appointmentDir = new ArrayList();
    }

    public ArrayList<Appointments> getAppointmentCatalouge() {
        return appointmentDir;
    }

    public void setAppointmentCatalouge(ArrayList<Appointments> appointmentDir) {
        this.appointmentDir = appointmentDir;
    }
    
    public Appointments addAppointment(){
         Appointments c = new Appointments();
        appointmentDir.add(c);
        return c;
    }
    
    public void addAppointment(Appointments a){
        appointmentDir.add(a);
    }
    
    public Patient searchPatient(String id) {
        for(Appointments appointments:appointmentDir){
            if(appointments.getPatient().getSsn().equals(id)){
                return appointments.getPatient();
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "AppointmentsCatalouge{" + "appointmentDir=" + appointmentDir + '}';
    }

    public int size() {
        return appointmentDir.size();
    }
}
