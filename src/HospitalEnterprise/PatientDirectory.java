///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package HospitalEnterprise;
//
//import java.util.ArrayList;
//
///**
// *
// * @author namithajc
// */
//public class PatientDirectory extends Patient{
//    ArrayList<Patient> patientList;
//
//    public PatientDirectory(ArrayList<Patient> patientList) {
//        this.patientList = patientList;
//    }
//
//    public PatientDirectory() {
//        patientList = new ArrayList();
//    }
//
//    public ArrayList<Patient> getPatientList() {
//        return patientList;
//    }
//
//    public void setPatientList(ArrayList<Patient> patientList) {
//        this.patientList = patientList;
//    }
//    
//    public void addPatient(Patient pt){
//        patientList.add(pt);
//    }
//    public void removePatient(Patient pt){
//        patientList.remove(pt);
//    }
//    
//    
//    public Patient findPatientBySSn(String ssn){
//        for(int i = 0;i < patientList.size();i++){
//            if(patientList.get(i).getSsn().equalsIgnoreCase(ssn)){
//                return patientList.get(i);
//            }
//        }
//        return null;
//    }
//    public boolean checkPersonByFirstAndLastName(String FirstName,String LastName){
//        for(int i = 0;i < patientList.size();i++){
//            if(patientList.get(i).getFirstName().equalsIgnoreCase(firstName) && patientList.get(i).getLastName().equalsIgnoreCase(lastName)){
//                return true;
//            }
//        }
//        return false;
//    }
//    public boolean validateUserNameAndPassword(String username, String password){
//        for(int i = 0 ;i < patientList.size();i++){
//            if(patientList.get(i).loginCredentials.getUserName().equalsIgnoreCase(username) && patientList.get(i).loginCredentials.getPassword().equalsIgnoreCase(password)){
//               return true;
//              
//            }
//        }
//        return false;
//    }
//    
//    public boolean checkExisting(String id) {
//        for(Patient patient:patientList){
//            if(patient.getSsn().equalsIgnoreCase(id)){
//                return true;
//            }
//        }
//        return false;
//    }
//    
//    public int size() {
//        return patientList.size();
//    }
//
//    @Override
//    public String toString() {
//        return "PeopleDirectory{" + "patientList=" + patientList + '}';
//    }
//}
