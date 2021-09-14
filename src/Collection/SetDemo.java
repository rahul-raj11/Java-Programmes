package Collection;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {

    public static void main(String[] args) {

        Set s = new HashSet();

        s.add("a");
        System.out.println(s.add(null));
        System.out.println(s.add(null));

        System.out.println(s);
    }
}
