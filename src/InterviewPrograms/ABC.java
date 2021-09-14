package InterviewPrograms;

import java.util.Arrays;
import java.util.Locale;

public class ABC {

    public static void main(String[] args) {

        // S = n * T

        System.out.println(function("abcabc", "abc"));
        System.out.println(function("abcdabcdabcd", "abcd"));
        System.out.println(function("abcdabc", "abc"));
    }





    public static int function(String s, String t) {
//        int count = 0;
//        String s1 = "";
//        boolean flag = true;
//        while(flag) {
//            s1 += t.toLowerCase();
//            if (s.toLowerCase().indexOf(s1) != -1) {
//                ++count;
//                flag = true;
//            } else {
//                flag = false;
//            }
//
//            //if(s.length() != s1.length()) return -1;
//        }
//        return count;

        String[] op = s.split("(?=" + t + ")");

        System.out.println(Arrays.toString(op));

        if(Arrays.stream(op).allMatch(s1 -> s1.equals(op[0]))) {
            return op.length;
        } else {
            return -1;
        }
    }
}
