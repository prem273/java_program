import java.util.Scanner;

public class BinaryDecimalConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose an option:");
        System.out.println("1. Binary to Decimal");
        System.out.println("2. Decimal to Binary");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.print("Enter a binary number: ");
                String binary = sc.next();
                try {
                    int decimal = Integer.parseInt(binary, 2); 
                    System.out.println("Decimal equivalent: " + decimal);
                } catch (NumberFormatException e) {
                    System.out.println("Invalid binary number!");
                }
                break;
            case 2:
                System.out.print("Enter a decimal number: ");
                int decimal = sc.nextInt();
                String binaryStr = Integer.toBinaryString(decimal);
                System.out.println("Binary equivalent: " + binaryStr);
                break;
            default:
                System.out.println("Invalid choice!");
        }       
        sc.close();
    }
}
