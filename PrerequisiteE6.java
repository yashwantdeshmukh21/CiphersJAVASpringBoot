//Accept a number and print the sum of even digits only

class SumEvenDigits {
    public static void main(String[] args) {
        int num = 123456;
        int sum = 0;
        while(num != 0) {
            int digit = num % 10;
            if(digit % 2 == 0) sum += digit;
            num /= 10;
        }
        System.out.println("Sum of Even Digits: " + sum);
    }
}
