package InterviewPrograms;

import java.util.BitSet;

public class PrintMissingNumber {

    public static void main(String[] args) {

        int[] arr = {11,12,13,14,15,16,17,18};
        int count1 = 9;

        //n*(n+1)/2
        int count = 20;
        printMissingNumbers(arr, count);
    }

    private static void printMissingNumbers(int[] arr, int count) {
        int missingCount = count - arr.length;

        BitSet b1 = new BitSet(count);

        for (int num : arr) {
            b1.set(num -1);
        }

        System.out.println("B1: " + b1);

        int lastMissingIndex = 0;

        for(int i = 0; i < missingCount; i++) {
            lastMissingIndex = b1.nextClearBit(lastMissingIndex);
            System.out.println(++lastMissingIndex);
        }
    }
}
