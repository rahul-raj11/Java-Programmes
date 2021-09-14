package InterviewPrograms;

import java.util.Arrays;

public class RemoveDuplicateFromArray {

    public static void main(String[] args) {

        int[] arr = {1, 3, 5, 4, 7, 9, 2, 5, 7, 11, 10, 11, 11};
        int len = arr.length;
        for(int i = 0; i < len; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

//        int[] arr2 = removeDuplicate(arr);
        int[] arr2 = reverse(arr);
        for(int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
//
       System.out.println();
        //int len = arr.length;
        for (int i = 0; i < len; i++) {
            for (int j = i+1; j < len; j++) {
                if(arr[i] == arr[j]) {
                    arr[j] = arr[len - 1];
                    len--;
                    j--;
                }
            }
        }
        for(int i = 0; i < len; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int[] arr1 = Arrays.copyOf(arr, len);
        for(int i = 0; i < len; i++) {
            System.out.print(arr1[i] + " ");
        }
    }

    public static int[] removeDuplicate(int[] arr) {
        Arrays.sort(arr);
        int[] result = new int[arr.length];
        int firstNum = arr[0];
        result[0] = firstNum;
        for(int i = 1; i < arr.length; i++) {
            if(firstNum != arr[i]) {
                result[i] = arr[i];
            }
            firstNum = arr[i];
        }
        return result;
    }

    public static int[] reverse(int [] a){
        for(int i = 0; i < a.length / 2; i++){
            int temp = a[i]; // swap using temporary storage
            a[i] = a[a.length - i - 1];
            a[a.length - i - 1] = temp;
        }
        return a;
    }
}
