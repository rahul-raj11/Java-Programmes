package Collection;

import java.util.LinkedList;

public class LinkedListDemo {

    public static void main(String[] args) {

        // Declaring the LinkedList with
        // initial size n
        LinkedList<Integer> ll = new LinkedList<>();
        LinkedList<Integer> ll1 = new LinkedList<>();

        // Appending new elements at
        // the end of the list
        for(int i = 1; i <= 5; i++) {
            ll.add(i);
        }

        System.out.println(ll);

        ll.descendingIterator().forEachRemaining(ll1::add);
        System.out.println(ll1);

        // Remove element at index 3
        ll.remove(3);

        // Displaying the ArrayList
        // after deletion
        System.out.println(ll);

        // Printing elements one by one
        for(int i = 0; i < ll.size(); i++) {
            System.out.print(ll.get(i) + " ");
        }

    }
}
