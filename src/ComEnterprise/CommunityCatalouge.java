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
public class CommunityCatalouge {
    private ArrayList<Community> communityCatalog;
    
    public CommunityCatalouge() {
        communityCatalog = new ArrayList<Community>();
    }

    public ArrayList<Community> getCommunityCatalog() {
        return communityCatalog;
    }

    public void setCommunityCatalog(ArrayList<Community> communityCatalog) {
        this.communityCatalog = communityCatalog;
    }
  public Community addCommunity() {
        Community c = new Community();
        communityCatalog.add(c);
        return c;
    }

    public void removeCommunity(Community c) {
        communityCatalog.remove(c);
    }

    public Community searchCommunity(String communityName) {
        for (Community community : communityCatalog) {
            if (community.getCommunityName().equals(communityName)) {
                return community;
            }
        }
        return null;
    }
      public void addCommunity(Community c) {
        communityCatalog.add(c);
    }

    public int size() {
        return communityCatalog.size();
    }

    public Community get(int i) {
        return communityCatalog.get(i);
    }

    @Override
    public String toString() {
        return "CommunityCatalog{" + "communityCatalog=" + communityCatalog + '}';
    }
    
}
