//Accept a 3-digit number and print the sum of its digits

class SumOfDigits {
    public static void main(String[] args) {
        int num = 345;
        int d1 = num / 100;
        int d2 = (num / 10) % 10;
        int d3 = num % 10;
        int sum = d1 + d2 + d3;
        System.out.println(sum);
    }
}
