package Collection;

import java.util.*;

public class Test {

    public static <LinkedHasSet> void main(String[] args) {
//        System.out.println("Entered main...");
//        try {
//            System.out.println("Entered try...");
//            System.out.println((float)13/3);
//            //System.exit(1);
//            System.out.println("Exited try...");
//        }
//        finally {
//            System.out.println("Entered finally...");
//            System.out.println("Exited finally...");
//        }

        int[] arr = {1,2,3,4,5,6,2,1,7,1,5,3,9};
        List al = new ArrayList();
        for(int a : arr) {
            al.add(a);
        }
        System.out.println(al);
        ListIterator li = al.listIterator();
        while (li.hasNext())
            System.out.println(li.next());


        LinkedHashSet<Integer> ls = new LinkedHashSet<>(al);
        System.out.println(ls);

        HashSet<Integer> hs = new HashSet<>(al);
        System.out.println(hs);
    }
}
