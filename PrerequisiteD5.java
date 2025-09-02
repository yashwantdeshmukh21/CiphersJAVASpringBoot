//Accept three sides and check whether triangle is valid and its type

class TriangleCheck {
    public static void main(String[] args) {
        int a = 5, b = 5, c = 8;
        if(a + b > c && a + c > b && b + c > a) {
            if(a == b && b ==c) System.out.println("Equilateral Triangle");
            else if(a ==b || b ==c || a ==c) System.out.println("Isosceles Triangle");
            else System.out.println("Scalene Triangle");
        } else {
            System.out.println("Not a valid Triangle");
        }
    }
}
