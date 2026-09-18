/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.registration;

/**
 *
 * @author Student
 */

import java.util.Scanner;

public class Registration {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      // scanner for the login subclass
        Login login = new Login();
        
    // Enter first name and last name
    System.out.print("Enter your first name: ");
    String FirstName = sc.nextLine();
        
    
    System.out.print("Enter your last name: ");
    String LastName = sc.nextLine();
        
    
    //Enter your username
    System.out.print("Enter your username: ");
    String Username = sc.nextLine();
    
    
    //Enter your password
    System.out.print("Enter your password: ");
    String Password = sc.nextLine();
    
    
    //Enter you cell phone number
    System.out.print("Enter you cell number: ");
    String CellNumber = sc.nextLine();
     
    
    
    String result = login.registerUser(FirstName, LastName, Username, Password, CellNumber);
        System.out.println(result);
        
        //login
        if (result.contains("successfully")) {
            System.out.println("\n--------Login-------");
            System.out.println("Enter your username to login: ");
            String loginUsername = sc.nextLine();
            System.out.println("Enter password to login: ");
            String loginPassword = sc.nextLine();
            System.out.println(login.returnLoginStatus(FirstName, LastName, Username, Password, loginUsername, loginPassword));
        }
        
    sc.close();
                       
    }
}
