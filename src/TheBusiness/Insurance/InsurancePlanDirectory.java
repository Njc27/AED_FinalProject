/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TheBusiness.Insurance;

import java.util.ArrayList;

/**
 *
 * @author banishmg
 */
public class InsurancePlanDirectory {
    private ArrayList<InsurancePlan> InsPlanList;
    
        public InsurancePlanDirectory(){
        this.InsPlanList = new ArrayList<InsurancePlan>();
    }

    public ArrayList<InsurancePlan> getInsPlanList() {
        return InsPlanList;
    }

    public void setInsPlanList(ArrayList<InsurancePlan> InsPlanList) {
        this.InsPlanList = InsPlanList;
    }
    
        public void addNewPlan(InsurancePlan ip){
        InsPlanList.add(ip);
    }
    
    public void deleteplan(InsurancePlan ip){
        InsPlanList.remove(ip);
    }
    
    
}
