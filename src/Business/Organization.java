/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import CommunityEnterprise.CityDirectory;
import HospitalEnterprise.HospitalDirectory;
import CommunityEnterprise.PeopleDirectory;
import HospitalEnterprise.PatientDirectory;

/**
 *
 * @author namithajc
 */
public class Organization {
    CityDirectory cityDirectory;
    PeopleDirectory peopleDirectory;
    HospitalDirectory hospitalDirectory;
    PatientDirectory patientDirectory;

    public Organization() {
        cityDirectory = new CityDirectory();
    }
   

    public CityDirectory getCityDirectory() {
        return cityDirectory;
    }

    public void setCityDirectory(CityDirectory cityDirectory) {
        this.cityDirectory = cityDirectory;
    }

    public PeopleDirectory getPeopleDirectory() {
        return peopleDirectory;
    }

    public void setPeopleDirectory(PeopleDirectory peopleDirectory) {
        this.peopleDirectory = peopleDirectory;
    }

    public HospitalDirectory getHospitalDirectory() {
        return hospitalDirectory;
    }

    public void setHospitalDirectory(HospitalDirectory hospitalDirectory) {
        this.hospitalDirectory = hospitalDirectory;
    }

    public PatientDirectory getPatientDirectory() {
        return patientDirectory;
    }

    public void setPatientDirectory(PatientDirectory patientDirectory) {
        this.patientDirectory = patientDirectory;
    }
    
    @Override
    public String toString() {
        return "Organization{" + "commDirectory=" + cityDirectory + ", hospDirectory=" + ", peopleDirectory=" + peopleDirectory + '}';
    }
    

   
    
    
    
    
}
