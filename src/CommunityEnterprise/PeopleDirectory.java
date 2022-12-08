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
            if(peopleList.get(i).isSystemAdmin()){
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
    public boolean validateUserNameAndPassword(String username, String password){
        for(int i = 0 ;i < peopleList.size();i++){
            if(peopleList.get(i).loginCredentials.getUserName().equalsIgnoreCase(username) && peopleList.get(i).loginCredentials.getPassword().equalsIgnoreCase(password)){
               return true;
              
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "PeopleDirectory{" + "peopleList=" + peopleList + '}';
    }
    
    
}
