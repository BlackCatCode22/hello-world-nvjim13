// This is a comment!!
/*
* Noemi Vergara
* 5-15-24
* AddTwoInts.java
 */

import java.util.Scanner;  // Import the Scanner class


public class AddTwoInts {
    public static void main(String[] args) {
       System.out.println(" \n\n Welcome to Double Int Program \n\n");

       int firstNum = 0;
       int secondNum = 0;
       int sumofBoth = 0;

       System.out.println("\n The value of sumofBoth is: " + sumofBoth);

       // Create a Scanner object
        Scanner myScannerObject = new Scanner(System.in);

        // Ask user for first int
        System.out.println("\n Please enter a whole number: ");
        firstNum = myScannerObject.nextInt();

        // Unit text for our first user input
        System.out.println("\n The value of firstNum is: " + firstNum);

        // Ask user for second int
        System.out.println("\n Please enter a whole number: ");
        secondNum = myScannerObject.nextInt();

        // Unit text for our second user input
        System.out.println("\n The value of secondNum is: " + secondNum);

        // Processing
        // Add the two ints input from the user
        // the total of firstNum and secondNum will be stored in
        // the variable named: sumofBoth

        sumofBoth = firstNum + secondNum;

        // Output the value of the variable named: sumofBoth
        System.out.println("\n The value of sumofBoth is: " + sumofBoth);



    }
}