package org.example;

import java.util.Scanner;

public class CalculateParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan lama parkir (jam): ");
        int hours = scanner.nextInt();

        double biaya = calculateParkingFee(hours);
        System.out.println("Biaya parkir yang harus dibayar: $" + biaya);

        scanner.close();
    }
    public static double calculateParkingFee(int hours) {
        double baseFee = 1.0; // Biaya 5 jam pertama
        double hourlyRate = 0.5; // Biaya per jam setelah 5 jam pertama
        double maxFee = 15.0; // Biaya maksimum setelah 24 jam

        if (hours <= 5) {
            return baseFee * hours;
        } else if (hours < 24) {
            return (baseFee * 5) + hourlyRate * (hours - 5);
        } else if (hours == 24){
            return maxFee;
        } else{
            double fee = hours - 24;
            return maxFee + (fee * 0.5);
        }
    }

}