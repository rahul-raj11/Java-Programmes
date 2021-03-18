package Programes;

import java.util.Scanner;

public class NumberPalindrome {

    public static Scanner scanner;

    public static void main(String[] args) {

        scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scanner.nextInt();
        System.out.println("Entered number " + num + " is palindrome: " + isPalindrome(num));
    }

    public static boolean isPalindrome(int number) {
        int original = number;
        int reverse = 0;

        while(number != 0) {
            int lastDigit = number % 10;
            reverse = reverse * 10 + lastDigit;
            number /= 10;
        }

        if(original == reverse)
            return true;

        return false;
    }
}
