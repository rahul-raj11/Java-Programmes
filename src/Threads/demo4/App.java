package Threads.demo4;

import java.util.Scanner;

// volatile keyword is used to prevent thread chasing variables when they are not changed from within from that thread
class Processor extends Thread {

    private volatile boolean running = true;
    public void run() {
        while(running) {
            System.out.println("Hello");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

    public void shutDown() {
        running = false;
    }
}

public class App {

    public static void main(String[] args) {

        Processor p = new Processor();
        p.start();

        System.out.println("Press return to stop...");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();

        p.shutDown();
    }
}
