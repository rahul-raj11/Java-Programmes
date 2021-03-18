package Programes;

import java.util.Scanner;

public class EvenDigitSum {

    public static Scanner scanner;

    public static void main(String[] args) {

        scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        System.out.println("Sum of even digits of number " + number + " is " + getEvenDigitSum(number));
    }

    public static int getEvenDigitSum(int number) {
        int sum = 0;

        if(number < 0)
            return -1;

        while(number != 0) {
            int digit = number % 10;

            if(digit % 2 == 0)
                sum += digit;

            number /= 10;
        }
        return sum;
    }
}
