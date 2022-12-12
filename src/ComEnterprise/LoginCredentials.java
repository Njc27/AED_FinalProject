/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ComEnterprise;

import java.util.HashMap;
import java.util.List;

/**
 *
 * @author namithajc
 */
public class LoginCredentials {
       
    HashMap<String,String> loginInfo = new HashMap<>();

    public HashMap<String,String> getLoginInfo() {
        return loginInfo;
    }

    public void setLoginInfo(HashMap<String,String> loginInfo) {
        this.loginInfo = loginInfo;
    }
    
    public void addUser(String username,String password){
        loginInfo.put(username,password);
    }
    
    public boolean checkUser(String username,String password){
        if (loginInfo.containsKey(username)) {
            if(loginInfo.get(username).equals(password)){
               return true;
            } 
        }
        return false;
    }
    }
        
