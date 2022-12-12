/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HospitalEnterprise;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author namithajc
 */
public class EncounterHistory {
     private ArrayList<Encounter> encounterHistory;
     public EncounterHistory() {
        encounterHistory = new ArrayList<Encounter>();
    }

    public ArrayList<Encounter> getEncounterHistory() {
        return encounterHistory;
    }

    public void setEncounterHistory(ArrayList<Encounter> encounterHistory) {
        this.encounterHistory = encounterHistory;
    }

      public Encounter addEncounter() {
        Encounter e = new Encounter();
        encounterHistory.add(e);
        return e;
    }

    public void removeEncounter(Encounter e) {
        encounterHistory.remove(e);
    }

    public Encounter searchEncounter(Date date) {
        for (Encounter encounter : encounterHistory) {
            if (encounter.getEncounterDate().equals(date)) {
                return encounter;
            }
        }
        return null;
    }
      public void addEncounter(Encounter e) {
        encounterHistory.add(e);
    }

    public int size() {
        return encounterHistory.size();
    }

    public Encounter get(int i) {
        return encounterHistory.get(i);
    }

    @Override
    public String toString() {
        return "EncounterHistory{" + "encounterHistory=" + encounterHistory + '}';
    }
    
}
