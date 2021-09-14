package Collection;

import java.util.*;

public class HashMapDemo {

    public static void main(String[] args) {

        HashMap<Integer, String> map1 = new HashMap<>();
        System.out.println(map1.put(101, "raj"));
        System.out.println(map1.put(101, "rahul"));


        HashMap<String, Integer> map = new HashMap<>();
        map.put("Rahul", 700);
        map.put("Raj", 200);
        map.put("Naveen", 800);
        map.put("Shivam", 500);
        System.out.println(map);

        System.out.println(map.put("Rahul", 1000));

        Set<String> s = map.keySet();
        System.out.println(s);

        Collection<Integer> c = map.values();
        System.out.println(c);

        Set s1 = map.entrySet();
        System.out.println(s1);

        Iterator iterator = s1.iterator();
        while(iterator.hasNext()) {
            Map.Entry m1 = (Map.Entry) iterator.next();
            System.out.println(m1.getKey() + " --------- " + m1.getValue());

            System.out.println(m1);
        }

    }
}
