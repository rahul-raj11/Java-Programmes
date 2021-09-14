package InterviewPrograms;

import java.io.*;
import java.util.*;

public class CompartorExample {

    // { Driver Code Starts
//Initial Template for Java


    /*package whatever //do not write package name here */


    //class GFG {
        public static void main (String[] args) {

            int $_ = 10;
            System.out.println($_);
            //using Scanner class to take input
//            Scanner sc=new Scanner(System.in);
//
//            //taking total number of testcases
//            int t=sc.nextInt();
//
//            while(t-->0)
//            {
//                //taking total number of Strings
//                int n=sc.nextInt();
//
//                //Declaring and Initializing an array
//                //of type String and size n
//                String[] arr = new String[n];
//
//                //adding elements to the array
//                for(int i=0;i<n;i++)
//                    arr[i]=sc.next();

                //calling sorByComparator method
                //and passing the String array
            String[] arr = {"Abc", "Xyz", "fghfg", "adas", "tuTY", "dsa"};
                sortByComparator(arr);

                //printing the sorted Strings
                for(int i=0;i<arr.length;i++)
                    System.out.print(arr[i]+" ");

                System.out.println();
            //}
        }


        // } Driver Code Ends
//User function Template for Java


        public static void sortByComparator(String[] arr)
        {
            //Your code here
            //You sort it in a single line using method references
            //Arrays.sort(arr, new ComparatorTest());
            //Arrays.sort(arr, (s1, s2) -> s1.toLowerCase().compareTo(s2.toLowerCase()));
            //Arrays.sort(arr, String::compareToIgnoreCase);
            Arrays.sort(arr, new Comparator(){
                @Override
                public int compare(Object o1, Object o2) {
                    String s1 = (String) o1;
                    String s2 = (String) o2;
                    return s1.toLowerCase().compareTo(s2.toLowerCase());
                }
            });
        }

// { Driver Code Starts.

    }

