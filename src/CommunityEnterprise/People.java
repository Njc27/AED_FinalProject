/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CommunityEnterprise;

/**
 *
 * @author namithajc
 */
public class People extends LoginCredentials{
    
    String ssn;
    String firstName;
    String lastName;
    String emailId;
    String phoneNo;
    String addressLine1;
    String addressLine2;
    String community;
    String city;
    String zipCode;
    boolean systemAdmin;
    boolean communityAdmin;
    boolean hospitalAdmin;
    boolean emergencyAdmin;
    LoginCredentials loginCredentials;

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

    public boolean isSystemAdmin() {
        return systemAdmin;
    }

    public void setSystemAdmin(boolean systemAdmin) {
        this.systemAdmin = systemAdmin;
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

    public boolean isEmergencyAdmin() {
        return emergencyAdmin;
    }

    public void setEmergencyAdmin(boolean emergencyAdmin) {
        this.emergencyAdmin = emergencyAdmin;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public People(String ssn, String firstName, String lastName, String emailId, String phoneNo, String addressLine1, String addressLine2, String community, String city, String zipCode, boolean systemAdmin, boolean communityAdmin, boolean hospitalAdmin, boolean emergencyAdmin, LoginCredentials loginCredentials) {
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
        this.systemAdmin = systemAdmin;
        this.communityAdmin = communityAdmin;
        this.hospitalAdmin = hospitalAdmin;
        this.emergencyAdmin = emergencyAdmin;
        this.loginCredentials = loginCredentials;
    }

    

    public People() {
    }

    @Override
    public String toString() {
        return "People{" + "ssn=" + ssn + ", firstName=" + firstName + ", lastName=" + lastName + ", emailId=" + emailId + ", phoneNo=" + phoneNo + ", addressLine1=" + addressLine1 + ", addressLine2=" + addressLine2 + ", community=" + community + ", city=" + city + ", zipCode=" + zipCode + ", systemAdmin=" + systemAdmin + ", communityAdmin=" + communityAdmin + ", hospitalAdmin=" + hospitalAdmin + ", emergencyAdmin=" + emergencyAdmin + ", loginCredentials=" + loginCredentials + '}';
    }
    

  
    
}
