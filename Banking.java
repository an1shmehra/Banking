/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package banking;

/**
 *
 * @author anishmehra
 */
public class Banking {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean b = true;
        Bank bank = new Bank();
        while (b == true) {
            //UserInputManager.retrieveUserOption();
            switch (UserInputManager.retrieveUserOption()) {
                case 1:

                    bank.addClient(UserInputManager.retrieveClientInfo());
                    bank.displayClientList();
                    break;
                case 2:
                    //Bank bank = new Bank ();
                    int id = UserInputManager.retrieveClientId();
                    Client c1 = bank.getClient(id);
                    if (c1 == null) {
                        System.out.println("no clients");
                        break;
                    }
                    Account a = UserInputManager.retrieveAccountType();
                    c1.addAccount(a);

                    break;
                case 3:
                    int identity = UserInputManager.retrieveClientId();
                    int num = UserInputManager.retrieveAccountNumber();
                    double am = UserInputManager.retrieveTransactionAmount();
                    Client c3 = bank.getClient(identity);
                     Account a1 = c3.getAccount(identity);
                     a1 = bank.getClientAccount(identity, num);
                    if (a1 != null) {
                        double balance = a1.deposit(am);

                        System.out.println(a1);
                    } else {
                        System.out.println("No account found");
                    }
                    break;
                case 4:
                    int identity4 = UserInputManager.retrieveClientId();
                    int num4 = UserInputManager.retrieveAccountNumber();
                    double am4 = UserInputManager.retrieveTransactionAmount();
                    Account a4 = bank.getClientAccount(identity4, num4);

                    if (a4 != null) {
                        double balance4 = a4.withdrawal(am4);
                         
                        System.out.println(a4);
                    } else {
                        System.out.println("No account found");
                    }

                    break;
                case 5:
                    int id5 = UserInputManager.retrieveClientId();
                    int num5 = UserInputManager.retrieveAccountNumber();
                    Account a5 = bank.getClientAccount(id5, num5);
                    a5.displayAllTransactions();
                    break;
                case 6:
                    System.out.println("List of clients:");
                    bank.displayClientList();
                    break;
                case 7:
                    int id7 = UserInputManager.retrieveClientId();
                    
                    bank.displayClientAccounts(id7);

                    break;

                case 8:
                    b = false;
                    break;

            }
            

        }
       
    }
    
}
  