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
   
    HospitalDirectory hospDirectory;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

  
    public HospitalDirectory getHospDirectory() {
        return hospDirectory;
    }

    public void setHospDirectory(HospitalDirectory hospDirectory) {
        this.hospDirectory = hospDirectory;
    }

    @Override
    public String toString() {
        return "Community{" + "name=" + name + ", hospDirectory=" + hospDirectory + '}';
    }

    
   
    

}
