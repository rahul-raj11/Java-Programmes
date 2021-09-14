package InterviewPrograms;

import java.util.Scanner;

public class FibonacciWithRecursion {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number upto which Fibonacci series to print: ");
        int number = scanner.nextInt();

        System.out.println("Fibonacci series upto " + number +" numbers : ");
        for(int i = 1; i <= number; i++) {
            System.out.print(fibonacci2(i) + " ");
        }
    }

    public static int fibonacci2(int num) {
        if (num == 1 || num == 2) {
            return 1;
        }
        return fibonacci2(num - 1) + fibonacci2(num - 2);
    }
}
