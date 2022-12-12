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
//public class DoctorDirectory  extends Doctor{
//    ArrayList<Doctor> doctorList;
//
//    public DoctorDirectory() {
//        doctorList = new ArrayList();
//    }
//
//    public ArrayList<Doctor> getDoctorList() {
//        return doctorList;
//    }
//    
//     public int size() {
//        return doctorList.size();
//    }
//
//    public void setDoctorList(ArrayList<Doctor> doctorList) {
//        this.doctorList = doctorList;
//    }
//    public boolean checkifPresentBySSn(String ssn){
//        for(int i = 0;i < doctorList.size();i++){
//            if(doctorList.get(i).getSsn().equalsIgnoreCase(ssn)){
//             return true;       
//        }
//    }
//        return false;
//    }
//
//    @Override
//    public String toString() {
//        return "DoctorDirectory{" + "doctorList=" + doctorList + '}';
//    }
//    
//    
//    
//}
