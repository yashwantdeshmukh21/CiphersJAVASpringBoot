//Accept a number and classify it as perfect, abundant, or deficient

class NumberClassification {
    public static void main(String[] args) {
        int num = 12;
        int sum = 0;
        for(int i = 1; i < num; i++) {
            if(num % i == 0) sum += i;
        }
        if(sum == num) System.out.println("Perfect Number");
        else if(sum > num) System.out.println("Abundant Number");
        else System.out.println("Deficient Number");
    }
}
