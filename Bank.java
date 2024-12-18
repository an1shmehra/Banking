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
public class Bank implements IBank{
    private String bankNumber; 
    private String address; 
    private ArrayList <Client> clientList ;               
    public Bank() {
        this.clientList = new  ArrayList<Client>();
        
    }

    @Override
    public void addClient(Client newClient) {
        this.clientList.add(newClient);
    }

    @Override
    public void displayClientAccounts(int clientId) {
            if (getClient(clientId) == null) {
                System.out.println("no client found");; 
        }
        else{
                getClient(clientId).displayAccounts();
            }
            
        
    }

    @Override
    public void displayClientList() {
        for (int i = 0; i < this.clientList.size(); i++) {
            System.out.println(this.clientList.get(i));
        }
    }

    @Override
    public Client getClient(int id) { 
        for (int i = 0; i <this.clientList.size() ; i++) {
            
            if( this.clientList.get(i).getId()==id){
            Client c = this.clientList.get(i);
            return c; 
            }
        }
        /*String g = "h";
        String f = "g";
        Client c2 = new Client(g,f); 
            */    
        return null;
     
    }

    @Override
    public Account getClientAccount(int clientId, int accountNumber) {
       
         if (getClient(clientId) == null) {
        return null; 
        }
        else{
            Account a = getClient(clientId).getAccount(accountNumber);
            return a;} 
              
    }

    public String getBankNumber() {
        return this.bankNumber;
    }

    public void setBankNumber(String bankNumber) {
        this.bankNumber = bankNumber;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ArrayList<Client> getClientList() {
        return this.clientList;
    }

    public void setClientList(ArrayList<Client> clientList) {
        this.clientList = clientList;
    }

   

    @Override
    public String toString() {
        return "Bank{" + "bankNumber=" + this.bankNumber + ", address=" + this.address + '}';
    }
   
    
    
}
