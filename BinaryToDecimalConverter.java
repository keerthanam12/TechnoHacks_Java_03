import java.util.Scanner;

public class BinaryToDecimalConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a binary number: ");
        String binaryInput = scanner.nextLine();

        // Check if the input is a valid binary number
        if (isBinary(binaryInput)) {
            int decimalResult = binaryToDecimal(binaryInput);
            System.out.println("Decimal equivalent: " + decimalResult);
        } else {
            System.out.println("Invalid binary number. Please enter a valid binary number.");
        }

        scanner.close();
    }

    // Function to check if a string is a valid binary number
    private static boolean isBinary(String binary) {
        return binary.matches("[01]+");
    }

    // Function to convert a binary number to decimal
    private static int binaryToDecimal(String binary) {
        int decimal = 0;
        int binaryLength = binary.length();

        for (int i = 0; i < binaryLength; i++) {
            int digit = Character.getNumericValue(binary.charAt(i));
            int power = binaryLength - 1 - i;
            decimal += digit * Math.pow(2, power);
        }

        return decimal;
    }
}