//Accept a number and check whether it is even or odd using bitwise AND

class EvenOddBitwise {
    public static void main(String[] args) {
        int num = 7;
        String result = (num & 1) == 0 ? "Even" : "Odd";
        System.out.println(result);
    }
}
