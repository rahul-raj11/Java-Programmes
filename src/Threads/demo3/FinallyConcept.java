package Threads.demo3;

public class FinallyConcept {

    public static void main(String[] args) {
        test1();
    }

    public static void test1() throws ArithmeticException {
        try {
            System.out.println("Inside test1 try block");
            //throw new RuntimeException("test1");
            int i = 5/0;
        }
//        catch (Exception e) {
//            System.out.println("Inside test1 catch block");
//        }

        finally {
            System.out.println("Inside test1 finally block");
        }
    }
}
