package Programes;

public class Lambdas {

    public static void main(String[] args) {

        //new Thread(new CodeToRun()).start();
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("Printing from Runnable..");
//            }
//        }).start();

        new Thread(()-> System.out.println("Printing from Runnable...")).start();
    }
}

class CodeToRun implements Runnable {

    @Override
    public void run() {
        System.out.println("Printing from Runnable.");
    }
}
