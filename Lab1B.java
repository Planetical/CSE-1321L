/*
Class: 1321L
Section: WJ1
Term: Fall 2022
Instructor: Nick Murphy
Name: Adam Hutcheson
Lab#: 1B
 */
import java.util.Scanner;
public class Lab1B {
    public static void main (String[] args) {
        String message;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a line of text: ");
        message = scan.nextLine();
        System.out.println("You wrote \"" + message + "\"");
    }
}
