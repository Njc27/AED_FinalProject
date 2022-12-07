/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CommunityEnterprise;

import java.util.ArrayList;

/**
 *
 * @author namithajc
 */
public class CommunityDirectory extends Community{
    
   ArrayList<Community> communityList;

    public CommunityDirectory(ArrayList<Community> communityList) {
        this.communityList = communityList;
    }

    public CommunityDirectory() {
        communityList = new ArrayList();
    }
    
    public void addCommunity(Community c){
        communityList.add(c);
    }
    public void removeCommunity(Community c){
        communityList.remove(c);
    }

    @Override
    public String toString() {
        return "CommunityDirectory{" + "communityList=" + communityList + '}';
    }
    
   
   
}
