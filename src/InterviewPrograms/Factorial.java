package InterviewPrograms;

public class Factorial {

    public static void main(String[] args) {
        System.out.println(factorial(5));
    }

    public static int factorial(int n) {
        int f = 1;
        f *= n;

        return factorial(n-1);
    }
}
