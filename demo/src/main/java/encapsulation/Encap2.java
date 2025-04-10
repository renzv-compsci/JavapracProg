package encapsulation;

import java.util.Scanner;
// Digital Wallet
// Simulate digital wallet where users can deposit and withdraw money

public class Encap2 {
    // defigning class with attributes
    private double balance;

    public void setWallet(double balance) {
        // setting attributes
        this.balance = balance;
    }

    // method to deposit money
    public void deposit(double amount) {
        // creates another method for withdraw function
        if (amount >= 50) {
            balance += amount;
            System.out.println("Successful transaction: " + amount);
        } else if (amount < 10) {
            System.out.println("You have low balance");
        } else {
            System.out.println("Unsuccessful transaction. Should be 50 above.");
        }
    }

    // method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Successfuly Withdraw: " + amount);
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            System.out.println("Invalid withdraw");
        }
    }

    // geter methods 
    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        
        // scanner class 
        Scanner scanz = new Scanner(System.in);
        // creating object for the pracset2
        Encap2 wallet = new Encap2();


        System.out.println("Welcome to Digital Wallet");

        // loops until user chose exit 
        while (true) { 
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter Choice: ");
            int choice = scanz.nextInt();

            switch (choice) {
                
                case 1:
                    System.out.print("Enter amount: ");
                    double depositAmount = scanz.nextDouble();
                    wallet.deposit(depositAmount);
                    break;

                case 2:
                    System.out.print("Enter amount: ");
                    double withdrawAmount = scanz.nextDouble();
                    wallet.withdraw(withdrawAmount);
                    break;

                case 3:
                    System.out.println("Current Balance: " + wallet.getBalance());
                    break;

                case 4: 
                    System.out.println("Thank you for using Digital Wallet");
                    scanz.close();
                    return; 

                default:
                    System.out.println("Invalid input.");
                    break;
            }
        }
    }
}
