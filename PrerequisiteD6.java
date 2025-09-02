//Create a login system where a user has 3 chances to enter correct password

class LoginSystem {
    public static void main(String[] args) {
        String correctPassword = "java2025";
        String enteredPassword = "java2025";
        int attempts = 3;

        if(enteredPassword.equals(correctPassword)) {
            System.out.println("Login Successful");
        } else {
            attempts--;
            if(attempts > 0) System.out.println("Try Again, attempts left: " + attempts);
            else System.out.println("Login Failed");
        }
    }
}
