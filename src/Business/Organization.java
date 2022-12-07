/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import CommunityEnterprise.CommunityDirectory;
import HospitalEnterprise.HospitalDirectory;
import CommunityEnterprise.PeopleDirectory;

/**
 *
 * @author namithajc
 */
public class Organization {
    
    CommunityDirectory commDirectory;
    HospitalDirectory hospDirectory;
    PeopleDirectory peopleDirectory;

    public Organization() {
        commDirectory = new CommunityDirectory();
        hospDirectory = new HospitalDirectory();
    }
   

    public CommunityDirectory getCommDirectory() {
        return commDirectory;
    }

    public void setCommDirectory(CommunityDirectory commDirectory) {
        this.commDirectory = commDirectory;
    }

    public HospitalDirectory getHospDirectory() {
        return hospDirectory;
    }

    public void setHospDirectory(HospitalDirectory hospDirectory) {
        this.hospDirectory = hospDirectory;
    }

    public PeopleDirectory getPeopleDirectory() {
        return peopleDirectory;
    }

    public void setPeopleDirectory(PeopleDirectory peopleDirectory) {
        this.peopleDirectory = peopleDirectory;
    }

    @Override
    public String toString() {
        return "Organization{" + "commDirectory=" + commDirectory + ", hospDirectory=" + hospDirectory + ", peopleDirectory=" + peopleDirectory + '}';
    }
    

   
    
    
    
    
}
