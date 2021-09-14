package InterviewPrograms;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Test1 {

    public static void main(String[] args) throws FileNotFoundException {

        File f = new File("");
        BufferedReader bf = new BufferedReader(new FileReader(f));

        System.out.println("This is test...");
    }
}
