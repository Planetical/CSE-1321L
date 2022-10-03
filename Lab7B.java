/*
Class: 1321L
Section: WJ1
Term: Fall 2022
Instructor: Nick Murphy
Name: Adam Hutcheson
Lab#: 7B
 */
import java.util.Scanner;
public class Lab7B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a value for the size: ");
        int size = sc.nextInt();
        int sizeMax;

        System.out.println("This is the requested " + size + "x" + size + " right-triangle:");
        for (int i = 0; i < size; i++) {
            sizeMax = size - (size - (i + 1));
            for (int i2 = 0; i2 < sizeMax; i2++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
