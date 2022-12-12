/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TheBusiness.Insurance;
import HospitalEnterprise.Patient;

/**
 *
 * @author banishmg
 */
public class InsurancePlan {
    private String planName;
    private String companyName;
    private String planValidity;
    private String premiumAmt;
    private Patient patient;
    

    public String getPlanName() {
        return planName;
    }

    @Override
    public String toString() {
        return planName;
    }

    public void setPlanName(String planName) {
        this.planName = planName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getPlanValidity() {
        return planValidity;
    }

    public void setPlanValidity(String planValidity) {
        this.planValidity = planValidity;
    }

    public String getPremiumAmt() {
        return premiumAmt;
    }

    public void setPremiumAmt(String premiumAmt) {
        this.premiumAmt = premiumAmt;
    }
    
    
}
