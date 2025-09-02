//Write a menu-driven program using switch-case for different math operations

class MenuDrivenCalculator {
    public static void main(String[] args) {
        int a = 12, b = 4;
        int choice = 3; // 1-Addition, 2-Subtraction, 3-Multiplication, 4-Division
        switch(choice) {
            case 1: System.out.println("Addition: " + (a + b)); break;
            case 2: System.out.println("Subtraction: " + (a - b)); break;
            case 3: System.out.println("Multiplication: " + (a * b)); break;
            case 4: System.out.println("Division: " + (a / b)); break;
            default: System.out.println("Invalid Choice");
        }
    }
}
