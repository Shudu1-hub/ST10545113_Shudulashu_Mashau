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
 * @author Shudulashu Mashau
 */
public class MessageReportTest {
    
    public MessageReportTest() {
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

    /**
     * Test of displaySenderRecipient method.
     */
    @Test
    public void testDisplaySenderRecipient() {
        System.out.println("displaySenderRecipient");
        MessageReport.displaySenderRecipient();
        
    }

    /**
     * Test of displayLongestMessage method.
     */
    @Test
    public void testDisplayLongestMessage() {
        System.out.println("displayLongestMessage");
        String expected = "Where are you? You are late! I have asked you to be on time.";
        MessageReport.displayLongestMessage();
        
        
    }

    /**
     * Test of searchMessageID method.
     */
    @Test
    public void testSearchMessageID() {
        System.out.println("searchMessageID");
        String id = "0838884567";
        MessageReport.searchMessageID(id);
        
    }

    /**
     * Test of searchRecipient method.
     */
    @Test
    public void testSearchRecipient() {
        System.out.println("searchRecipient");
        String recipient = "+27838884567";
        MessageReport.searchRecipient(recipient);
        
    }

    /**
     * Test of deleteMessage method.
     */
    @Test
    public void testDeleteMessage() {
        System.out.println("deleteMessage");
        String hash = "19:0:WHERE:TIME.";
        MessageReport.deleteMessage(hash);
        
    }

    /**
     * Test of displayReport method.
     */
    @Test
    public void testDisplayReport() {
        System.out.println("displayReport");
        MessageReport.displayReport();
        
    }
    
}
