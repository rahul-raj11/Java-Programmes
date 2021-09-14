package Collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayListDemo {

    public static void main(String[] args) {

        // Declaring the ArrayList with
        // initial size n
        ArrayList<Integer> al = new ArrayList<>();

        // Appending new elements at
        // the end of the list
        for(int i = 1; i <= 5; i++) {
            al.add(i);
        }

        ListIterator<Integer> lt = al.listIterator();
        while(lt.hasNext()) {
            int val = lt.next();
            System.out.println(val);
        }

//        System.out.println(al);
//
//        // Remove element at index 3
//        al.remove(3);
//
//        // Displaying the ArrayList
//        // after deletion
//        System.out.println(al);
//
//        // Printing elements one by one
//        for(int i = 0; i < al.size(); i++) {
//            System.out.print(al.get(i) + " ");
//        }
    }
}
