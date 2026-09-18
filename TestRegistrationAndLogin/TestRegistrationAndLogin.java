/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package TestRegistrationAndLogin;


import com.mycompany.registration.Login;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Student
 */
public class TestRegistrationAndLogin {
     @Test
    public void usernameCorrectlyFormatted(){
        Login login = new Login();
        boolean expected = login.checkUserName("kyl_1");
        assertEquals(true, expected, "Welcome Kyle, Smith it is great to see you again");
        }
    
    @Test
    public void usernameIncorrectlyFormatted(){
        Login login = new Login();
        boolean expected = login.checkUserName("kyle!!!!!!");
        assertEquals(false,expected, "Username is not correctly formatted; please ensure that your username contains an underscore and is no more than five characters in length.");
    }
    
    @Test
    public void passwordMeetsComplexityRequirement(){
        Login login = new Login();
        boolean expected = login.checkPasswordComplexity("Ch&&sec@ke99!");
        assertEquals(true, expected, "Password successfully captured.");
    }
    
    @Test
    public void passwordDoesNotMeetComplexityRequirement(){
        Login login = new Login();
        boolean expected = login.checkPasswordComplexity("password");
        assertEquals(false, expected, "Password is not correctly formatted; please ensure that the password contains at least eight characters, a captial letter, a number, and a special character.");
            
    }
    
    @Test
    public void cellphonenumberCorrectlyFormatted(){
        Login login = new Login();
        boolean expected = login.checkCellPhoneNumber("+27838968976");
        assertEquals(true, expected, "Cell number successfully captured.");
    }
    
    @Test
    public void cellphonenumberIncorrectlyFormatted(){
        Login login = new Login();
        boolean expected = login.checkCellPhoneNumber("08966553");
        assertEquals(false, expected, "Cell number is incorrectly formatted or does not contain an international code; please correct the number and try again.");
    }
    
    @Test
    public void loginSuccessful(){
        Login login = new Login();
        login.registerUser("Kyle", "Smith", "kyl_1", "Ch&&sec@ke99!", "+27838968976");
        boolean expected = login.loginUser("kyl_1", "Ch&&sec@ke99!", "kyl_1", "Ch&&sec@ke99!");
        assertTrue(expected);
        
    }
    
    @Test
    public void loginFailed(){
        Login login = new Login();
        login.registerUser("kyle", "Smith", "kyl_1", "Ch&&sec@ke99!", "+27838968976");
        boolean expected = login.loginUser("kyle!!!!!", "password", "kyle!!!!!!", "password");
        assertFalse(false);
        
    }
    
    @Test
    public void UsernameCorrectlyFormatted(){
        Login login = new Login();
        boolean expected = login.checkUserName("kyl_1");
        assertTrue(expected);
    }
    
    @Test
    public void UsernameIncorrectlyFormatted(){
       Login login = new Login();
        boolean expected = login.checkUserName("kyle!!!!!!");
        assertFalse(expected);
    }
    
    @Test
    public void PasswordComplextity(){
        Login login = new Login();
        boolean expected = login.checkPasswordComplexity("Ch&&sec@ke99!");
        assertTrue(expected);
        
    }
    
    @Test
    public void PasswordComplexityNotMet(){
        Login login = new Login();
        boolean expected = login.checkPasswordComplexity("password");
        assertFalse(expected);
    }
    
    @Test
    public void CellPhoneNumberCorrectlyFormatted(){
        Login login = new Login();
        boolean expected = login.checkCellPhoneNumber("+27838968976");
        assertTrue(expected);
    }
    
    @Test
    public void CellPhoneNotCorrectlyFormatted(){
        Login login = new Login();
        boolean expected = login.checkCellPhoneNumber("08966553");
        assertFalse(expected);
        
    }
    
}

    
  
        
    
    
               
       
       
       
   
    

