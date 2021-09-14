package InterviewPrograms;

import java.util.Scanner;

public class FibonacciWithoutRecursion {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number upto which Fibonacci series to print: ");
        int number = scanner.nextInt();

        System.out.println("Fibonacci series upto " + number +" numbers : ");
        for(int i = 1; i <= number; i++) {
            System.out.print(fibonacci1(i) + " ");
        }
    }

    public static int fibonacci1(int num) {
        if(num == 1 || num == 2) {
            return 1;
        }
        int fibo1 = 1, fibo2 = 1, fibonacci = 0;
        for(int i = 3; i <= num; i++) {
            fibonacci = fibo1 + fibo2;
            fibo1 = fibo2;
            fibo2 = fibonacci;
        }
        return fibonacci;
    }
}
