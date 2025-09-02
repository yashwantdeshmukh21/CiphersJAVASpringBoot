//Accept a number and check which data types (byte, short, int, long) it can fit into

class CheckDataType {
    public static void main(String[] args) {
        long num = 150;
        if (num >= Byte.MIN_VALUE && num <= Byte.MAX_VALUE) {
            System.out.println("byte");
        }
        if (num >= Short.MIN_VALUE && num <= Short.MAX_VALUE) {
            System.out.println("short");
        }
        if (num >= Integer.MIN_VALUE && num <= Integer.MAX_VALUE) {
            System.out.println("int");
        }
        if (num >= Long.MIN_VALUE && num <= Long.MAX_VALUE) {
            System.out.println("long");
        }
    }
}
