/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import CommunityEnterprise.Community;
import CommunityEnterprise.LoginCredentials;
import CommunityEnterprise.People;
import CommunityEnterprise.PeopleDirectory;

/**
 *
 * @author namithajc
 */
public class ConfigureASystem {
    
    public static Organization initialize(){
          Organization sys = new Organization();
          Community c = new Community();
          c.setName("Bolyston St.");
          Community c1 = new Community();
          c1.setName("Avenue St.");
          People p = new People("AAA-GG-SSSS","System","Admin","admin@neu.com","","","","","","",true,false,false,false,new LoginCredentials("admin","password"));
          People I = new People("AAA-GG-SSSS","Insurance","Admin","Iadmin@neu.com","","","","","","",true,false,false,false,new LoginCredentials("iadmin","password"));
          PeopleDirectory peopDir = new PeopleDirectory();
          p.setUserName("admin");
          p.setPassword("password");
          I.setUserName("iadmin");
          I.setPassword("password");
          peopDir.addPerson(p);
          peopDir.addPerson(I);
          sys.setPeopleDirectory(peopDir);
         sys.commDirectory.addCommunity(c);
         sys.commDirectory.addCommunity(c1);
        return sys;
    }
}
