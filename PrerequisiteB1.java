//Use ternary operator to check whether a number is positive, negative, or zero

class NumberSign {
    public static void main(String[] args) {
        int num = -5;
        String result = (num > 0) ? "Positive" : (num < 0) ? "Negative" : "Zero";
        System.out.println(result);
    }
}
