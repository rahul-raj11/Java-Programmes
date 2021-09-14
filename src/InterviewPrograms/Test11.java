package InterviewPrograms;

import java.util.Arrays;

public class Test11 {

    public static void main(String[] args) {
        int[] arr = {10, 65, 47, 1, 59, 20, 99, 75, 88};
        System.out.println(binarySearch(arr, 65));
    }

    public static int binarySearch(int[] arr, int val) {
        Arrays.sort(arr);
        for(int a : arr) {
            System.out.print(a + " ");
        }
        System.out.println();
        int low = 0;
        int high = arr.length -1;
        while(low <= high) {
            int mid = (high + low) / 2;
            if(arr[mid] == val) return mid;
            if(val < arr[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }
}
