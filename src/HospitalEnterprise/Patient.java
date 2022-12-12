/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HospitalEnterprise;

import ComEnterprise.LoginCredentials;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author namitahjc
 */
public class Patient extends LoginCredentials{
    String ssn;
    String firstName;
    String lastName;
    String emailId;
    String phoneNo;
    //String gender;
    String addressLine1;
    String addressLine2;
    String community;
    String hospital;
    String city;
    String zipCode;
    Date dob;
    String gender;
    LoginCredentials loginCredentials;
    EncounterHistory encHistory;

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public String getCommunity() {
        return community;
    }

    public void setCommunity(String community) {
        this.community = community;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public LoginCredentials getLoginCredentials() {
        return loginCredentials;
    }

    public void setLoginCredentials(LoginCredentials loginCredentials) {
        this.loginCredentials = loginCredentials;
    }

    public String getHospital() {
        return hospital;
    }

    public void setHospital(String hospital) {
        this.hospital = hospital;
    }

    public EncounterHistory getEncHistory() {
        return encHistory;
    }

    public void setEncHistory(EncounterHistory encHistory) {
        this.encHistory = encHistory;
    }
    
    
    
    public Date StringToDate(String s){

    Date result = null;
    try{
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        result  = dateFormat.parse(s);
    }
    catch(ParseException e){
        e.printStackTrace();

    }
    return result ;
}
    
    
    public Patient(String ssn, String firstName, String lastName, String emailId, String phoneNo, String addressLine1, String addressLine2, String community, String hospital, String city, String zipCode,String gender,Date Dob, LoginCredentials loginCredentials) {
        this.ssn = ssn;
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailId = emailId;
        this.phoneNo = phoneNo;
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.community = community;
        this.city = city;
        this.zipCode = zipCode;
        this.hospital = hospital;
        this.gender = gender;
        this.dob = dob;
        this.loginCredentials = loginCredentials;
    }

    

    public Patient() {
    }

    @Override
    public String toString() {
        return "People{" + "ssn=" + ssn + ", firstName=" + firstName + ", lastName=" + lastName + ", emailId=" + emailId + ", phoneNo=" + phoneNo + ", addressLine1=" + addressLine1 + ", addressLine2=" + addressLine2 + ", community=" + community + ", city=" + city + ", zipCode=" + zipCode + ", loginCredentials=" + loginCredentials + '}';
    }
}
