/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.registration;

/**
 *
 * @author Student
 */
public class Login {
  
    // Username validation
    public boolean checkUserName(String username) {
        System.out.println("Username successfully captured.");
        return username.contains("_") && username.length() <=5;
        
    }
    
    // Password validation
    public boolean checkPasswordComplexity(String password) {
        System.out.println("Password successfully captured.");
        return password.length() >=8 && password.matches(".*[A-Z].*") && password.matches(".*[0-9].*") && password.matches(".*[#?!@$%^&*-].*");
    }
    
    // cell phone number validation
    public boolean checkCellPhoneNumber(String CellNumber) {
        System.out.println("Cell phone number successfully added.");
        return CellNumber.matches("^(\\+27|27)\\d{9}$");
        
    }
    
    //Registration
    public String registerUser(String FirstName, String LastName, String Username, String Password, String CellNumber) {
        
        
        if (!checkUserName(Username)) {
            return "Username is not correctly formatted, please ensure that your username contains an underscore and is no more than 5 characters in length.";
        }
        
        if (!checkPasswordComplexity(Password)) {
            return "Password is not correctly formatted, please ensure that the password contains at least 8 characters, a captial letter, a number and a special character.";
        }
        if (!checkCellPhoneNumber(CellNumber)) {
           return "Cell phone number is incorrectly formatted or does not contain an international code.";
        }                               
        
      // successful registration
        return "The three above conditions have been met and the user has been registered successfully.";
    }
    
    public boolean loginUser(String registeredUsername, String registeredPassword, String loginUsername, String loginPassword) {
        return registeredUsername.equals(loginUsername) && registeredPassword.equals(loginPassword);
    }
    
    //returning user
    public String returnLoginStatus(String FirstName,  String LastName ,String registeredUsername, String registeredPassword, String loginUsername, String loginPassword) {
        if (loginUser(registeredUsername, registeredPassword, loginUsername, loginPassword)) {
            return "Welcome " + FirstName + " " + LastName + ", it is great to see you again:)";
        } else {
            return "Username or password incorrect, please try again.";
        }
            
    }
}
            
         
