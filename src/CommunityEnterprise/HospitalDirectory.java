/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CommunityEnterprise;

import java.util.ArrayList;

/**
 *
 * @author namithajc
 */
public class HospitalDirectory extends Hospital{
    ArrayList<Hospital> hospitalList;

    public HospitalDirectory() {
        hospitalList = new ArrayList();
    }
    
    public void addHospital(Hospital h){
        hospitalList.add(h);
    }
    
    public void removeHospital(Hospital h){
        hospitalList.remove(h);
    }

    @Override
    public String toString() {
        return "HospitalDirectory{" + "hospitalList=" + hospitalList + '}';
    }
    
    
}
