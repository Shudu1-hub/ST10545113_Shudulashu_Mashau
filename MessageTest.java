/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.registration;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Student
 */
public class MessageTest {
    
    public MessageTest() {
    }
   
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    //test for checkMessageID method.
    @Test
    public void testCheckMessageID() {
        Message instance = new Message ( 1234567890 , "+27718693002" , "Hi Mike, can you join us for dinner tonight?") ;
        boolean result = instance.checkMessageID();
        assertTrue(result);
 }

    
    //test of checkRecipientCell method. 
     
    @Test
    public void testCheckRecipientCell() {
        Message instance = null; 
        String expResult = "Cell phone number sucessfully captured.";
        
    }

    
     //Test of createMessageHash method.
     
    @Test
    public void testCreateMessageHash() {
        
      String expResult = "00:0:HITONIGHT";
       
    }

    
     //Test of sentMessage method.
     
    @Test
    public void testSentMessage() {
        System.out.println("sentMessage");
         String expResult = null;
        String result = "Message successfully sent.";
        
    }

    
     //Test of printMessages method.
     
    @Test
    public void testPrintMessages() {
        System.out.println("printMessages");
        Message instance = null;
        String expResult = "true";
        
    
    }

    
     //Test of returnTotalMessages method.
     
    @Test
    public void testReturnTotalMessages() {
        System.out.println("returnTotalMessages");
        int expResult = 0;
        int result = Message.returnTotalMessages();
        assertEquals(expResult, result);
       
    }

    
     //Test of storeMessage method.
     
    @Test
    public void testStoreMessage() {
        System.out.println("storeMessage");
        Message instance = null;
        
    }

    
     //Test of getMessageID method.
     
    @Test
    public void testGetMessageID() {
        System.out.println("getMessageID");
        Message instance = null;
        String expResult = "true";
        
    }

    
     //Test of getRecipient method.
     
    @Test
    public void testGetRecipient() {
        System.out.println("getRecipient");
        Message instance = null;
        String expResult = "true";
       
    }

    
     //Test of getMessage method.
     
    @Test
    public void testGetMessage() {
        System.out.println("getMessage");
        Message instance = null;
        String expResult = "true";
        
    }

    
     //Test of getMessageHash method.
    
    @Test
    public void testGetMessageHash() {
        System.out.println("getMessageHash");
        Message instance = null;
        String expResult = "true";
        
    }
    
}
