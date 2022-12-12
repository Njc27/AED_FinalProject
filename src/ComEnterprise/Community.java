/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ComEnterprise;

import HospitalEnterprise.HospitalCatalouge;


/**
 *
 * @author namithajc
 */
public class Community {
    private String communityName;
    private PeopleCatalouge peopleCatalog;
    private HospitalCatalouge hospitalCataloug;
    
    public Community() {
        peopleCatalog = new PeopleCatalouge();
        hospitalCataloug = new HospitalCatalouge();
    }
    public Community(String communityName, PeopleCatalouge peopleCatalog, HospitalCatalouge hospitalCataloug){
        this.communityName = communityName;
        this.peopleCatalog = peopleCatalog;
        this.hospitalCataloug = hospitalCataloug;
    }

    public PeopleCatalouge getPeopleCatalog() {
        return peopleCatalog;
    }

    public void setPeopleCatalog(PeopleCatalouge peopleCatalog) {
        this.peopleCatalog = peopleCatalog;
    }

    public HospitalCatalouge getHospitalCataloug() {
        return hospitalCataloug;
    }

    public void setHospitalCataloug(HospitalCatalouge hospitalCataloug) {
        this.hospitalCataloug = hospitalCataloug;
    }
    
    

    public String getCommunityName() {
        return communityName;
    }

    public void setCommunityName(String communityName) {
        this.communityName = communityName;
    }

    @Override
    public String toString() {
        return "Community{" + "communityName=" + communityName + ", peopleCatalog=" + peopleCatalog + ", hospitalCataloug=" + hospitalCataloug + '}';
    }

   
 
}
