/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CommunityEnterprise;

import java.util.ArrayList;

/**
 *
 * @author namithajc
 */
public class PeopleDirectory extends People{
    ArrayList<People> peopleList;

    public PeopleDirectory(ArrayList<People> peopleList) {
        this.peopleList = peopleList;
    }

    public PeopleDirectory() {
        peopleList = new ArrayList();
    }

    public ArrayList<People> getPeopleList() {
        return peopleList;
    }

    public void setPeopleList(ArrayList<People> peopleList) {
        this.peopleList = peopleList;
    }
    
    public void addPerson(People p){
        peopleList.add(p);
    }
    public void removePerson(People p){
        peopleList.remove(p);
    }
    
    public ArrayList<People> systemAdminList(){
        ArrayList<People> systemAdminList = new ArrayList();
        for(int i = 0;i < peopleList.size();i++){
            if(peopleList.get(i).isSystemAdmin() || peopleList.get(i).isCommunityAdmin()||peopleList.get(i).isHospitalAdmin()){
                systemAdminList.add(peopleList.get(i));
            }
        }
        return systemAdminList;
    }
    
    public People findPersonBySSn(String ssn){
        for(int i = 0;i < peopleList.size();i++){
            if(peopleList.get(i).getSsn().equalsIgnoreCase(ssn)){
                return peopleList.get(i);
            }
        }
        return null;
    }
    public boolean checkPersonByFirstAndLastName(String FirstName,String LastName){
        for(int i = 0;i < peopleList.size();i++){
            if(peopleList.get(i).getFirstName().equalsIgnoreCase(firstName) && peopleList.get(i).getLastName().equalsIgnoreCase(lastName)){
                return true;
            }
        }
        return false;
    }
    public boolean validateUserNameAndPassword(String username, String password, String type){
        for(int i = 0 ;i < peopleList.size();i++){
             if(type.equalsIgnoreCase("System Admin")){
                  if(peopleList.get(i).loginCredentials.getUserName().equalsIgnoreCase(username) && peopleList.get(i).loginCredentials.getPassword().equalsIgnoreCase(password) && peopleList.get(i).isSystemAdmin()){
               return true;    
            }
             } 
             else if(type.equalsIgnoreCase("Hospital Admin")){
                  if(peopleList.get(i).loginCredentials.getUserName().equalsIgnoreCase(username) && peopleList.get(i).loginCredentials.getPassword().equalsIgnoreCase(password) && peopleList.get(i).isHospitalAdmin()){
                return true;
             }
                }
             else if(type.equalsIgnoreCase("Community Admin")){
               if(peopleList.get(i).loginCredentials.getUserName().equalsIgnoreCase(username) && peopleList.get(i).loginCredentials.getPassword().equalsIgnoreCase(password) && peopleList.get(i).isHospitalAdmin()){
                return true;  
             }
        }
              else if(type.equalsIgnoreCase("Emergency Admin")){
               if(peopleList.get(i).loginCredentials.getUserName().equalsIgnoreCase(username) && peopleList.get(i).loginCredentials.getPassword().equalsIgnoreCase(password) && peopleList.get(i).isEmergencyAdmin()){
                return true;  
             }
        }
        }
        return false;
        }

    @Override
    public String toString() {
        return "PeopleDirectory{" + "peopleList=" + peopleList + '}';
    }
    
    
}
