///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package CommunityEnterprise;
//
//import java.util.ArrayList;
//
///**
// *
// * @author namithajc
// */
//public class CommunityDirectory extends Community{
//    
//   ArrayList<Community> communityList;
//
//    public CommunityDirectory(ArrayList<Community> communityList) {
//        this.communityList = communityList;
//    }
//
//    public CommunityDirectory() {
//        communityList = new ArrayList();
//    }
//    
//    public boolean checkCommunity(String communityName){
//        for(int i =0;i<communityList.size();i++){
//            if(communityName.equalsIgnoreCase(communityList.get(i).getName())){
//                return true;
//            }
//        }
//        return false;
//    }
//    
//    public Community getCommunityByName(String communityName){
//        for(int i =0;i<communityList.size();i++){
//            if(communityName.equalsIgnoreCase(communityList.get(i).getName())){
//                return communityList.get(i);
//            }
//        }
//        return null;
//    }
//    public void addCommunity(Community c){
//        communityList.add(c);
//    }
//    public void removeCommunity(Community c){
//        communityList.remove(c);
//    }
//
//    public ArrayList<Community> getCommunityList() {
//        return communityList;
//    }
//
//    public void setCommunityList(ArrayList<Community> communityList) {
//        this.communityList = communityList;
//    }
//    
//
//    @Override
//    public String toString() {
//        return "CommunityDirectory{" + "communityList=" + communityList + '}';
//    }
//    
//   
//   
//}
