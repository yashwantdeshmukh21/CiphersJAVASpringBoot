//Accept a float value and display its integer and decimal part separately.

class FloatParts {
    public static void main(String[] args) {
        float num = 63.678f;
        int integerPart = (int)num;
        float decimalPart = num - integerPart;
        System.out.println("Integer Part " + integerPart);
        System.out.println("Decimal Part " + decimalPart);
    }
}
