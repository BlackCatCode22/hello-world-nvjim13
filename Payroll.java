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

    static void theHelloMethod(){
        System.out.println("\n Hello from theHelloMethod() ");
    }

    // Create a method that gets input.
    static void aPersonalGreeting(String someName) {
        System.out.println("\n Hello " + someName + ", how are you today?");
    }

    // Create a method that gets two integers and returns their sum.
    //Create two int parameters
    static int sumTwoInts(int num1, int num2) {
        int mySum = 0;
        mySum = num1 + num2;

        return mySum;

    }

    public static void main(String[] args) {

        System.out.println("\n\n...Welcome to Methods!\n");

        // Variables (members)
        String theUserName = "";

        // Create a Scanner objects
        Scanner scanner = new Scanner(System.in);
        // Get user name
        System.out.println("\n Please enter your name: ");
        theUserName = scanner.nextLine();

        // Call (invoke) our greeting method
        aPersonalGreeting(theUserName);


        theHelloMethod();

        // variable.
        int aSum = 0


        // Call our new sum method.
        aSum = sumTwoInts(3, 4);

        System.out.println("\n aSum is: " + aSum);

        System.out.println("\n This is the end of my program");








        // Fields used in this program
        String userName = "";
        int hoursWorked = 0;
        int overTimeHours = 0;
        double hourlyPayrate = 0.0;
        double weeklyPayWithoutOverTime = 0.0;
        double overTimePay = 0.0;
        double totalWeeklyPay = 0.0;

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
        hourlyPayrate = Double.parseDouble(myScannerObj.nextLine());


        // Get weekly hours worked from the user.
        // Output statement prompting the user for hrs worked
        System.out.println(" \n Please enter how many hours you worked this week.\n(Only using whole numbers):");
        // Use the scanner object to get input from this prompt and store what was returned
        // from your Scanner object in a field
        hoursWorked = myScannerObj.nextInt();

        // Create an output statement to the used echoing the user's input
        System.out.println("\nHey " + userName + ", you worked: " + hoursWorked + " hours this week!");

        // Check if user worked overtime (more than 40 hours)
        if (hoursWorked > 40) {
            // Regular pay for 40 hours
            weeklyPayWithoutOverTime = 40 * hourlyPayrate;
            // Calculate overtime hours
            overTimeHours = hoursWorked - 40;
            // Overtime pay at 1.5x the hourly rate
            overTimePay = overTimeHours * hourlyPayrate * 1.5;
        }
        else {
            // If no overtime, just calculate regular pay
            weeklyPayWithoutOverTime = hoursWorked * hourlyPayrate;
        }

        // Total pay = regular pay + overtime pay
        totalWeeklyPay = weeklyPayWithoutOverTime + overTimePay;

        // Output the result to the user
        System.out.println("\nYour weekly pay rate is: $" + totalWeeklyPay + " for " + hoursWorked + " hours this week!" +
                "\n\nHere is a breakdown:\nOvertime Hours: " + overTimeHours + "\nOvertime Pay: " + overTimePay + "\nRegular Pay: " + weeklyPayWithoutOverTime);

    }
}