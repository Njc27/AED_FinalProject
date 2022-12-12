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
public class PatientCatalouge {
    private ArrayList<People> patientCatalouge;
   
    public People findPatient(String id){
        for(int i = 0 ; i< patientCatalouge.size();i++){
            if(patientCatalouge.get(i).getId().equals(id)){
                return patientCatalouge.get(i);
            }
        }
        return null;
    }
    
    public void addPatient(People p){
        patientCatalouge.add(p);
    }

    public PatientCatalouge(ArrayList<People> patientCatalouge) {
        this.patientCatalouge = patientCatalouge;
    }

    public PatientCatalouge() {
        patientCatalouge = new ArrayList<People>();
    }
    
    

    @Override
    public String toString() {
        return "PatientCatalouge{" + "patientCatalouge=" + patientCatalouge + '}';
    }

    public int size() {
        return patientCatalouge.size();
    }
    public People get(int index){
        return patientCatalouge.get(index);
    }

    public boolean checkExisting(String id) {
        for(People patient:patientCatalouge){
            if(patient.getId().equalsIgnoreCase(id)){
                return true;
            }
        }
        return false;
    }
    
    public void removePatient(String id){
         for(int i =0 ;i <patientCatalouge.size();i++){
             if(patientCatalouge.get(i).getId().equalsIgnoreCase(id)){
                patientCatalouge.remove(i);
            }
         }
    
    }
    
    
}
