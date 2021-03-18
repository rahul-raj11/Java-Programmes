package Patterns;

public class Pattern4 {

    public static void main(String[] args) {

        for (int i = 5; i > 0; i--) {
            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = i; k > 0; k--) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
