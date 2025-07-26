import java.util.Scanner;

public class Mobile {
    String brand;
    String model;
    double price;

    void setDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter brand: ");
        brand = sc.nextLine();
        System.out.print("Enter model: ");
        model = sc.nextLine();
        System.out.print("Enter price: ");
        price = sc.nextDouble();
    }

    void showDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        Mobile m = new Mobile();
        m.setDetails();
        m.showDetails();
    }
}