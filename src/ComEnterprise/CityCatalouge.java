/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ComEnterprise;

import HospitalEnterprise.AppointmentsCatalouge;
import HospitalEnterprise.Doctor;
import HospitalEnterprise.DoctorCatalouge;
import HospitalEnterprise.Encounter;
import HospitalEnterprise.EncounterHistory;
import HospitalEnterprise.Hospital;
import HospitalEnterprise.HospitalCatalouge;
import HospitalEnterprise.PatientCatalouge;
import HospitalEnterprise.VitalSigns;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/**
 *
 * @author namithajc
 */
public class CityCatalouge {
        private ArrayList<City> cityCatalog;
        private String userName = "admin";
        private String password = "passwordAdmin";
        private String commUserName = "a1";
        private String commPassword = "a1";
        private String hospUsername = "admin";
        private String hospPassword = "hospPassword";

    public String getHospUsername() {
        return hospUsername;
    }

    public void setHospUsername(String hospUsername) {
        this.hospUsername = hospUsername;
    }

    public String getHospPassword() {
        return hospPassword;
    }

    public void setHospPassword(String hospPassword) {
        this.hospPassword = hospPassword;
    }
        

    
        
    public CityCatalouge() {
        cityCatalog = new ArrayList<City>();
        addData();
    }
    

    public ArrayList<City> getCityCatalog() {
        return cityCatalog;
    }

    public void setCityCatalog(ArrayList<City> cityCatalog) {
        this.cityCatalog = cityCatalog;
    }
    public City addCity() {
        City c = new City();
        cityCatalog.add(c);
        return c;
    }

    public void removeCity(City c) {
        cityCatalog.remove(c);
    }

    public City searchCity(String cityName) {
        for (City city : cityCatalog) {
            if (city.getCityName().equals(cityName)) {
                return city;
            }
        }
        return null;
    }
      public void addCity(City c) {
        cityCatalog.add(c);
    }

    public int size() {
        return cityCatalog.size();
    }

