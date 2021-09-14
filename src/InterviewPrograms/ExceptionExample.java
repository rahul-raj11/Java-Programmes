package InterviewPrograms;

public class ExceptionExample {

    public static void main(String[] args) {

        try {
            divideByZero();
        }
        catch (ArithmeticException ex) {
            System.out.println("Arithmetic Exception Caught.....");
            ex.printStackTrace();
        }


    }

    public static void divideByZero () throws ClassCastException {
        int a = 3;
        int b = 0;
        int c = a/b;

        //throw new ArithmeticException();

    }
}
