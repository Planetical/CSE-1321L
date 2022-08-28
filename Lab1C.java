/*
Class: 1321L
Section: WJ1
Term: Fall 2022
Instructor: Nick Murphy
Name: Adam Hutcheson
Lab#: 1C
 */
import java.util.Scanner;
public class Lab1C {
    public static void main (String[] args) {
        int miles;
        double gallons, mpg;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of miles: ");
        miles = scan.nextInt();

        System.out.print("Enter the gallons of fuel used: ");
        gallons = scan.nextDouble();

        mpg = miles / gallons;
        System.out.println("Miles Per Gallon: " + mpg);
    }
}
