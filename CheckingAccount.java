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
public class CheckingAccount extends Account {

    public CheckingAccount() {
        this.accountNumber = counter++;
        this.balance =0.00;
        this.transactions = new ArrayList<>(); 
        
        
    }

    @Override
    public String toString() {
        return "Checking(" + this.accountNumber + "): " + this.balance + "$";
    }
    
   
}
