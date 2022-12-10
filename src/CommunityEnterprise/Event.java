/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CommunityEnterprise;

import java.util.Date;

/**
 *
 * @author namithajc
 */
public class Event {
    
    private String eventName;
    private Date date;
    private String time;
    private String Address;
    Community com;
    City city;
    private String hostName;
    private String email;
    private String phone;

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public Community getCom() {
        return com;
    }

    public void setCom(Community com) {
        this.com = com;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Event{" + "eventName=" + eventName + ", date=" + date + ", time=" + time + ", Address=" + Address + ", com=" + com + ", city=" + city + ", hostName=" + hostName + ", email=" + email + ", phone=" + phone + '}';
    }
    
}
