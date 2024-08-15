// This is a comment!!
/*
 * Noemi Vergara
 * 5-15-24
 * LargestofThree.java
 */

import java.util.Scanner;  // Import the Scanner class


public class LargestofThree {
    public static void main(String[] args) {

        System.out.println(" \n\n Welcome to the Largest of Three Program \n\n");

        int firstNum = 0;
        int secondNum = 0;
        int thirdNum = 0;
        int largestofThree = 0;

        // Create a Scanner object
        Scanner myScannerObject = new Scanner(System.in);

        // Ask user for first int
        System.out.println("\n Please enter a whole number: ");
        firstNum = myScannerObject.nextInt();

        // Ask user for second int
        System.out.println("\n Please enter a whole number: ");
        secondNum = myScannerObject.nextInt();

        // Ask user for third int
        System.out.println("\n Please enter a whole number: ");
        thirdNum = myScannerObject.nextInt();

        // Processing
        // Compare the three ints with nested if statments

        if (firstNum>secondNum) {
            if (firstNum > thirdNum) {
                largestofThree = firstNum;
            } else
            {
                largestofThree = thirdNum;
            }
        }
        else {
            if (secondNum > thirdNum) {
                largestofThree = secondNum;
            }
            else
            {
                largestofThree = thirdNum;
        }
        }

//Output largest of three
System.out.println("\n The largest of three is: " + largestofThree);
    }
}