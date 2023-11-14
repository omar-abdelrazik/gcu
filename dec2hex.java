import java.util.Scanner;

public class Dec2Hex {

    public static void main(String[] args) {
        // Check for input argument
        if (args.length == 0) {
            System.err.println("Error: No input provided. Please provide a decimal number as an input argument.");
            return; // Using return instead of System.exit for a softer exit
        }

        try {
            // Parse the input argument as an integer
            int decimalNumber = Integer.parseInt(args[0]);
            System.out.println("Converting the Decimal Value " + decimalNumber + " to Hex...");

            // Convert to hexadecimal using built-in method
            String hexString = Integer.toHexString(decimalNumber).toUpperCase();

            System.out.println("Hexadecimal representation is: " + hexString);
            System.out.println("THANKS OMAR");

        } catch (NumberFormatException e) {
            // Handle non-integer inputs
            System.err.println("Error: Invalid input. The input must be an integer.");
        }
    }
}
