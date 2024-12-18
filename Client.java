/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banking;

import java.util.ArrayList;

/**
 *
 * @author anishmehra
 */
public class Client implements IClient {
    private int id;
    private String firstName;
    private String lastName; 
    private static int counter = 1; 
    private ArrayList<Account> accountList ;

    public Client(String name, String lastName) {
        this.firstName = name;
   this.lastName=lastName;
   this.id = counter ++; 
   this.accountList = new ArrayList<>();
    }
    
    

    @Override
    public void addAccount(Account newAccount) {
        this.accountList.add(newAccount);
    }

    @Override
    public void displayAccounts() {
        for (int i = 0; i <this.accountList.size() ; i++) {
            System.out.println(this.accountList.get(i));
        }
    }

    @Override
    public Account getAccount(int accountNumber) {
         for (int i = 0; i < this.accountList.size(); i++) {
             
            if(this.accountList.get(i).accountNumber== accountNumber){
                Account a =  this.accountList.get(i);
                return a; 
            }
        }
         return null; 
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Client.counter = counter;
    }

    public ArrayList<Account> getAccountList() {
        return this.accountList;
    }

    public void setAccountList(ArrayList<Account> accountList) {
        this.accountList = accountList;
    }

    @Override
    public String toString() {
         return "(" + this.id + ") " + this.lastName + ", " + this.firstName;
    }
    
}
