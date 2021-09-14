package Programes;

import java.util.Arrays;

public class LargestSmallestInt {

    public static void main(String[] args) {
        int[] arr = {0, -1};

        int largest = arr[0];
        int smallest = arr[0];

        for(int el : arr) {
            if(el > largest)
                largest = el;
            else if(el < smallest)
                smallest = el;
        }

        System.out.println("Array: " + Arrays.toString(arr));
        System.out.println("Largest: " + largest);
        System.out.println("Smallest: " + smallest);


        String s = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder sb = new StringBuilder(s);
        System.out.println(sb.reverse());
    }
}
