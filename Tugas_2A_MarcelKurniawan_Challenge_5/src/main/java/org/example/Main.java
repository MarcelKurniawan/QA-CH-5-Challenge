package org.example;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nomor akun: ");
        String accountNumber = scanner.next();

        System.out.print("Masukkan nama pelanggan: ");
        String customerName = scanner.next();

        System.out.print("Masukkan alamat email: ");
        String email = scanner.next();

        System.out.print("Masukkan nomor telepon: ");
        String phoneNumber = scanner.next();
        BankAccount myAccount = new BankAccount(accountNumber, 0, customerName, email, phoneNumber);

        System.out.println("\nCustomer: " + myAccount.getCustomerName());
        System.out.println("Account Number: " + myAccount.getAccountNumber());
        System.out.println("Balance: $" + myAccount.getBalance());

        System.out.println("\nSelamat datang di Layanan Bank!");
        while (true) {
            System.out.println("\nPilih layanan:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Cek Saldo");
            System.out.println("4. Keluar");

            int choice = scanner.nextInt();
            double amount;

            switch (choice) {
                case 1:
                    System.out.print("Masukkan jumlah deposit: $");
                    amount = scanner.nextDouble();
                    myAccount.deposit(amount);
                    break;
                case 2:
                    System.out.print("Masukkan jumlah withdrawal: $");
                    amount = scanner.nextDouble();
                    myAccount.withdraw(amount);
                    break;
                case 3:
                    System.out.println("Saldo Anda: $" + myAccount.getBalance());
                    break;
                case 4:
                    System.out.println("Terima kasih. Selamat tinggal!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }
    }
}