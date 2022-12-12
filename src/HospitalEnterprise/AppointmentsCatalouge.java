/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HospitalEnterprise;

import ComEnterprise.People;
import java.util.ArrayList;

/**
 *
 * @author namithajc
 */

public class AppointmentsCatalouge {
    ArrayList<Appointments> appointmentCatalouge;
    
    
        public AppointmentsCatalouge() {
        appointmentCatalouge = new ArrayList<Appointments>();
    }


    public ArrayList<Appointments> getAppointmentCatalouge() {
        return appointmentCatalouge;
    }

    public void setAppointmentCatalouge(ArrayList<Appointments> appointmentCatalouge) {
        this.appointmentCatalouge = appointmentCatalouge;
    }
    
    public Appointments addAppointment(){
         Appointments c = new Appointments();
        appointmentCatalouge.add(c);
        return c;
    }
    
    public void addAppointment(Appointments a){
        appointmentCatalouge.add(a);
    }
    
    public People searchPatient(String id) {
        for(Appointments appointments:appointmentCatalouge){
            if(appointments.getPatient().getId().equals(id)){
                return appointments.getPatient();
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "AppointmentsCatalouge{" + "appointmentCatalouge=" + appointmentCatalouge + '}';
    }

    public int size() {
        return appointmentCatalouge.size();
    }
    
    
}
