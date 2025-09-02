//Accept three numbers and find the greatest using ternary operator only

class GreatestOfThree {
    public static void main(String[] args) {
        int a = 10, b = 25, c = 15;
        int greatest = (a > b) ? (a > c ? a : c) : (b > c ? b : c);
        System.out.println(greatest);
    }
}