    public City get(int i) {
        return cityCatalog.get(i);
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCommUserName() {
        return commUserName;
    }

    public void setCommUserName(String commUserName) {
        this.commUserName = commUserName;
    }

    public String getCommPassword() {
        return commPassword;
    }

    public void setCommPassword(String commPassword) {
        this.commPassword = commPassword;
    }

    @Override
    public String toString() {
        return "CityCatalouge{" + "cityCatalog=" + cityCatalog + ", userName=" + userName + ", password=" + password + ", commUserName=" + commUserName + ", commPassword=" + commPassword + '}';
    }

        public void addData(){
        House house1 = new House("1181","Student St.","0021");
        House house2 = new House("1182","Student St.","0021");
        House house3 = new House("1183","Student St.","0021");
        House house4 = new House("1184","Student St.","0021");
        House house5 = new House("1185","Student St.","0024");
        House house6 = new House("1191","Student St.","0024");
        House house7 = new House("1281","Student St.","0024");
        House house8 = new House("1291","Student St.","0025");
        House house9 = new House("1381","Student St.","0025");
        House house10 = new House("1382","Student St.","0025");
        House house11 = new House("1282","Student St.","0023");
        House house12 = new House("1181","Student St.","0023");
        
        Date date = new Date();
        Date date1 = StringToDate("1997-12-27 17:03:00");
        Date date2 = StringToDate("1998-06-06 17:03:00");
        Date date3 = StringToDate("1999-05-16 17:03:00");
        Date date4 = StringToDate("1998-04-09 17:03:00");
        Date date5 = StringToDate("1998-01-06 17:03:00");
        Date date6 = StringToDate("1999-02-06 17:03:00");
        Date date7 = StringToDate("1999-06-06 17:03:00");
        Date date8 = StringToDate("1998-11-06 17:03:00");
        Date date9 = StringToDate("1998-10-06 17:03:00");
        Date date10 = StringToDate("1998-02-06 17:03:00");
        EncounterHistory eh = new EncounterHistory();
        EncounterHistory eh1 = new EncounterHistory();
        EncounterHistory eh2 = new EncounterHistory();
        EncounterHistory eh3 = new EncounterHistory();
        EncounterHistory eh4 = new EncounterHistory();
        EncounterHistory eh5 = new EncounterHistory();
        EncounterHistory eh6 = new EncounterHistory();
        EncounterHistory eh7 = new EncounterHistory();
        EncounterHistory eh8 = new EncounterHistory();
        
        VitalSigns vs = new VitalSigns(99,88,104,67,78,88);
        Encounter e1 = new Encounter(date,"NamithaJc",vs);
        eh1.addEncounter(e1);
        People people1 = new People("Namitha Jc", "BA123","Female",date1,"9739090413","jcn@comm.com",house1,eh,new LoginInfo("NamithaBA123","Nam1997"));
        People people2 = new People("Sinchana", "BA122","Female",date2,"8156325444","sin@comm.com",house1,eh1,new LoginInfo("s1","s1"));
        People people3 = new People("Amulya", "BA133","Female",date3,"7964135331","amulya@comm.com",house1,eh2,new LoginInfo("ab","ab"));
        People people4 = new People("Sunaina", "BA124","Female",date4,"754812364","sunain@comm.com",house1,eh3,new LoginInfo("",""));
        People people5 = new People("Jeevika", "B5","Female",date5,"41789325414","jee@comm.com",house2,eh4,new LoginInfo("JeevikaB5","Jee1998"));
        People people6 = new People("Anup", "B6","Male",date6,"7453178985","anup@comm.com",house2,eh5,new LoginInfo("a1","a1"));
        People people7 = new People("Harsha", "B7","Male",date7,"7845318964","harsh@comm.com",house2,eh6,new LoginInfo("HarshaB6","Har1998"));
        People people8 = new People("Nikitha", "B842","Female",date8,"87964135630","niki@comm.com",house2,eh7,new LoginInfo("","Amu1998"));
        People people9 = new People("Nikhil", "B954","Female",date9,"7961234827","nikhil@comm.com",house2,eh8,new LoginInfo("","Amu1998"));
        people2.setCommunityAdmin(true);
        people6.setCommunityAdmin(true);
        people3.setHospitalAdmin(true);
        people7.setHospitalAdmin(true);
        PatientCatalouge patients = new PatientCatalouge();
        patients.addPatient(people2);
        PatientCatalouge patients1 = new PatientCatalouge();
        AppointmentsCatalouge appointmentCatalouge = new AppointmentsCatalouge();
        AppointmentsCatalouge appointmentCatalouge2 = new AppointmentsCatalouge();
        Doctor doctor1 = new Doctor(people1,"Physiotherapy",patients,appointmentCatalouge);
        Doctor doctor2 = new Doctor(people5,"Psychiatrist",patients1,appointmentCatalouge2);
        doctor1.getPerson().setDoctor(true);
        doctor2.getPerson().setDoctor(true);
        DoctorCatalouge doctors = new DoctorCatalouge();
        doctors.addDoctor(doctor1);
        DoctorCatalouge doctors1 = new DoctorCatalouge();
        doctors1.addDoctor(doctor2);
        PeopleCatalouge peopleLog = new PeopleCatalouge();
        peopleLog.addPeople(people1);
        peopleLog.addPeople(people2);
        peopleLog.addPeople(people3);
        peopleLog.addPeople(people4);
        PeopleCatalouge peopleLog2 = new PeopleCatalouge();
        peopleLog2.addPeople(people5);
        peopleLog2.addPeople(people6);
        peopleLog2.addPeople(people7);
        peopleLog2.addPeople(people8);
        PeopleCatalouge peopleLog3 = new PeopleCatalouge();
        PatientCatalouge patients2 = new PatientCatalouge();
        patients2.addPatient(people2);
        PatientCatalouge patients3 = new PatientCatalouge();
        Hospital hospital1 = new Hospital("St Marys","manju.pratuv@gmail.com","9739090413","BA133",doctors,patients2);
        Hospital hospital2 = new Hospital("St Martins","mss@gmail.com","9148836972","BA133",doctors1,patients3);
        
        HospitalCatalouge hospitalLog = new HospitalCatalouge();
        hospitalLog.addHospital(hospital1);
        HospitalCatalouge hospitalLog1 = new HospitalCatalouge();
        hospitalLog1.addHospital(hospital2);
        HospitalCatalouge hospitalLog2 = new HospitalCatalouge();

        Community comm1 = new Community("Bolyston St.",peopleLog,hospitalLog);
        Community comm2 = new Community("Brookline Avenue",peopleLog2,hospitalLog1);
        Community comm3 = new Community("Brattle Street",peopleLog3,hospitalLog2);
        Community comm4 = new Community("Blue Hills Parkway",peopleLog3,hospitalLog2);
        Community comm5 = new Community("South Bridge",peopleLog3,hospitalLog2);
        Community comm6 = new Community("Charlton",peopleLog3,hospitalLog2);
        Community comm7 = new Community("Dudley",peopleLog3,hospitalLog2);
        Community comm8 = new Community("Webster",peopleLog3,hospitalLog2);

        CommunityCatalouge commLog = new CommunityCatalouge();
        CommunityCatalouge commLog2 = new CommunityCatalouge();

        commLog.addCommunity(comm1);
        commLog.addCommunity(comm2);
        commLog.addCommunity(comm3);
        commLog.addCommunity(comm4);
        commLog2.addCommunity(comm5);
        commLog2.addCommunity(comm6);
        commLog2.addCommunity(comm7);
        commLog2.addCommunity(comm8);
        City city1 = new City("Boston",commLog);
        City city2 = new City("Worchester",commLog2);
        
        cityCatalog.add(city1);
        cityCatalog.add(city2);  
    }
    public Date StringToDate(String s){

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
