//Accept an integer and toggle its bits using bitwise XOR

class ToggleBits {
    public static void main(String[] args) {
        int num = 5;
        int toggled = num ^ 0xFFFFFFFF;
        System.out.println(toggled);
    }
}
