import java.util.Scanner;

class Dec2Hex {

    public static void main(String args[]) {
        // Check for input argument
        if (args.length == 0) {
            System.err.println("Error: Please provide an input argument.");
            System.exit(1);
        }

        // Parse the input argument as an integer
        try {
            int Arg1 = Integer.parseInt(args[0]);

            // Continue with the rest of your code
            char ch[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
            int rem, num;
            num = Arg1;
            String hexadecimal = "";
            System.out.println("Converting the Decimal Value " + num + " to Hex...");

            while (num != 0) {
                rem = num % 16;
                hexadecimal = ch[rem] + hexadecimal;
                num = num / 16;
            }

            System.out.println("Hexadecimal representation is: " + hexadecimal);
            System.out.println("THANKYOU ");


        } catch (NumberFormatException e) {
            // Handle non-integer inputs
            System.err.println("Error: Input must be an integer.");
            System.exit(1);
        }
    }
}
