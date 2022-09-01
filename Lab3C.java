/*
Class: CSE 1321L
Section: WJ1
Term: Fall 2022
Instructor: Nick Murphy
Name: Adam Hutcheson
Lab#: 3C
 */
import java.util.Scanner;

class Lab3C {
  public static void main(String[] args) {

    final float QUARTER_VALUE = 0.25f;
    final float DIME_VALUE = 0.05f;
    final float NICKEL_VALUE = 0.10f;
    final float PENNIES_VALUE = 0.01f;

    System.out.println("Enter the number of quarters:");
    Scanner sc = new Scanner(System.in);
    int numQuarters = sc.nextInt();

    System.out.println("Enter the number of dimes:");
    int numDimes = sc.nextInt();

    System.out.println("Enter the number of nickels:");
    int numNickels = sc.nextInt();

    System.out.println("Enter the number of pennies:");
    int numPennies = sc.nextInt();

    System.out.println("\nYou entered " + numQuarters + " quarters.");
    System.out.println("You entered " + numDimes + " dimes.");
    System.out.println("You entered " + numNickels + " nickels.");
    System.out.println("You entered " + numPennies + " pennies.");

    float totalQuarters = QUARTER_VALUE * (float) numQuarters;
    float totalDimes = DIME_VALUE * (float) numDimes;
    float totalNickels = NICKEL_VALUE * (float) numNickels;
    float totalPennies = PENNIES_VALUE * (float) numPennies;
    float total = totalQuarters + totalDimes + totalNickels + totalPennies;
    int dollars = (int) total;
    float cents = total%100;

                    
    System.out.println("\nYour total is " + dollars + " dollars and " + cents + " cents.");

  }
}