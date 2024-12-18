/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banking;

/**
 *
 * @author anishmehra
 */
public class Transaction implements ITransaction {
  private String type;  
  private double amount; 

    public Transaction(String type,double amount) {
        this.type = type;
                this.amount = amount;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getAmount() {
        return this.amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
         return this.type + " of " + this.amount + "$";
    }

   
    
  
}
