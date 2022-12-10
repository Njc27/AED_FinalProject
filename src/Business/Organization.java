/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import CommunityEnterprise.CityDirectory;
import CommunityEnterprise.EventDirectory;
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
    PatientDirectory patientDirectory;
    EventDirectory eventDirectory;

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

    

    public PatientDirectory getPatientDirectory() {
        return patientDirectory;
    }

    public void setPatientDirectory(PatientDirectory patientDirectory) {
        this.patientDirectory = patientDirectory;
    }

    public EventDirectory getEventDirectory() {
        return eventDirectory;
    }

    public void setEventDirectory(EventDirectory eventdirectory) {
        this.eventDirectory = eventdirectory;
    }
    
    
    @Override
    public String toString() {
        return "Organization{" + "commDirectory=" + cityDirectory + ", hospDirectory=" + ", peopleDirectory=" + peopleDirectory + '}';
    }
    

   
    
    
    
    
}
