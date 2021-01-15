package classstructureintegrate;

import java.util.Scanner;

public class Bank {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your primary account number (e.g.xxxxxxxx-xxxxxxxx-xxxxxxxx): ");
        String accountNumber = scanner.nextLine();
        System.out.println("Please enter the name of the primary account owner: ");
        String owner = scanner.nextLine();
        System.out.println("Please enter your initial balance: ");
        int balance = scanner.nextInt();
        scanner.nextLine();
        BankAccount primaryAccount = new BankAccount(accountNumber, owner, balance);

        System.out.println("Please enter your secondary account number (e.g.xxxxxxxx-xxxxxxxx-xxxxxxxx): ");
        String accountNumber2 = scanner.nextLine();
        System.out.println("Please enter the name of the primary account owner: ");
        String owner2 = scanner.nextLine();
        System.out.println("Please enter your initial balance: ");
        int balance2 = scanner.nextInt();
        scanner.nextLine();
        BankAccount secondaryAccount = new BankAccount(accountNumber2, owner2, balance2);

        System.out.println(primaryAccount.getInfo());
        System.out.println(secondaryAccount.getInfo());



        System.out.println("Please enter your deposit amount to primary account: ");
        int deposit = scanner.nextInt();
        scanner.nextLine();
        primaryAccount.deposit(deposit);
        System.out.println("Please enter your withdraw amount from the secondary account: ");
        int withdraw = scanner.nextInt();
        scanner.nextLine();
        secondaryAccount.withdraw(withdraw);
        System.out.println("Please enter how much you want to transfer from secondary to primary account: ");
        int transfer = scanner.nextInt();
        scanner.nextLine();
        secondaryAccount.transfer(primaryAccount, transfer);

        System.out.println(primaryAccount.getInfo());
        System.out.println(secondaryAccount.getInfo());
    }

}
