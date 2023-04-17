package review_java;

    
import java.util.InputMismatchException;
import java.util.Scanner;

public class Review {

    public static void main(String[] args) {

        Scanner scannerA = new Scanner(System.in);
        AllTests test = new AllTests(scannerA);

        test.testArrayList();
        test.testSubstring();
        test.testString();
        test.testStringFormat();
        test.testArray();
        test.testException();

        /**
         * 
         * 
         * try{
         * test.testScanner();
         * }
         * catch (InputMismatchException e) {
         * System.out.println("InputMismatchException detected: " + e.getMessage());
         * 
         * }
         */
        

    }

}
    

