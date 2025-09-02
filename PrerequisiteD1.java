//Accept a year and check whether it's a leap year

class LeapYearCheck {
    public static void main(String[] args) {
        int year = 2024;
        if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("Leap Year");
        } else {
            System.out.println("Not a Leap Year");
        }
    }
}
