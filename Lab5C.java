/*
Class: 1321L
Section: WJ1
Term: Fall 2022
Instructor: Nick Murphy
Name: Adam Hutcheson
Lab#: 5C
 */
import java.util.Scanner;
public class Lab5C {
    public static void main(String[] args) {
        int x,y;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x: ");
        x = sc.nextInt();
        System.out.println("Enter y: ");
        y = sc.nextInt();

        if (x == 0 && y == 0) {
            System.out.println("This point is on the origin.");
        } else if (x == 0) {
            System.out.println("This point is on the y axis.");
        } else if (y == 0) {
            System.out.println("This point is on the x axis.");
        } else if (y > 0 && x > 0) {
            System.out.println("This point is in the first quadrant.");
        } else if (y > 0 && x < 0) {
            System.out.println("This point is in the second quadrant.");
        } else if (y < 0 && x < 0) {
            System.out.println("This point is in the third quadrant.");
        } else if (y < 0 && x > 0) {
            System.out.println("This point is in the fourth quadrant.");
        }

    }
}
