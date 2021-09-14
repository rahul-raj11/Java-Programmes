package Collection;

import java.util.Vector;

public class VectorDemo {

    public static void main(String[] args) {

        Vector<Integer> v = new Vector<>();

        for(int i = 1; i <= 5; i++) {
            v.add(i);
        }

        System.out.println(v);

        v.remove(3);

        System.out.println(v);

//        for (Integer integer : v) {
//            System.out.print(integer + " ");
//        }
        for(Integer val : v) {
            System.out.print(val + " ");
        }
    }
}
