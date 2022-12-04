/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CommunityEnterprise;

/**
 *
 * @author namithajc
 */
public class LoginCredentials {
    String userName;
    String password;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "LoginCredentials{" + "userName=" + userName + ", password=" + password + '}';
    }

    public LoginCredentials(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public LoginCredentials() {
    }
    
    
}
