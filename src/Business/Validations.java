/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author namithajc
 */
public class Validations {
    public boolean EmailValidation(String email){
        String pattern = "^[a-zA-Z0-9._]{0,30}[@][a-zA-Z0-9]{0,10}[.][a-zA-Z]{2,5}$";
        Pattern pat = Pattern.compile(pattern);
        Matcher mat = pat.matcher(email);
        if(!mat.matches()){
            return false;
        }
        else{
            return true;
        }
    }
    
    public boolean PhoneValidation(String phone){
        String pattern = "^[0-9]{10}$";
        Pattern pat = Pattern.compile(pattern);
        Matcher mat = pat.matcher(phone);
        if(!mat.matches()){
            return false;
        }
        else{
            return true;
        }
    }
    
    public boolean PasswordValidation(String password){
        String pattern = "^(?=.*[A-Za-z])(?=.*\\d)[A-Za-z\\d]{8,}$";
        Pattern pat = Pattern.compile(pattern);
        Matcher mat = pat.matcher(password);
        if(!mat.matches()){
           return false;
        }
        else{
            return true;
        }
    }
}
