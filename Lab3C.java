
/*
Class: CSE 1321L
Section: WJ1
Term: Fall 2022
Instructor: Nick Murphy
Name: Adam Hutcheson
Lab#: 3C
 */
import java.util.Scanner;
import java.lang.Math;

public class Lab3C {
  public static void main(String[] args) {

    System.out.println("Enter the number of quarters: ");
    Scanner sc = new Scanner(System.in);
    int quarters = sc.nextInt();

    System.out.println("Enter the number of dimes: ");
    int dimes = sc.nextInt();

    System.out.println("Enter the number of nickels: ");
    int nickels = sc.nextInt();

    System.out.println("Enter the number of pennies: ");
    int pennies = sc.nextInt();

    float QUARTER_VALUE = 0.25f;
    float DIME_VALUE = 0.10f;
    float NICKEL_VALUE = 0.05f;
    float PENNY_VALUE = 0.01f;

    float totalQuarters = quarters * QUARTER_VALUE;
    float totalDimes = dimes * DIME_VALUE;
    float totalNickel = nickels * NICKEL_VALUE;
    float totalPenny = pennies * PENNY_VALUE;
    float total = totalQuarters + totalNickel + totalDimes + totalPenny;

    System.out.println("\nYou entered " + quarters + " quarters.");
    System.out.println("You entered " + dimes + " dimes.");
    System.out.println("You entered " + nickels + " nickels.");
    System.out.println("You entered " + pennies + " pennies.");

    int dollars = (int) total;
    float cents = ((total * 100) % 100);
    System.out.println("Your total is " + dollars + " dollars and " + (Math.round(cents)) + " cents.");

  }
}
