//Accept a float value and display its integer and decimal part separately

import java.util.Scanner;

public class AcceptFloat {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a float value: ");
        String input = sc.next();
        int dotIndex = input.indexOf(".");
        String intPart = input.substring(0, dotIndex);
        String decPart = input.substring(dotIndex);
        System.out.println("Integer" + intPart);
        System.out.println("Decimal " + dec);
    }
}
