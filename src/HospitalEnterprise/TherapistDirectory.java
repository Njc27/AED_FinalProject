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
public class TherapistDirectory extends Therapist{
    ArrayList<Therapist> therapistList;

    public TherapistDirectory() {
        therapistList = new ArrayList();
    }

    public ArrayList<Therapist> getTherapistList() {
        return therapistList;
    }

    public void setTherapistList(ArrayList<Therapist> therapistList) {
        this.therapistList = therapistList;
    }

    
    public boolean checkifPresentBySSn(String ssn){
        for(int i = 0;i < therapistList.size();i++){
            if(therapistList.get(i).getSsn().equalsIgnoreCase(ssn)){
             return true;       
        }
    }
        return false;
    }

    @Override
    public String toString() {
        return "TherapistDirectory{" + "therapistList=" + therapistList + '}';
    }
    
    

    
}
