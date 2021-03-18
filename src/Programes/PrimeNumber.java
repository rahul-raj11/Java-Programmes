package Programes;

import java.util.Scanner;

public class PrimeNumber {

    public static Scanner scanner;

    public static void main(String[] args) {

        int count = 0;
        scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            if (isPrime(i)) {
                System.out.println(i + " is a prime number");
                count++;
            }
        }
        System.out.println("Total number of prime numbers ranging from 1-" + n + " is " + count);
    }

    public static boolean isPrime(int num) {
        if(num == 1)
            return false;
        //for (int i = 2; i <= num/2; i++) {
        for (int i = 2; i <= (long) Math.sqrt(num); i++) {
            if(num % i == 0)
                return false;
        }
        return true;
    }
}
