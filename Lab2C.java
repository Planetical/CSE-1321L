/*
Class: 1321L
Section: WJ1
Term: Fall 2022
Instructor: Nick Murphy
Name: Adam Hutcheson
Lab#: 2C
 */
import java.util.Scanner;
public class Lab2C {
    public static void main(String[] args){
        System.out.println("Enter a width:");
        Scanner sc = new Scanner (System.in);
        int width = sc.nextInt();

        System.out.println("Enter a height:");
        int height = sc.nextInt();

        int perimeter = 2*(height + width);
        int area = height * width;

        System.out.println("The area is " + area);
        System.out.println("The perimeter is " + perimeter);
    }
}
