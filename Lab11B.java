import java.util.Scanner;

public class Lab11B {
    public static void main(String[] args) {
        boolean minChar,uppercase = false,digit = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a password: ");
        String password = sc.next();

        int length = password.length();
        if (length < 8) {
            minChar = false;
        } else minChar = true;

        for (int i = 0; i <= length; i++) {
            char Char = password.charAt(i);
            if (Character.isDigit(Char)){
                digit = true;
                break;
            } else {
                digit = false;
            }
        }

        for (int i = 0; i <= length; i++) {
            char Char = password.charAt(i);
            if (Character.isUpperCase(Char)) {
                uppercase = true;
                break;
            } else {
                uppercase = false;
            }
        }

        if (minChar == true && uppercase == true && digit == true) {
            System.out.println("Valid password");
        } else {
            System.out.println("Invalid password");
        }

        System.out.println("\nProgram Ends");
    }
}
