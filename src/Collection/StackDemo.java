package Collection;

import java.util.Iterator;
import java.util.Stack;

public class StackDemo {

    public static void main(String[] args) {

        Stack<String> s = new Stack<>();
        s.push("geeks");
        s.push("for");
        s.push("geeks");
        s.push("geeks");

        Iterator<String> it = s.iterator();

        while(it.hasNext()) {
            System.out.print(it.next() + " ");
        }

        System.out.println();

        System.out.println(s.pop());

//        it = s.iterator();
//
//        while (it.hasNext()) {
//            System.out.print(it.next() + " ");
//        }
        for (String val : s) {
            System.out.print(val + " ");
        }

    }
}
