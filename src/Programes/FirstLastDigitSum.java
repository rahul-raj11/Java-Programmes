package Programes;

import java.util.Scanner;

public class FirstLastDigitSum {

    public static Scanner scanner;

    public static void main(String[] args) {

        scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scanner.nextInt();

        System.out.println("Sum of first and last diits of number " + num + " is " + sumFirstAndLastDigit(num));
    }

    public static int sumFirstAndLastDigit(int number) {
        int firstDigit = 0;
        int lastDigit = number % 10;

        if(number < 0)
            return -1;

        while (number != 0) {
            firstDigit = number % 10;
            number /= 10;
        }
        return firstDigit + lastDigit;
    }
}
