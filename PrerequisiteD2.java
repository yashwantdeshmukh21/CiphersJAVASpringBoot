//Accept 3 numbers and find the maximum using nested if-else

class MaxOfThree {
    public static void main(String[] args) {
        int a = 10, b = 25, c = 15;
        int max;
        if(a > b) {
            if(a > c) max = a;
            else max = c;
        } else {
            if(b > c) max = b;
            else max = c;
        }
        System.out.println("Maximum: " + max);
    }
}
