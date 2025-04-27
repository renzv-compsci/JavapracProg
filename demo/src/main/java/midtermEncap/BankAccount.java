package midtermEncap;

import java.util.Scanner;

/*Practice 1: Bank Account
 * Create a class called BankAccount. It should have the following private fields:
 * accountHolder(String)
 * balance (double)
 * 
 * This class should include the following methods: 
 * A getter for the acounts holder name 
 * A getter for the account balance 
 * A setter to update the accounts holder name 
 * A setter to deposit money (ensure the deposit amount is positve)
 * A setter to withdraw money (ensure the withdrawal amount is positive and does not exceed the balance)
 */


public class BankAccount {
    private String accountHolder;
    private double balance; 

    // setter for both holder name 
    public void userInfo(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public void balInfo (double balance) {
        this.balance = balance;
    }

    // logic for the deposit money (setter methods)
    public void depositMoney(double amount) {
        if (amount >= 20) {
            balance = balance + amount;
            System.out.println("Successful Transaction: " + amount);
        } else if (amount < 10) {
            System.out.println("You have low balance.");
        } else {
            System.out.println("Unsuccessful transaction. Should be above 20");
        }
    }

    // logic for the withdraw money (setter methods)
    public void withdrawMoney(double amount ) {
        if (amount > 0 && amount <= balance) {
            balance = balance - amount;
            System.out.println("Sucessful Withdrawal: " + amount);
        } else if (amount > balance) {
            System.out.println("Insufficient Balance.");
        } else {
            System.out.println("Invalid transaction.");
        }
    }

    //getter methods 
    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        
        Scanner scanz = new Scanner(System.in);
        BankAccount user = new BankAccount();
        user.userInfo("Renz");
        user.balInfo(0);

        System.out.println("Welcome to Bank Simulator " + user.getAccountHolder() + "!");

        while(true) {
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter Choice: ");
            int choice = scanz.nextInt();

            switch (choice) {
                case 1: 
                    System.out.print("Enter Amount: ");
                    double depositMoney = scanz.nextDouble();
                    user.depositMoney(depositMoney);
                    break; 

                case 2: 
                    System.out.print("Enter Amount: ");
                    double withdrawMoney = scanz.nextDouble();
                    user.withdrawMoney(withdrawMoney);
                    break;
                
                case 3: 
                    System.out.println("Current Balance: " + user.getBalance());
                    break;
                
                case 4: 
                    System.out.println("Thank you for using Bank Simulator");
                    scanz.close();
                    return;
                
                default: 
                    System.out.println("Invalid input");
                    break;
            }
        }
    }
}
