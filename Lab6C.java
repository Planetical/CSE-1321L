/*
Class: 1321L
Section: WJ1
Term: Fall 2022
Instructor: Nick Murphy
Name: Adam Hutcheson
Lab#: 6C
 */
import java.util.Scanner;
public class Lab6C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int balance = 1000;
        String input = "y";
        System.out.println("Welcome!" +
                "\nYou have $" + balance + " in your account.");

        do {
            System.out.println("\nMenu" +
                    "\n0 - Make a deposit" +
                    "\n1 - Make a withdrawal" +
                    "\n2 - Display account value");
            System.out.println("\nPlease make a selection: ");
            int selection = sc.nextInt();

            switch (selection) {
                case 0:
                    System.out.println("How much would you like to deposit? : ");
                    int deposit = sc.nextInt();
                    balance += deposit;
                    System.out.println("Your current balance is $" + balance);
                    break;
                case 1:
                    System.out.println("How much would you like to withdraw? : ");
                    int withdrawal = sc.nextInt();
                    balance -= withdrawal;
                    System.out.println("Your current balance is $" + balance);
                    break;
                case 2:
                    System.out.println("Your current balance is $" + balance);
                    break;
                default:
                    System.out.println("Invalid entry, please try again.");
                    break;
            }
            System.out.println("Would you like to return to the main menu (Y/N)? : ");
            input = sc.next();

        } while (input.equalsIgnoreCase("y"));
        System.out.println("Thank you for banking with us!");
    }
}
