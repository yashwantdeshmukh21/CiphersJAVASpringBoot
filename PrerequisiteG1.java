//Accept a number and print all its factors

class Factors {
    public static void main(String[] args) {
        int n = 12;
        System.out.print("Factors: ");
        for(int i = 1; i <= n; i++) {
            if(n % i == 0) System.out.print(i + " ");
        }
    }
}
