/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import CommunityEnterprise.City;
import CommunityEnterprise.Community;
import CommunityEnterprise.CommunityDirectory;
import CommunityEnterprise.LoginCredentials;
import CommunityEnterprise.People;
import CommunityEnterprise.PeopleDirectory;
import HospitalEnterprise.Hospital;

/**
 *
 * @author namithajc
 */
public class ConfigureASystem {
    
    public static Organization initialize(){
          Organization sys = new Organization();
          City city = new City();
          City city2 = new City();
          city.setCityName("Boston");
          city2.setCityName("New Jersey");
          Community c = new Community();
          c.setName("Bolyston St.");
          Community c1 = new Community();
          c1.setName("Avenue St.");
          Community c2 = new Community();
          c2.setName("Princeton");
          Community c3 = new Community();
          c3.setName("Montclair");
          CommunityDirectory commDir = new CommunityDirectory();
          CommunityDirectory commDir2 = new CommunityDirectory();
          commDir.addCommunity(c);
          commDir.addCommunity(c1);
          commDir2.addCommunity(c2);
          commDir2.addCommunity(c3);
          city.setComDir(commDir);
          city2.setComDir(commDir2);
          People p = new People("AAA-GG-SSSS","System","Admin","admin@neu.com","","","","","","",true,false,false,false,new LoginCredentials("admin","password"));
          People h = new People("SSN1","Hospital","Admin","hospadmin@neu.com","","","","","","",false,false,true,false,new LoginCredentials("hospadmin","hosppassword"));
          PeopleDirectory peopDir = new PeopleDirectory();
          p.setUserName("admin");
          p.setPassword("password");
          h.setUserName("hospadmin");
          h.setPassword("hosppassword");
          peopDir.addPerson(p);
          peopDir.addPerson(h);
          sys.setPeopleDirectory(peopDir);
         sys.cityDirectory.addCity(city);
         sys.cityDirectory.addCity(city2);
        return sys;
    }
}
