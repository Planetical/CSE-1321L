/*
Class: CSE 1321L
Section: WJ1
Term: Fall 2022
Instructor: Nick Murphy
Name: Adam Hutcheson
Assignment#: 3B
 */
import java.util.Scanner;
public class Assignment3B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("[Martial Arts Belt]");
        System.out.println("What belt grade are you?");
        int grade = sc.nextInt();

        String belt,stripe; //I will use these strings to place into the longer string later

        switch (grade) {    // The switch cases initialize the variable and then print the statement
            case 10: belt = "white"; stripe = "0";
                System.out.println("You have a " + belt + " belt,\nwith " + stripe + " stripes.");
                break;
            case 9: belt = "white"; stripe = "1";
                System.out.println("You have a " + belt + " belt,\nwith " + stripe + " stripe.");
                break;
            case 8: belt = "yellow"; stripe = "1";
                System.out.println("You have a " + belt + " belt,\nwith " + stripe + " stripe.");
                break;
            case 7: belt = "yellow"; stripe = "2";
                System.out.println("You have a " + belt + " belt,\nwith " + stripe + " stripes.");
                break;
            case 6: belt = "blue"; stripe = "1";
                System.out.println("You have a " + belt + " belt,\nwith " + stripe + " stripe.");
                break;
            case 5: belt = "blue"; stripe = "2";
                System.out.println("You have a " + belt + " belt,\nwith " + stripe + " stripes.");
                break;
            case 4: belt = "green"; stripe = "1";
                System.out.println("You have a " + belt + " belt,\nwith " + stripe + " stripe.");
                break;
            case 3: belt = "green"; stripe = "2";
                System.out.println("You have a " + belt + " belt,\nwith " + stripe + " stripes.");
                break;
            case 2: belt = "brown"; stripe = "1";
                System.out.println("You have a " + belt + " belt,\nwith " + stripe + " stripe.");
                break;
            case 1: belt = "brown"; stripe = "2";
                System.out.println("You have a " + belt + " belt,\nwith " + stripe + " stripes.");
                break;
            case 0: belt = "black"; stripe = "0";
                System.out.println("You have a " + belt + " belt,\nwith " + stripe + " stripe.");
                break;
            default: System.out.println("You have no belt...");
        }
    }
}
