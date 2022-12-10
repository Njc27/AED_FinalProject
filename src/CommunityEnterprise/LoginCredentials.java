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
    String email;

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    @Override
    public String toString() {
        return "LoginCredentials{" + "userName=" + userName + ", password=" + password + '}';
    }

    public LoginCredentials(String userName, String password, String email) {
        this.userName = userName;
        this.password = password;
        this.email = email;
    }

    public LoginCredentials() {
    }
    
    
}
