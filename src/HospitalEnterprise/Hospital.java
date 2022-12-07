/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HospitalEnterprise;

import CommunityEnterprise.Community;

/**
 *
 * @author namithajc
 */
public class Hospital {
    String name;
    Community community;
    String city;
    int zipCode;
    DoctorDirectory doctorDirectory;
    PatientDirectory patientDirectory;
    
    public Hospital(){
         doctorDirectory = new DoctorDirectory();
         patientDirectory = new PatientDirectory();
    }
    
    public Hospital(String name, Community community, String city, int zipCode, DoctorDirectory doctorDirectory, PatientDirectory patientDirectory) {
        this.name = name;
        this.community = community;
        this.city = city;
        this.zipCode = zipCode;
        this.doctorDirectory = doctorDirectory;
        this.patientDirectory = patientDirectory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Community getCommunity() {
        return community;
    }

    public void setCommunity(Community community) {
        this.community = community;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public DoctorDirectory getDoctorDirectory() {
        return doctorDirectory;
    }

    public void setDoctorDirectory(DoctorDirectory doctorDirectory) {
        this.doctorDirectory = doctorDirectory;
    }

    public PatientDirectory getPatientDirectory() {
        return patientDirectory;
    }

    public void setPatientDirectory(PatientDirectory patientDirectory) {
        this.patientDirectory = patientDirectory;
    }
    
     @Override
    public String toString() {
        return "Hospital{" + "hospitalName=" + name + ", Community=" + community + ", City=" + city + ", ZipCode=" + zipCode + ", doctorDirectory=" + doctorDirectory + ", patientDirectory=" + patientDirectory + '}';
    }
     
}
