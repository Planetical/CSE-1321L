/*
Class: 1321L
Section: WJ1
Term: Fall 2022
Instructor: Nick Murphy
Name: Adam Hutcheson
Lab#: 7C
 */
import java.util.Scanner;
public class Lab7C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a value for the size: ");
        int size = sc.nextInt();

        System.out.println("This is the requested " + size + "x" + size + " right-triangle: ");

        for (int i = 0; i < size; i++) {
            int spaces = size - (i + 1);
            int ast = size - (size - (i + 1));

            for (int i2 = 0; i2 < spaces; i2++ ) {
                System.out.print(" ");
            }

            for (int i3 = 0; i3 < ast; i3++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
