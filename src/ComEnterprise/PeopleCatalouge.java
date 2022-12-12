/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ComEnterprise;

import java.util.ArrayList;

/**
 *
 * @author namithajc
 */
public class PeopleCatalouge {
    private ArrayList<People> peopleCatalog;
    public PeopleCatalouge() {
        peopleCatalog = new ArrayList<People>();
    }

    public ArrayList<People> getPeopleCatalog() {
        return peopleCatalog;
    }

    public void setPeopleCatalog(ArrayList<People> peopleCatalog) {
        this.peopleCatalog = peopleCatalog;
    }
      public People addPeople() {
        People p = new People();
        peopleCatalog.add(p);
        return p;
    }

    public void removePeople(People p) {
        peopleCatalog.remove(p);
    }

    public People searchPeople(String id) {
        for (People people : peopleCatalog) {
            if (people.getId().equals(id)) {
                return people;
            }
        }
        return null;
    }
      public void addPeople(People p) {
        peopleCatalog.add(p);
    }

    @Override
    public String toString() {
        return "PeopleCatalog{" + "peopleCatalog=" + peopleCatalog + '}';
    }

    public int size() {
        return peopleCatalog.size();
    }

    public People get(int j) {
        return peopleCatalog.get(j);
    }
    
    public boolean personPresent(String id) {
        for (People people : peopleCatalog) {
            if (people.getId().equals(id)) {
                return true;
            }
        }
        return false;
    }
      
}
