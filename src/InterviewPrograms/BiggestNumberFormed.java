package InterviewPrograms;

import java.util.*;

public class BiggestNumberFormed {

    public static void main(String[] args) {

//        String[] arr = {"54", "546", "548", "60"};
//
//        printLargest(arr);

        int i = 0;
        for (foo('A'); foo('B') && (i < 2); foo('C'))
        {
            i++;
            foo('D');
        }

    }

    static boolean foo(char c)
    {
        System.out.print(c);
        return true;
    }

    static void printLargest(String[] arr) {

        List l = Arrays.asList(arr);

        Collections.sort(l, new Comparator<String>() {

            @Override
            public int compare(String o1, String o2) {
                String xy = o1 + o2;   // 54546    54860
                String yx = o2 + o1;   // 54654    60548

                return xy.compareTo(yx) > 0 ? -1 : 1;
            }
        });

        Iterator itr = l.iterator();

        while(itr.hasNext()) {
            System.out.print(itr.next());
        }
    }

}

