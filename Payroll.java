// Noemi Vergara
// 8/20/24
/*
* Payroll.java
*
* Input: User's name, weekly hours worked (no hour fractions), user's hourly payrate
*
* Processing: total weekly pay including overtime if more than 40 hours worked that week.
*
* Output: Polite greeting to the user and regular pay and overtime pay
*
*
*
*/
 //
// Import the Scanner class
import java.util.Scanner;

public class Payroll {
    public static void main(String[] args) {
        System.out.println("\n\n...Welcome to the Payroll Program...\n");

        // Fields used in this program
        String userName = "";
        int hoursWorked = 0;
        int overTimeHours;
        int anotherNumber;
        double hourlyPayrate = 0.0;
        double weeklyPayWithoutOverTime = 0.0;
        double overTimePay = 0.0

        // Say hello to the user and get user pay information.
        // Get the user's name.
        // Create a Scanner objects
        Scanner myScannerObj = new Scanner(System.in);

        // Get the user's name.
        System.out.println("\n Please enter your name: ");
        userName = myScannerObj.nextLine();

        System.out.println("\n Hello " + userName + ", I hope you are having an amazing day!");


        // Get hourly pay rate from the user.
        // Output statement prompting the user for hourly pay rate
        System.out.println(" \n Please enter your hourly pay rate:");
        // Use the scanner object to get input from this prompt and store what was returned
        // from your Scanner object in a field
        hourlyPayrate = myScannerObj.nextLine();


        // Get weekly hours worked from the user.
        // Output statement prompting the user for hrs worked
        System.out.println(" \n Please enter how many hours you worked this week.\n(Only using whole numbers):");
        // Use the scanner object to get input from this prompt and store what was returned
        // from your Scanner object in a field
        hoursWorked = myScannerObj.nextInt();

        // Create an output statement to the used echoing the user's input
        System.out.println("\n Hey " + userName + ", you worked: " + hoursWorked + " hours this week!");

        // Processing
        overTimeHours = hoursWorked - 40;
        if (hoursWorked > 40) {
            overTimePay = overTimeHours + hourlyPayrate * 1.5;
        }
        else {
            overTimePay = 0;
        }
        // Calculate weekly regular pay
        if (hoursWorked > 40) {
            weeklyPayWithoutOverTime = hourlyPayrate * 40;
        }


    }
}