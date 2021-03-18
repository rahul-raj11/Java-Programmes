package Programes;

public class SumOddRange {

    public static void main(String[] args) {

        System.out.println("Sum of odd numbers are " + sumOdd(100, 1000));
    }

    public static boolean isOdd(int number) {
        if(number < 0)
            return false;

        if(number % 2 != 0)
            return true;
        else
            return false;
    }

    public static int sumOdd(int start, int end) {
        int sum = 0;
        if(start < 0 || end < 0 || end < start)
            return -1;

        for(int i = start; i <= end; i++) {
            if(isOdd(i)) {
                sum += i;
            }
        }
        return sum;
    }
}
