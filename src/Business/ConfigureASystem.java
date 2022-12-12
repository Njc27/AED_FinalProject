/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import CommunityEnterprise.City;
//import CommunityEnterprise.Community;
//import CommunityEnterprise.CommunityDirectory;
import CommunityEnterprise.LoginCredentials;
import CommunityEnterprise.People;
import CommunityEnterprise.PeopleDirectory;
import HospitalEnterprise.Hospital;
//import HospitalEnterprise.HospitalDirectory;
//import HospitalEnterprise.Patient;
//import HospitalEnterprise.PatientDirectory;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

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
          
          Hospital hp = new Hospital();
          Hospital hp2 = new Hospital();
//          hp.setName("BostonHosp");
//          hp2.setName("HarvardMedical");
//          HospitalDirectory hosp= new HospitalDirectory();
//          HospitalDirectory hosp1= new HospitalDirectory();
//          HospitalDirectory hosp2= new HospitalDirectory();
//          HospitalDirectory hosp3= new HospitalDirectory();
//          hosp.addHospital(hp);
//          hosp.addHospital(hp2);
          
          
          
//          Community c = new Community();
//          c.setName("Bolyston St.");
//          c.setHospDirectory(hosp);
//          Community c1 = new Community();
//          c1.setName("Avenue St.");
//          c1.setHospDirectory(hosp3);
//          Community c2 = new Community();
//          c2.setName("Princeton");
//          c2.setHospDirectory(hosp1);
//          Community c3 = new Community();
//          c3.setName("Montclair");
//          c3.setHospDirectory(hosp2);
//          CommunityDirectory commDir = new CommunityDirectory();
//          CommunityDirectory commDir2 = new CommunityDirectory();
//          commDir.addCommunity(c);
//          commDir.addCommunity(c1);
//          commDir2.addCommunity(c2);
//          commDir2.addCommunity(c3);
//          city.setComDir(commDir);
//          city2.setComDir(commDir2);
          People e = new People("AAA-GG-SSSE","Emergency","Admin","eadmin@neu.com","","","","","","",false,false,false,true,false, new LoginCredentials("eadmin","eadmin",""));
          People a = new People("AAA-GG-SSSD","Insurance","Admin","Iadmin@neu.com","","","","","","",false,false,false,false,true, new LoginCredentials("banish","banisha",""));
          People p = new People("AAA-GG-SSSS","System","Admin","admin@neu.com","","","","","","",true,false,false,false,false,new LoginCredentials("admin","password",""));
          People h = new People("SSN1","Hospital","Admin","hospadmin@neu.com","","","","","","",false,false,true,false,false, new LoginCredentials("hospadmin","hosppassword",""));
          People p2 = new People("AAA","Nagarag","Grover","ad@neu.com","8576165163","Smith","street","Roxy","Boston","02215",false,false,false,false,false, new LoginCredentials("","",""));
          People d = new People("AAA-GG-SSSF","Doctor","Admin","eadmin@neu.com","","","","","","",false,false,false,true,false, new LoginCredentials("doctor","doctorpass",""));
          PeopleDirectory peopDir = new PeopleDirectory();
          p.setUserName("admin");
          p.setPassword("password");
          h.setUserName("hospadmin");
          h.setPassword("hosppassword");
          a.setUserName("banish");
          a.setPassword("banisha");
          e.setUserName("eadmin");
          e.setPassword("eadmin");
          peopDir.addPerson(p);
          peopDir.addPerson(e);
          peopDir.addPerson(p2);
          peopDir.addPerson(h);
          peopDir.addPerson(a);
          
          Date date = new Date();
          Date date1 = StringToDate("1997-12-27 17:03:00");
//          Patient p1 = new Patient("ssn1","Nisarga","Venkatesh","nisarga@gmail.com","8576165163","Smith","street","Roxy","Boston","02215","BostonHosp","Female",date1,new LoginCredentials("pat1","patpass","Nisraga@gmail.com"));
//          PatientDirectory pd = new PatientDirectory();
//          pd.addPatient(p1);
          sys.setPeopleDirectory(peopDir);
//          sys.setPatientDirectory(pd);
//         sys.cityDirectory.addCity(city);
//         sys.cityDirectory.addCity(city2);
         
        return sys;
    }
    
    public static Date StringToDate(String s){

    Date result = null;
    try{
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        result  = dateFormat.parse(s);
    }
    catch(ParseException e){
        e.printStackTrace();

    }
    return result ;
}
    
}
