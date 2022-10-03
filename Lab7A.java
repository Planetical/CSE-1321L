/*
Class: 1321L
Section: WJ1
Term: Fall 2022
Instructor: Nick Murphy
Name: Adam Hutcheson
Lab#: 7A
 */
import java.util.Scanner;
public class Lab7A {
    public static void main(String[] args) {
        System.out.println("Please enter a value for the size: ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        System.out.println("This is the requested " + size + "x" + size + " box:");
        for (int i = 0; i < size; i++) {
            for (int i2 = 0; i2 < size; i2++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
