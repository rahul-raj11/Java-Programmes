package InterviewPrograms;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class StringPalindrome {

    public static void main(String[] args) {
        //.out.println("Enter a string value: ");
        //String value = new Scanner(System.in).next();
        //Arrays.s
        //String s = "";
        StringBuilder sb = new StringBuilder("madam");
        StringBuilder sb1;
        sb1 = sb.reverse();
        if(sb.equals(sb1))
            System.out.println(true);

        //System.out.println(isPalindrome(value));

    }

    public static boolean isPalindrome(String val) {
        String reverse = reverse(val);
        if (val.equals(reverse))
            return true;

        return false;
    }

    public static String reverse(String val) {
        if (val == null || val.isEmpty()) {
            return val;
        }
        val = val.toLowerCase();
        // Using recursion
            return val.charAt(val.length() - 1) + reverse(val.substring(0, val.length() - 1));
        //return "" + reverse(val.substring(0, val.length()));

        // Using empty string
//        String reverse = "";
//        for (int i = val.length() - 1; i >= 0; i--) {
//            reverse += val.charAt(i);
//        }
//        return reverse;

        // Using string builder
//        char[] arr = val.toCharArray();
//        StringBuilder sb = new StringBuilder();
//        for(int i = arr.length - 1; i >= 0; i--) {
//            sb.append(arr[i]);
//        }
//        String reverseOfString = sb.toString();
//        return reverseOfString;


    }
}
