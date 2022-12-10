/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CommunityEnterprise;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/**
 *
 * @author namithajc
 */
public class CityDirectory extends City {
        private ArrayList<City> cityList;
        
        public CityDirectory(ArrayList<City> cityList) {
        this.cityList = cityList;
    }

    public CityDirectory() {
        cityList = new ArrayList();
    }
    
    public boolean checkCommunity(String cityName){
        for(int i =0;i<cityList.size();i++){
            if(cityName.equalsIgnoreCase(cityList.get(i).getCityName())){
                return true;
            }
        }
        return false;
    }
    
    public City getCityByName(String cityName){
        for(int i =0;i<cityList.size();i++){
            if(cityName.equalsIgnoreCase(cityList.get(i).getCityName())){
                return cityList.get(i);
            }
        }
        return null;
    }
    public void addCity(City c){
        cityList.add(c);
    }
    public void removeCommunity(Community c){
        cityList.remove(c);
    }

    public ArrayList<City> getCityList() {
        return cityList;
    }

    public void setCityList(ArrayList<City> cityList) {
        this.cityList = cityList;
    }
    
    public void removeCity(City c){
        cityList.remove(c);
    }
    

    @Override
    public String toString() {
        return "CityDirectory{" + "cityList=" + cityList + '}';
    }
         
}
