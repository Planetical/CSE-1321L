/*
Class: CSE 1321L
Section: WJ1
Term: Fall 2022
Instructor: Nick Murphy
Name: Adam Hutcheson
Lab#: 4C
 */
import java.util.Scanner;
import java.lang.Math;
public class Lab4C {
    public static void main(String[] args) {

        System.out.println("Welcome!");
        System.out.println("Please input a number: ");
        Scanner sc = new Scanner(System.in);
        float number = sc.nextFloat();

        System.out.println("What would you like to do to this number: ");
        System.out.println("0- Get the additive inverse of the number\n" +
                "1- Get the reciprocal of the number\n" +
                "2- Square the number\n" +
                "3- Cube the number\n" +
                "4- Exit the program");
        int menuNum = sc.nextInt();
        float newNum;

// creating a menu to figure out the options
        switch (menuNum) {
            case 0:
                newNum = number * -1;
                System.out.println("The additive inverse of " + number + " is " + newNum);
                break;
            case 1:
                newNum = (float) Math.pow(number,-1);
                System.out.println("The reciprocal of " + number + " is " +newNum);
                break;
            case 2:
                newNum = (float) Math.pow(number,2);
                System.out.println("The square of " + number + " is " + newNum);
                break;
            case 3:
                newNum = (float) Math.pow(number,3);
                System.out.println("The cube of " + number + " is " + newNum);
                break;
            case 4:
                System.out.println("Thank you, goodbye!");
                break;
            default:
                System.out.println("Invalid input, please try again!");

        }
    }
}
