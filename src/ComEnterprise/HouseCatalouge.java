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
public class HouseCatalouge {
    private ArrayList<House> houseCatalog;
        public HouseCatalouge() {
        houseCatalog = new ArrayList<House>();
    }

    public ArrayList<House> getHouseCatalog() {
        return houseCatalog;
    }

    public void setHouseCCatalog(ArrayList<House> houseCatalog) {
        this.houseCatalog = houseCatalog;
    }
      public House addHouse() {
        House h = new House();
        houseCatalog.add(h);
        return h;
    }

    public void removeHouse(House h) {
        houseCatalog.remove(h);
    }

    public House searchPeople(String apartmentNo) {
        for (House house : houseCatalog) {
            if (house.getApartementNo().equals(apartmentNo)) {
                return house;
            }
        }
        return null;
    }
      public void addHouse(House h) {
        houseCatalog.add(h);
    }

    @Override
    public String toString() {
        return "HouseCatalog{" + "houseCatalog=" + houseCatalog + '}';
    }
      
}
