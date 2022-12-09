/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CommunityEnterprise;

import java.util.ArrayList;
import HospitalEnterprise.HospitalDirectory;
/**
 *
 * @author namithajc
 */
public class Community {
    String name;
    String city;
    HospitalDirectory hospDirectory;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public HospitalDirectory getHospDirectory() {
        return hospDirectory;
    }

    public void setHospDirectory(HospitalDirectory hospDirectory) {
        this.hospDirectory = hospDirectory;
    }
    
    @Override
    public String toString() {
        return "Community{" + "name=" + name + "city=" + city +'}';
    }
    

}
