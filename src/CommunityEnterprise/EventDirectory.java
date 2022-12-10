/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CommunityEnterprise;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author namithajc
 */
public class EventDirectory {
     ArrayList<Event> eventList;

    public ArrayList<Event> getEventList() {
        return eventList;
    }

    public void setEventList(ArrayList<Event> eventList) {
        this.eventList = eventList;
    }
     
      public EventDirectory(ArrayList<Event> eventList) {
        this.eventList = eventList;
    }

    public EventDirectory() {
        eventList = new ArrayList();
    }
    
    public void addEvent(Event e){
        eventList.add(e);
    }
    public void removeEvent(Event e){
        eventList.remove(e);
    }
    
    public Event findEventByEventName(String eventName){
        for(int i = 0;i < eventList.size();i++){
            if(eventList.get(i).getEventName().equalsIgnoreCase(eventName)){
                return eventList.get(i);
            }
        }
        return null;
    }
    public boolean checkEventByName(String name){
        for(int i = 0;i < eventList.size();i++){
            if(eventList.get(i).getEventName().equalsIgnoreCase(name)){
                return true;
            }
        }
        return false;
    }
}
