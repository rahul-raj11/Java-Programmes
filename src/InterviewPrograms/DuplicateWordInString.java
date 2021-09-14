package InterviewPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class DuplicateWordInString {

    public static void main(String[] args) {
        //String s = "Hey java is java best language is java";

        findDuplicateWords("Hey java is java best language is java");
    }

    public static void findDuplicateWords(String s) {
        String[] arr = s.split(" ");


        //Map<String, Integer> m = new HashMap<>();
        Map<String, Integer> m = new TreeMap<>();

        for(String a : arr) {
            Integer count = m.get(a);
            m.put(a, (count == null) ? 1 : count+1);
        }

        System.out.println(m);

        System.out.println(m.entrySet());

        for(Map.Entry<String,Integer> me : m.entrySet()) {
            if(me.getValue() > 1) {
                System.out.println(me.getKey() + " " + me.getValue());
            }
        }
    }




}
