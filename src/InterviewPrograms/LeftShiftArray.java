package InterviewPrograms;

import java.util.Arrays;

public class LeftShiftArray {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        // {2, 3, 4, 5, 6, 7, 8, 9, 1}

        int[] shiftedArr = numberOfShift(arr, 3);

        System.out.println(Arrays.toString(shiftedArr));


    }

    public static int[] numberOfShift(int[] arr, int num) {

        for (int i = 0; i < num; i++) {

            leftShiftArray(arr);

        }
         return arr;
    }

    public static int[] leftShiftArray(int[] arr) {

        int temp = arr[0];

        for (int i = 0; i < arr.length - 1; i++) {

            arr[i] = arr[i+1];

        }
        arr[arr.length - 1] = temp;

        return arr;
    }
}
