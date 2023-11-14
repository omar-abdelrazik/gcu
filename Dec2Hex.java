import java.util.Scanner;


public class Dec2Hex {

    public static String convertDecToHex(int decimal) {
        char[] ch = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        int rem;
        String hexadecimal = "";
        while (decimal != 0) {
            rem = decimal % 16;
            hexadecimal = ch[rem] + hexadecimal;
            decimal = decimal / 16;
        }
        return hexadecimal;
    }

    public static void main(String[] args) {
        if (args.length == 0) {
            System.err.println("Error: Please provide an input argument.");
            System.exit(1);
        }

        try {
            int Arg1 = Integer.parseInt(args[0]);
            System.out.println("Converting the Decimal Value " + Arg1 + " to Hex...");
            String hexResult = convertDecToHex(Arg1);
            System.out.println("Hexadecimal representation is: " + hexResult);
            System.out.println("Welcome OMAR ");
        } catch (NumberFormatException e) {
            System.err.println("Bug: You have to enter an integer input.");
            System.exit(1);
        }
    }
}
