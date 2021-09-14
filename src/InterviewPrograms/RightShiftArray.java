package InterviewPrograms;

import java.util.Arrays;

public class RightShiftArray {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        printRightShiftedArray(numberOfShift(arr, 3));

        //System.out.println(Arrays.toString(shiftedArr));
    }

    public static void printRightShiftedArray(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    public static int[] numberOfShift(int[] arr, int num){

        for(int i = 0; i < num; i++) {
            rightShiftArray(arr);
        }

        return arr;
    }

    public static int[] rightShiftArray(int[] arr) {

        int temp = arr[arr.length - 1];

        for(int i = arr.length - 1; i > 0; i--) {

            arr[i] = arr[i - 1];

        }

        arr[0] = temp;

        return arr;
    }
}


