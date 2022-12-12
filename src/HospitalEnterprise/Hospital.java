/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HospitalEnterprise;

/**
 *
 * @author namithajc
 */
public class Hospital {
    private String hospitalName;
    private String emailId;
    private String phoneNo;
    private String AdminId;
    private DoctorCatalouge doctorCataloug;
    private PatientCatalouge patientCatalouge;
    
    public Hospital () {
        doctorCataloug = new DoctorCatalouge();
    }
    
    

    public String getAdminId() {
        return AdminId;
    }

    public void setAdminId(String AdminId) {
        this.AdminId = AdminId;
    }

    public Hospital(String hospitalName, String emailId, String phoneNo, String AdminId, DoctorCatalouge doctorCataloug, PatientCatalouge patientCatalouge) {
        this.hospitalName = hospitalName;
        this.emailId = emailId;
        this.phoneNo = phoneNo;
        this.AdminId = AdminId;
        this.doctorCataloug = doctorCataloug;
        this.patientCatalouge = patientCatalouge;
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
    

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public DoctorCatalouge getDoctorCataloug() {
        return doctorCataloug;
    }

    public void setDoctorCataloug(DoctorCatalouge doctorCataloug) {
        this.doctorCataloug = doctorCataloug;
    }

    public PatientCatalouge getPatientCatalouge() {
        return patientCatalouge;
    }

    public void setPatientCatalouge(PatientCatalouge patientCatalouge) {
        this.patientCatalouge = patientCatalouge;
    }

    @Override
    public String toString() {
        return "Hospital{" + "hospitalName=" + hospitalName + ", emailId=" + emailId + ", phoneNo=" + phoneNo + ", doctorCataloug=" + doctorCataloug + ", patientCatalouge=" + patientCatalouge + '}';
    }

    
    
   
}
