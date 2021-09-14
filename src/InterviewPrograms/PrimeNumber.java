package InterviewPrograms;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String args[]) {

        //get input till which prime number to be printed
        System.out.println("Enter the number till which prime number to be printed: ");
        int limit = new Scanner(System.in).nextInt();

        //printing primer numbers till the limit ( 1 to 100)
        System.out.println("Printing prime number from 1 to " + limit);
        for(int number = 2; number<=limit; number++){
            //print prime numbers only
            if(isPrime(number)){
                System.out.println(number + " is prime number");
            }
        }
    }

    public static boolean isPrime(int num) {
        if (num < 2) return false;
        //for (int i = 2; i < num/2; i++) {
        for (int i = 2; i < Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
