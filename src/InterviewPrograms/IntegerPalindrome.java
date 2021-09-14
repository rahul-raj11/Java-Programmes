package InterviewPrograms;

import java.util.Scanner;

public class IntegerPalindrome {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scanner.nextInt();
        scanner.nextLine();
//        System.out.println("Enter a temporary number 0:");
//        int temp = scanner.nextInt();
        System.out.println(isPalindrome(num));
        scanner.close();


//        if(num == reverse(num, temp))
//            System.out.println("YES");
//        else
//            System.out.println("NO");
        //System.out.println(isPalindrome(num, temp));
    }
    // recursive approach
//    public static int reverse(int num, int temp) {
//        if(num == 0)
//            return temp;
//
//        temp = (temp * 10) + (num % 10);
//
//        return reverse(num / 10, temp);
//    }

public static boolean isPalindrome(int num) {
    // Non recursive approach
    int palindrome = num;
    int reverse = 0;
    while(palindrome != 0) {
        int remainder = palindrome % 10;
        reverse = (reverse * 10) + remainder;
        palindrome /= 10;
    }

    if(num == reverse)
        return true;
    return false;
}
}
