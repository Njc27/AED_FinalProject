/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CommunityEnterprise;

import HospitalEnterprise.DoctorDirectory;
import HospitalEnterprise.TherapistDirectory;

/**
 *
 * @author namithajc
 */
public class Hospital {
    String hospName;
    DoctorDirectory doctorDirectory;
    TherapistDirectory therapistDirectory;

    public String getHospName() {
        return hospName;
    }

    public void setHospName(String hospName) {
        this.hospName = hospName;
    }

    public DoctorDirectory getDoctorDirectory() {
        return doctorDirectory;
    }

    public void setDoctorDirectory(DoctorDirectory doctorDirectory) {
        this.doctorDirectory = doctorDirectory;
    }

    public TherapistDirectory getTherapistDirectory() {
        return therapistDirectory;
    }

    public void setTherapistDirectory(TherapistDirectory therapistDirectory) {
        this.therapistDirectory = therapistDirectory;
    }

    @Override
    public String toString() {
        return "Hospital{" + "hospName=" + hospName + ", doctorDirectory=" + doctorDirectory + ", therapistDirectory=" + therapistDirectory + '}';
    }
    
    
}
