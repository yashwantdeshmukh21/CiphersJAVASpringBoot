//Check if a number is a power of 2 using bitwise logic

class PowerOfTwo {
    public static void main(String[] args) {
        int num = 16;
        boolean isPower = (num > 0) && ((num&(num - 1))==0);
        System.out.println(isPower ? "Power of 2" : "Not Power of 2");
    }
}
