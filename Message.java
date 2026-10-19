/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.registration;

/**
 *
 * @author Student
 */
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Message {
    
    private static int totalMessages = 0;
    
    
    public static ArrayList<Message> sentMessages = new ArrayList<>();
    public static ArrayList<Message> storedMessages = new ArrayList<>();
    public static ArrayList<Message> disregardedMessages = new ArrayList<>();
    public static ArrayList<String> messageHashes = new ArrayList<>();
    
    public static ArrayList<String> messageIDs = new ArrayList<>();
    
    private String messageID;
    private int messageNumber;
    private String recipient;
    private String message;
    private String messageHash;
   
    public Message(int messageNumber, String recipient, String message) {
        
        this.messageNumber = 0;
        this.recipient = recipient;
        this.message = message;
        this.messageID = generateMessageID();
        this.messageHash = createMessageHash();
    }
        //method for creating the message id.
        private String generateMessageID() {
        
        Random random = new Random();
        long number = 1000000000L + (long)(random.nextDouble() * 9000000000L);
        return String.valueOf(number);
        
    }
        
        public boolean checkMessageID() {
            return messageID.length() <= 10 ;
            
        }
        
        public String checkRecipientCell() {
            if (recipient.startsWith("+27") && recipient.length() <= 12) {
                return "Cell phone number successfully captured.";
           }
            return "Cell phone number incorrectly formatted or does not contain international code.";
        }
        
        public String createMessageHash() {
            
            String[] words = message.split(" ");
            String firstWord = words[0];
            String lastWord = words[words.length-1];
        return (messageID.substring(0,2) + ":" + messageNumber + ":" + firstWord + lastWord).toUpperCase();
        }
        
        //creates 3 option for messages
        public String sentMessage() {
            
            Scanner sc = new Scanner(System.in);
            
            System.out.println("""
                               
                               Choose an option:
                               
                               1) Send Message
                               2) Disregard Message
                               3) Store Message
                               """);
            System.out.print("Enter option: ");
            
            int option = Integer.parseInt(sc.nextLine());
            
            switch(option) {
                
                case 1:
                    totalMessages++;
                    sentMessages.add(this);
                    messageIDs.add(messageID);
                    messageHashes.add(messageHash);
                    
                    return "Message successfully sent." ;
                    
                case 2 :
                    disregardedMessages.add(this);
                    return "Message disregarded.";
                    
                case 3 :
                    storedMessages.add(this);
                    messageIDs.add(messageID);
                messageHashes.add(messageHash);
                                storeMessage();
                                return "Message successfully stored.";
                    
                 //closes the switch case if a user choose a wrong option.
                default : return "No valid option selected. " ;
            }
        }
        
        public String printMessages() {
            return "Message ID: " + messageID + "\n" + "MessageHash: " + messageHash + "\n" + "recipient: " + recipient + "\n" + "Message: " + message ;
        }
        
        public static int
                returnTotalMessages() {
                    return totalMessages;
                    
                }
                
                public void storeMessage() {
                    try {
                        FileWriter json = new FileWriter ( "storedMessages.json" , true);
                        json.write("{\n" + "\"MessageID\":\"" + messageID + "\",\n" + "\"MessageHash\":\"" + messageHash + "\",\n" + "\"Recipient\":\"" + recipient + "\",\n" + "\"Message\":\"" + message + "\"\n" + "}\n\n");
                        json.close();
                        System.out.println("Message stored successfully.");
                        
                    } catch(IOException e) {
                        System.out.println(" Error storing message.");
                    }
                }
                
                public String getMessageID() {
                    return messageID;
                    
                }
                
                public String getRecipient() {
                    return recipient;
                    
                }
                
                public String getMessage() {
                    return message;
                    
                }
                
                public String  getMessageHash() {
                    return messageHash;
                }
                    
                    
            }
                    
            
        
    
    
    
