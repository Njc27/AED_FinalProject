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
public class House {
    private String apartementNo;
    private String streetName;
    private String zipCode;

    public House() {
        
    }


    public String getApartementNo() {
        return apartementNo;
    }

    public void setApartementNo(String apartementNo) {
        this.apartementNo = apartementNo;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
    
    

    public House(String apartementNo, String streetName, String zipCode) {
        this.apartementNo = apartementNo;
        this.streetName = streetName;
        this.zipCode = zipCode;
    }

    @Override
    public String toString() {
        return "House{" + "apartementNo=" + apartementNo + ", streetName=" + streetName + ", zipCode=" + zipCode + '}';
    }
    
    
    


}
