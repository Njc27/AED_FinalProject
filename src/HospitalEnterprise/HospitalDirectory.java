/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HospitalEnterprise;

import CommunityEnterprise.Community;
import HospitalEnterprise.Hospital;
import java.util.ArrayList;

/**
 *
 * @author namithajc
 */
public class HospitalDirectory {
    ArrayList<Hospital> hospList;

    public HospitalDirectory(ArrayList<Hospital> hospList) {
        this.hospList = hospList;
    }

    public HospitalDirectory() {
        hospList = new ArrayList();
    }
    
    public boolean checkHospital(String communityName){
        for(int i =0;i<hospList.size();i++){
            if(communityName.equalsIgnoreCase(hospList.get(i).getName())){
                return true;
            }
        }
        return false;
    }
    
    public Hospital getHospitalByName(String communityName){
        for(int i =0;i<hospList.size();i++){
            if(communityName.equalsIgnoreCase(hospList.get(i).getName())){
                return hospList.get(i);
            }
        }
        return null;
    }
    public void addHospital(Hospital c){
        hospList.add(c);
    }
    public void removeHospital(Hospital c){
        hospList.remove(c);
    }

    public ArrayList<Hospital> gethospList() {
        return hospList;
    }

    public void sethospList(ArrayList<Hospital> hospList) {
        this.hospList = hospList;
    }
    

    @Override
    public String toString() {
        return "HospitalDirectory{" + "communityList=" + hospList + '}';
    }
}
