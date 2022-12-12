/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HospitalEnterprise;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author namithajc
 */
public class HospitalCatalouge {
    private ArrayList<Hospital> hospitalCataloug;
    
    public HospitalCatalouge() {
        hospitalCataloug = new ArrayList<Hospital>();
    }
    
    public void addHospital(Hospital h) {
        hospitalCataloug.add(h);
    }

    @Override
    public String toString() {
        return "HospitalCataloug{" + "hospitalCataloug=" + hospitalCataloug + '}';
    }

    public int size() {
        return hospitalCataloug.size();
    }

    public Hospital get(int i) {
        return hospitalCataloug.get(i);
    }

    public Hospital searchHospital(String key) {
        for (Hospital hospital : hospitalCataloug) {
            if (hospital.getHospitalName().equals(key)) {
                return hospital;
            }
        }
        return null;
    }
    
    public void removeHospital(String key){
        for(int i =0;i<hospitalCataloug.size();i++ ){
            if(hospitalCataloug.get(i).getHospitalName().equalsIgnoreCase(key)){
                hospitalCataloug.remove(i);
                break;
            }
        }
    } 
}
