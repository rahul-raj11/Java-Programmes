package Programes;

import java.util.Scanner;

public class DigitSum {

    public static Scanner scanner;
    public static void main(String[] args) {

        scanner = new Scanner(System.in);
        System.out.println("Enter a number which is greater than 10");
        int num = scanner.nextInt();
        System.out.println("Sum of digits for number " + num + " is " + sumDigits(num));

    }

    public static int sumDigits(int num) {

        int sum = 0;
        if(num < 10)
            return -1;

        while(num > 0) {
            int digit = num % 10;
            sum += digit;
            num /= 10;
        }
        return sum;
    }
}
