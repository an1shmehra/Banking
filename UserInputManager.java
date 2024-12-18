/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banking;

import java.util.Scanner;

/**
 *
 * @author anishmehra
 */
public class UserInputManager {
     /**
    * Inquires the user to input the account number of the desired account
    * then retrieves the entry from the console
    * 
    * return the account number        
    */
    

    
     public static int retrieveAccountNumber(){
          Scanner input = new Scanner(System.in);  
          System.out.print("Enter your account number: ");
          int accountNumber = input.nextInt();

          return accountNumber;
     }
            

    /**
    * Inquires the user to input the type of new account desired
    * then retrieves the entry from the console
    * 
    * return the Account object (based on the desired type)
    */
    public static Account retrieveAccountType(){
        Scanner input = new Scanner(System.in);  
          System.out.print("Enter the desired type of account:  ");
           System.out.print("Enter c for checking or s for saving");  
          String s   = input.nextLine();
         
         if(s.equalsIgnoreCase("c")){
             CheckingAccount checking = new CheckingAccount();
             return checking;
         }
          if(s.equalsIgnoreCase("s")){
           SavingsAccount savings = new SavingsAccount();
             return savings;
              
         }
          return null;
    }

    /**
    * Inquires the user to input the id of the desired Client
    * then retrieves the entry from the console
    * 
    * return the client id
    */
    public static int retrieveClientId(){
         Scanner input = new Scanner(System.in);  
          System.out.print("Enter the ID: ");
          int clientId = input.nextInt();
          
          return clientId;
     
    }
  
    /**
    * Inquires the user to input the first and last names of the new client
    * then retrieves the entries from the console
    * 
    * return the Client object (using the entered data)
    */
    public static Client retrieveClientInfo(){
        Scanner input = new Scanner(System.in);  
          System.out.print("Enter the first name: ");
          String fn = input.next();
          System.out.print("Enter the last name: ");
          String ln = input.next();
        Client c = new Client (fn, ln); 
          return c;
    }

    /**
    * Inquires the user to input the desired amount for the current transaction
    * then retrieves the entry from the console
    * 
    * return the amount of the transaction
    */
     public static double retrieveTransactionAmount(){
          Scanner input = new Scanner(System.in);  
          System.out.print("Enter transaction amount: ");
          double transactionAmount = input.nextDouble();

          return transactionAmount;
     
        
     }

    /**
    * Inquires the user to input the number associated with the operation he/she wants to execute
    * then retrieves the entry from the console
    * 
    * return the selected option number
    */
    public static int retrieveUserOption(){
         Scanner input = new Scanner(System.in); 
         
          System.out.println("Enter the operation number : ");
          System.out.println("[1] Add a new Client  ");
          System.out.println("[2] Create a new Account ");
          System.out.println("[3] Make a Deposit");
          System.out.println("[4] Make a Withdrawal ");
          System.out.println("[5] List Account Transactions");
          System.out.println("[6] List Clients");
          System.out.println("[7] List Client Accounts");
          System.out.println("[8] Exit application");
          int number = input.nextInt();

          return number;
       
    }
    

}
