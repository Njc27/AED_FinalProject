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
public class DoctorCatalouge {
    
    private ArrayList<Doctor> doctorCataloug;

    public DoctorCatalouge(ArrayList<Doctor> doctorCataloug) {
        this.doctorCataloug = doctorCataloug;
    }
    public DoctorCatalouge(){
        doctorCataloug = new ArrayList<Doctor>();
    }
          
    public ArrayList<Doctor> getDoctorCataloug() {
        return doctorCataloug;
    }

    public void setDoctorCataloug(ArrayList<Doctor> doctorCataloug) {
        this.doctorCataloug = doctorCataloug;
    }
    public void addDoctor(Doctor d){
        doctorCataloug.add(d);
    }

    @Override
    public String toString() {
        return "DoctorCataloug{" + "doctorCataloug=" + doctorCataloug + '}';
    }

    public int size() {
        return doctorCataloug.size();
    }

    public Doctor get(int k) {
        return doctorCataloug.get(k);
    }
    public Doctor searchDoctor(String id){
        for(Doctor doctor:doctorCataloug){
            if(doctor.getPerson().getId().equals(id)){
                return doctor;
            }
        }
        return null;
    }
    public boolean isPresentDoctor(String id){
        for(Doctor doctor:doctorCataloug){
            if(doctor.getPerson().getId().equals(id)){
                return true;
            }
        }
        return false;
    }
    public void removeDoctor(String id){
        for(int i =0;i < doctorCataloug.size();i++){
            if(doctorCataloug.get(i).getPerson().getId().equals(id)){
                doctorCataloug.get(i).getPerson().setDoctor(false);
                doctorCataloug.remove(i);
            }
        }
    }
    

}
