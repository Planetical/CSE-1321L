/*
Class: 1321L
Section: WJ1
Term: Fall 2022
Instructor: Nick Murphy
Name: Adam Hutcheson
Lab#: 5B
 */
import java.util.Scanner;
public class Lab5B {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter an integer: ");
        int integer = sc.nextInt();

        if ((integer % 2) == 0) {
            System.out.println("This number is divisible by 2");
        } else if ((integer % 3) == 0) {
            System.out.println("This number is divisible by 3");
        } else if ((integer % 5) == 0) {
            System.out.println("This number is divisible by 5");
        } else {
            System.out.println("This number is undetermined");
        }
    }
}
