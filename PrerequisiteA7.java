//Accept a double value and print its binary equivalent without using built-in functions

class DoubleBinarySimple {
    public static void main(String[] args) {
        double num = 10.0;
        int n = (int) num;
        String binary = " ";
        while (n > 0) {
            binary = (n % 2) + binary;
            n = n / 2;
        }
        System.out.println(binary);
    }
}
