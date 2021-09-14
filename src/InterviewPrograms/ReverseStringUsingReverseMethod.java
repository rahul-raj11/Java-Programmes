package InterviewPrograms;

import java.util.*;

public class ReverseStringUsingReverseMethod {

    public static void main(String[] args) {

        String s = "Selenium";
        //s.matches()
        //"Selenium";
        if(s == null) {
            throw new IllegalArgumentException("Null is not valid");
        }
        String s1 = "";
        char[] c = s.toCharArray();
        for(int i = c.length-1; i >=0; i--) {
            s1 += c[i];
        }
        System.out.println(s);
        System.out.println(s1);

        StringBuilder sb = new StringBuilder(s);
        System.out.println(sb.reverse());

        String[] names = {"Java", "JavaScript", "Ruby", "C", "Python", "Java", "C", "Raja"};
        int[] nums = {1, 3, 5, 7, 9, 11, 1, 9};

        Set<String> store = new HashSet<>();
        for(String name : names) {
            if(!store.add(name))
                System.out.println(name);
        }
        System.out.println(store);

        System.out.println("******************************************");


        //Map<String, Integer> map = new HashMap<>();
        Map<String, Integer> map = new TreeMap<>(new MyComparator());

        for(String name: names) {
            Integer count = map.get(name);
            map.put(name, (count == null) ? 1 : count + 1);
        }
        Map<Integer, Integer> map1 = new TreeMap<>();
        for(int num: nums) {
            Integer count = map1.get(num);
            map1.put(num, (count == null) ? 1 : count + 1);
        }

        System.out.println(map.entrySet());

        System.out.println(map1.entrySet());

        //Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        for(Map.Entry<String, Integer> mh : map.entrySet()) {
        //for(Map.Entry<String, Integer> entry: entrySet) {
            //System.out.print(mh.getKey() + " ");
            //System.out.println(mh.getKey() + " : " + mh.getValue());
//            if(mh.getValue() > 1) {
//                System.out.println(mh.getKey()+ " : " + mh.getValue());
//            }
            if(mh.getKey().matches(".*a.*a.*"))
                System.out.println(mh.getKey());
        }

        for(Map.Entry<Integer, Integer> mh : map1.entrySet()) {
            if(mh.getValue() > 1) {
                System.out.println(mh.getKey());
            }
        }


    }
}

class MyComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        return o2.compareTo(o1);
    }
}
