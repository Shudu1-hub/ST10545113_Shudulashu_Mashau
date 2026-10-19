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
            
            boolean loginStatus = login.loginUser(Username, Password, loginUsername, loginPassword);

            // message chat
            if (loginStatus) {
                
                System.out.println("Welcome to QuickChat.");
                System.out.println("option 1) send Messages");
                System.out.println("option 2) Show recently sent messsages - Coming Soon");
                System.out.println("option 3) Quit");
                
                int option = Integer.parseInt(sc.nextLine());
                
                switch (option) {
                    
                    case 1 :
                         System.out.println("How many messages would you like to send? ");
                         
                         int total = Integer.parseInt(sc.nextLine());
                         
                         for (int i = 1 ; i <= total; i++) {
                             System.out.println("");
                             System.out.println("=========== Message " + i + "============");
                             System.out.println("Enter recipient number: ");
                             String recipient = sc.nextLine();
                             System.out.println(" Enter message: ");
                             String messageText = sc.nextLine();
                             
                             if (messageText.length() >250) {
                                 System.out.println("Please enter a message of less than 250 characters.");
                                 i--;
                                 continue;
                                 
                             }
                             Message msg = new Message( i,recipient, messageText);
                             
                             if (msg.checkMessageID()) {
                                 System.out.println("Message ID successfully captured.");
                             }
                             System.out.println(msg.checkRecipientCell());
                             System.out.println("Message Hash: " + msg.createMessageHash());
                             System.out.println(msg.sentMessage());
                             System.out.println(msg.printMessages());
                         }
                         System.out.println("Total messages sent: " + Message.returnTotalMessages());
                        break;
                        
                    case 2 :
                        System.out.println(" Coming soon.");
                        break;
                        
                    case 3 :
                        System.out.println(" Goodbye.");
                         System.exit(0);
                        break;
                        
                    default:
                        System.out.println("invaild option entered, please enter correct option. ");
                        
                       
                        
                        
                        
                }
                
                
                
            }
        }
        
    sc.close();
                       
    }
}
