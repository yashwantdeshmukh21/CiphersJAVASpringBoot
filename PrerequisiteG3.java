//Accept a number and convert it to binary

class BinaryConversion {
    public static void main(String[] args) {
        int num = 13;
        String binary = "";
        int n = num;
        while(n > 0) {
            binary = (n % 2) + binary;
            n /= 2;
        }
        System.out.println("Binary: " + binary);
    }
}
