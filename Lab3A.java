/*
Class: CSE 1321L
Section: WJ1
Term: Fall 2022
Instructor: Nick Murphy
Name: Adam Hutcheson
Lab#: 3A
 */
import java.text.DecimalFormat;
import java.util.Scanner;

class Lab3A {
  public static void main(String[] args) {

    System.out.println("Amount owed: $");
    Scanner sc = new Scanner(System.in);
    float amOwed = sc.nextFloat();

    System.out.println("APR:");
    float apr = sc.nextFloat();
    float newAPR = apr / 100;

    float minPayment = (amOwed * newAPR) / 12;
    float mpr = (newAPR / 12) * 100;

    DecimalFormat df = new DecimalFormat("#.###");
    DecimalFormat decimal = new DecimalFormat("#.##");

    System.out.println("Monthly percentage rate: " + df.format(mpr));
    System.out.println("Minimum payment: $" + decimal.format(minPayment));

  }
}
