//Accept a number and check whether it is an Armstrong number

class ArmstrongCheck {
    public static void main(String[] args) {
        int num = 153;
        int temp = num, sum = 0;
        while(temp != 0) {
            int digit = temp % 10;
            sum += digit*digit*digit;
            temp /= 10;
        }
        System.out.println(sum ==num ? "Armstrong":"Not Armstrong");
    }
}
