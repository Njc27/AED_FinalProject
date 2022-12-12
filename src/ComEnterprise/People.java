/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ComEnterprise;

import HospitalEnterprise.EncounterHistory;
import java.util.Date;

/**
 *
 * @author namithajc
 */
public class People {
    String name;
    String id;
    String gender;
    Date Dob;
    String phone;
    String email;
    House house;
    EncounterHistory encounterHistory;
    LoginInfo loginInfo;
    boolean communityAdmin =false;
    boolean hospitalAdmin = false;
    boolean doctor = false;

    public People(String name, String id, String gender, Date Dob, String phone, String email, House house, EncounterHistory encounterHistory, LoginInfo loginInfo) {
        this.name = name;
        this.id = id;
        this.gender = gender;
        this.Dob = Dob;
        this.phone = phone;
        this.email = email;
        this.house = house;
        this.encounterHistory = encounterHistory;
        this.loginInfo = loginInfo;
    }

    public boolean isDoctor() {
        return doctor;
    }

    public void setDoctor(boolean doctor) {
        this.doctor = doctor;
    }
    public boolean isCommunityAdmin() {
        return communityAdmin;
    }

    public void setCommunityAdmin(boolean communityAdmin) {
        this.communityAdmin = communityAdmin;
    }

    public boolean isHospitalAdmin() {
        return hospitalAdmin;
    }

    public void setHospitalAdmin(boolean hospitalAdmin) {
        this.hospitalAdmin = hospitalAdmin;
    }
    
    public EncounterHistory getEncounterHistory() {
        return encounterHistory;
    }
    
    public People(){
        
    }

    public LoginInfo getLoginInfo() {
        return loginInfo;
    }

    public void setLoginInfo(LoginInfo loginInfo) {
        this.loginInfo = loginInfo;
    }
    
    public void setEncounterHistory(EncounterHistory encounterHistory) {
        this.encounterHistory = encounterHistory;
    }

    public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
    }
    
    public boolean isBloodpressure() {
        if(encounterHistory==null||encounterHistory.getEncounterHistory()==null||encounterHistory.getEncounterHistory().size()==0){
            return false;
        }
        int size=encounterHistory.getEncounterHistory().size();
        if(encounterHistory.getEncounterHistory().get(size-1).getVitalsigns().getBloodpressure()>140){
            return true;
        }else{
            return false;
        }
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getDob() {
        return Dob;
    }

    public void setDob(Date Dob) {
        this.Dob = Dob;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "People{" + "name=" + name + ", id=" + id + ", gender=" + gender + ", Dob=" + Dob + ", phone=" + phone + ", email=" + email + ", house=" + house + ", encounterHistory=" + encounterHistory + ", loginInfo=" + loginInfo + ", communityAdmin=" + communityAdmin + ", hospitalAdmin=" + hospitalAdmin + '}';
    }

   
   
}
