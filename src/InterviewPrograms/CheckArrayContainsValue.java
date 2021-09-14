package InterviewPrograms;

import java.util.Objects;

public class CheckArrayContainsValue {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        Integer[] arr1 = {1, 2, 3, 4, 5};
        System.out.println(contains(arr1, 5));

        System.out.println(contains1(arr, 5));

        System.out.println("*************************");
        int[] arr2 = {9, 1, 5, 3, 4, 2, 7};
                //{-20, 34, 21, -87, 92, Integer.MAX_VALUE};
        //{1, 5, 3, 4, 2, 7};
        int largest = arr2[0];
        //int largest = Integer.MIN_VALUE;
        int smallest = arr2[0];
        //int smallest = Integer.MAX_VALUE;

        for(int num : arr2) {
            if(num > largest)
                largest = num;
            else if(num < smallest)
                smallest = num;
        }

        System.out.println("Max value: " + largest + " ------- " + "Min value: " + smallest);
    }

    public static <T> boolean contains(T[] arr, T val) {
        for(T e : arr) {
            if (Objects.equals(val, e))
                return true;
        }
        return false;
    }

    public static boolean contains1(int[] arr, int val) {
        for(int i : arr) {
            if(i == val) {
                return true;
            }
        }
        return false;
    }
}

