/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template.      
 */
package banking;

import java.util.ArrayList;

/**
 *
 * @author anishmehra
 */
public abstract class Account  {
     protected int accountNumber;
     protected  double balance;
    protected Client owner;
    protected static int counter = 1;
    protected  ArrayList<Transaction> transactions; 
    
    public Account() {
        
    } 
    public double deposit(double d){
       this.balance+= d;
       Transaction t = new Transaction("deposit",d);
       this.transactions.add(t);
        return this.balance; 
    }
    public double withdrawal (double w){
        this.balance -= w;
       Transaction tw = new Transaction("withdrawal",w);
       this.transactions.add(tw);
        return this.balance; 
    }
    public void displayAllTransactions(){
        for (int i = 0; i <this.transactions.size() ; i++) {
            System.out.println(this.transactions.get(i));
        }
    }
    
    
    public int getAccountNumber() {
        return this.accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Client getOwner() {
        return this.owner;
    }

    public void setOwner(Client owner) {
        this.owner = owner;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Account.counter = counter;
    }

    public ArrayList<Transaction> getTransactions() {
        return this.transactions;
    }

    public void setTransactions(ArrayList<Transaction> transactions) {
        this.transactions = transactions;
    }

    @Override
    public String toString() {
        return "Account{" + "accountNumber=" + this.accountNumber + ", balance=" + this.balance + ", owner=" + this.owner + '}';
    }
 
}
