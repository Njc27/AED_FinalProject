/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TheBusiness.EmergencyAdmin;

/**
 *
 * @author banishmg
 */
public class EmergencySoS {
    private String scence;
    private String zipCode;
    private String NoVictims;
    private String Location;

    public String getScence() {
        return scence;
    }

    public void setScence(String scence) {
        this.scence = scence;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getNoVictims() {
        return NoVictims;
    }

    public void setNoVictims(String NoVictims) {
        this.NoVictims = NoVictims;
    }



    public String getLocation() {
        return Location;
    }

    public void setLocation(String Location) {
        this.Location = Location;
    }

    @Override
    public String toString() {
        return scence;
    }
    
    
    
}
