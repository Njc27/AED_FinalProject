/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CommunityEnterprise;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author namithajc
 */
public class City {
    private String cityName;
    private CommunityDirectory comDir;
     
    public City() {
        comDir = new CommunityDirectory();
    }
    public City (String cityName, CommunityDirectory comDir){
        this.cityName = cityName;
        this.comDir = comDir;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public CommunityDirectory getComDir() {
        return comDir;
    }

    public void setComDir(CommunityDirectory comDir) {
        this.comDir = comDir;
    }
    
    @Override
    public String toString() {
        return "City{" + "cityName=" + cityName + ", CommunityDirectory=" + comDir + '}';
    }
}
