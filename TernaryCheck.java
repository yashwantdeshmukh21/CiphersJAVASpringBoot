import java.util.Scanner;

public class TernaryCheck {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = Input.nextInt();

        String output = (num > 0)?"Positive":(num < 0) ? "Negative" : "Zero";

        System.out.println("The number is " + output);
    }
}