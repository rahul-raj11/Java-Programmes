package InterviewPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {

    public static void main(String[] args) {

        String s = "My Name is xyz";
        String[] arr = s.split(" ");
        System.out.println(Arrays.toString(arr));
        s = s.replace(" ", "");
        System.out.println(s);
        String reverse = "";
        String finalStr = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            reverse += s.charAt(i);
            //reverse = reverse.trim();
        }
        System.out.println(reverse);

        int count = 0;
        List<Integer> wordLength = new ArrayList<>();
        for(String l : arr) {
            wordLength.add(l.length());
        }
        System.out.println(wordLength);

        while (count < reverse.length()) {
            for(Integer i : wordLength) {
                for(int j = 0; j <= i - 1; j++) {
                    finalStr += reverse.charAt(count);
                    count++;
                }
                finalStr += " ";
            }
            //System.out.println(finalStr.trim());
        }

        System.out.println(finalStr.trim());

    }
}
