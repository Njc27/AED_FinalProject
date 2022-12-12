/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ComEnterprise;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author namithajc
 */
public class City {
    private String cityName;
    private CommunityCatalouge communityCatalog;
     
    public City() {
        communityCatalog = new CommunityCatalouge();
    }
    public City (String cityName, CommunityCatalouge communityCatalog){
        this.cityName = cityName;
        this.communityCatalog = communityCatalog;
    }
    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
    public CommunityCatalouge getCommunityCatalog() {
        return communityCatalog;
    }

    public void setCommunityCatalog(CommunityCatalouge communityCatalog) {
        this.communityCatalog = communityCatalog;
    }

    @Override
    public String toString() {
        return "City{" + "cityName=" + cityName + ", communityCatalog=" + communityCatalog + '}';
    }

}
