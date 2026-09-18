/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.registration;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Student
 */
public class LoginTest {
    
    public LoginTest() {
    }

    /**
     * Test of checkUserName method, of class Login.
     */
    @Test
    public void testCheckUserName() {
        System.out.println("checkUserName");
        String username = "kyl_1";
        Login instance = new Login();
        boolean expResult = true;
        boolean result = instance.checkUserName(username);
        assertEquals(expResult, result);
       
    }

    /**
     * Test of checkPasswordComplexity method, of class Login.
     */
    @Test
    public void testCheckPasswordComplexity() {
        System.out.println("checkPasswordComplexity");
        String password = "Ch&&sec@99!";
        Login instance = new Login();
        boolean expResult = true;
        boolean result = instance.checkPasswordComplexity(password);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of checkCellPhoneNumber method, of class Login.
     */
    @Test
    public void testCheckCellPhoneNumber() {
        System.out.println("checkCellPhoneNumber");
        String CellNumber = "+27838968976";
        Login instance = new Login();
        boolean expResult = true;
        boolean result = instance.checkCellPhoneNumber(CellNumber);
        assertEquals(expResult, result);
       
    }

    /**
     * Test of registerUser method, of class Login.
     */
    @Test
    public void testRegisterUser() {
        System.out.println("registerUser");
        String FirstName = "Kyle";
        String LastName = "Smith";
        String Username = "kyl_1";
        String Password = "Ch&&sec@ke99!";
        String CellNumber = "+27838968976";
        Login instance = new Login();
        String expResult = "The three above conditions have been met and the user has been registered successfully.";
        String result = instance.registerUser(FirstName, LastName, Username, Password, CellNumber);
        assertEquals(expResult, result);
   
    }

    /**
     * Test of loginUser method, of class Login.
     */
    @Test
    public void testLoginUser() {
        System.out.println("loginUser");
        String registeredUsername = "kyl_1";
        String registeredPassword = "Ch&&sec@ke99!";
        String loginUsername = "kyl_1";
        String loginPassword = "Ch&&sec@ke99!";
        Login instance = new Login();
        boolean expResult = true;
        boolean result = instance.loginUser(registeredUsername, registeredPassword, loginUsername, loginPassword);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of returnLoginStatus method, of class Login.
     */
    @Test
    public void testReturnLoginStatus() {
        System.out.println("returnLoginStatus");
        String FirstName = "Kyle";
        String LastName = "Smith";
        String registeredUsername = "kyl_1";
        String registeredPassword = "Ch&&sec@ke99!";
        String loginUsername = "kyl_1";
        String loginPassword = "Ch&&sec@ke99!";
        Login instance = new Login();
        String expResult = "Welcome " + FirstName + " " + LastName + ", it is great to see you again:)";
        String result = instance.returnLoginStatus(FirstName, LastName, registeredUsername, registeredPassword, loginUsername, loginPassword);
        assertEquals(expResult, result);
        
    }
    
}
