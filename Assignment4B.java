/*
Class: CSE 1321L
Section: WJ1
Term: Fall 2022
Instructor: Nick Murphy
Name: Adam Hutcheson
Assignment#: 4B
 */
import java.util.Scanner;
import java.lang.Math;
public class Assignment4B {
    public static void main(String[] args) {
        System.out.println("Welcome!");
        System.out.println("Please input a number: ");
        Scanner sc = new Scanner(System.in);
        float number = sc.nextFloat();
        int menuNum = 0;

        while (menuNum != 4) {
        System.out.println("What would you like to do to this number: ");
        System.out.println("-1- Re-enter the number\n" +
                "0- Get the additive inverse of the number\n" +
                "1- Get the reciprocal of the number\n" +
                "2- Square the number\n" +
                "3- Cube the number\n" +
                "4- Exit the program");
        menuNum = sc.nextInt();
        float newNum;


        while (menuNum > 4 || menuNum < -1) {
            System.out.println("Please enter a valid number between -1 and 4: ");
            menuNum = sc.nextInt();
        }

        switch (menuNum) {
            case -1:
                System.out.println("Please input a number: ");
                number = sc.nextFloat();
                break;
            case 0:
                newNum = number * -1;
                System.out.println("The additive inverse of " + number + " is " + newNum);
                break;
            case 1:
                newNum = (float) Math.pow(number, -1);
                System.out.println("The reciprocal of " + number + " is " + newNum);
                break;
            case 2:
                newNum = (float) Math.pow(number, 2);
                System.out.println("The square of " + number + " is " + newNum);
                break;
            case 3:
                newNum = (float) Math.pow(number, 3);
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
}
