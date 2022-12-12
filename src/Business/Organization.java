/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import CommunityEnterprise.CityDirectory;
import CommunityEnterprise.EventDirectory;
//import HospitalEnterprise.HospitalDirectory;
import CommunityEnterprise.PeopleDirectory;
//import ComEnterprise.PeopleCatalouge;
import HospitalEnterprise.PatientCatalouge;
import TheBusiness.EmergencyAdmin.EmergencySoSDirectory;
import TheBusiness.Insurance.InsurancePlanDirectory;

/**
 *
 * @author namithajc
 */
public class Organization {

    public static Organization system;
    //CityDirectory cityDirectory;
    PeopleDirectory peopleDirectory;
//    PatientCatalouge patientDirectory;
//    EventDirectory eventDirectory;
    InsurancePlanDirectory insPlanDirectory;
    EmergencySoSDirectory EmgSoSList;
    GoogleMapsLocation mapsLocation;

    public Organization() {
//        cityDirectory = new CityDirectory();
        insPlanDirectory = new InsurancePlanDirectory();
        EmgSoSList = new EmergencySoSDirectory();
        mapsLocation = new GoogleMapsLocation();
    }

    public GoogleMapsLocation getMapsLocation() {
        return mapsLocation;
    }

    public void setMapsLocation(GoogleMapsLocation mapsLocation) {
        this.mapsLocation = mapsLocation;
    }

    public InsurancePlanDirectory getInsPlanDirectory() {
        return insPlanDirectory;
    }

    public EmergencySoSDirectory getEmgSoSList() {
        return EmgSoSList;
    }

    public void setEmgSoSList(EmergencySoSDirectory EmgSoSList) {
        this.EmgSoSList = EmgSoSList;
    }

    public void setInsPlanDirectory(InsurancePlanDirectory insPlanDirectory) {
        this.insPlanDirectory = insPlanDirectory;
    }
//
//    public CityDirectory getCityDirectory() {
//        return cityDirectory;
//    }
//
//    public void setCityDirectory(CityDirectory cityDirectory) {
//        this.cityDirectory = cityDirectory;
//    }

    public PeopleDirectory getPeopleDirectory() {
        return peopleDirectory;
    }

    public void setPeopleDirectory(PeopleDirectory peopleDirectory) {
        this.peopleDirectory = peopleDirectory;
    }

//    public PatientCatalouge getPatientDirectory() {
//        return patientDirectory;
//    }

//    public void setPatientDirectory(PatientCatalouge patientDirectory) {
//        this.patientDirectory = patientDirectory;
//    }
//
//    public EventDirectory getEventDirectory() {
//        return eventDirectory;
//    }
//
//    public void setEventDirectory(EventDirectory eventdirectory) {
//        this.eventDirectory = eventdirectory;
//    }

    public static Organization getInstance() {
        if (system == null) {
            system = new Organization();
            return system;
        }
        return system;
    }

    @Override
    public String toString() {
        return "Organization{" + "peopleDirectory=" + peopleDirectory + ", insPlanDirectory=" + insPlanDirectory + ", EmgSoSList=" + EmgSoSList + ", mapsLocation=" + mapsLocation + '}';
    }



}
