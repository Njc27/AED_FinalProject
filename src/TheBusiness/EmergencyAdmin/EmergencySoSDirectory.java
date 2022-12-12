/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TheBusiness.EmergencyAdmin;

import TheBusiness.Insurance.InsurancePlan;
import java.util.ArrayList;

/**
 *
 * @author banishmg
 */
public class EmergencySoSDirectory {
    private ArrayList<EmergencySoS> EmgSoSList;
    
    public EmergencySoSDirectory(){
        this.EmgSoSList = new ArrayList<EmergencySoS>();
    }

    public ArrayList<EmergencySoS> getEmgSoSList() {
        return EmgSoSList;
    }

    public void setEmgSoSList(ArrayList<EmergencySoS> EmgSoSList) {
        this.EmgSoSList = EmgSoSList;
    }
    
    public void addNewSoS(EmergencySoS SoS){
        EmgSoSList.add(SoS);
    }
    
    public void deleteSoS(EmergencySoS SoS){
        EmgSoSList.remove(SoS);
    }
    
    
}
