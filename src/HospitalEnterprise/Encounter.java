/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HospitalEnterprise;

import java.util.Date;

/**
 *
 * @author namithajc
 */
public class Encounter {
    Date encounterDate;
    String DoctorName;
    VitalSigns vitalsigns;

    public Encounter(Date encounterDate, String DoctorName, VitalSigns vitalsigns) {
        this.encounterDate = encounterDate;
        this.DoctorName = DoctorName;
        this.vitalsigns = vitalsigns;
    }

    public Encounter() {
    }
   
    
    public VitalSigns getVitalsigns() {
        return vitalsigns;
    }

    public void setVitalsigns(VitalSigns vitalsigns) {
        this.vitalsigns = vitalsigns;
    }

    public Date getEncounterDate() {
        return encounterDate;
    }

    public void setEncounterDate(Date encounterDate) {
        this.encounterDate = encounterDate;
    }

    public String getDoctorName() {
        return DoctorName;
    }

    public void setDoctorName(String DoctorName) {
        this.DoctorName = DoctorName;
    }

    @Override
    public String toString() {
        return "Encounter{" + "encounterDate=" + encounterDate + ", DoctorName=" + DoctorName + ", vitalsigns=" + vitalsigns + '}';
    }
    
}
