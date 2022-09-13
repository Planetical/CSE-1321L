/*
Class: 1321L
Section: WJ1
Term: Fall 2022
Instructor: Nick Murphy
Name: Adam Hutcheson
Lab#: 5A
 */
import java.util.Scanner;
public class Lab5A {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Do you have a driving permit (Y/N)?");
        String YN = sc.next();

        if (YN.equalsIgnoreCase("y")) {
            System.out.println("Do you have a commercial driving license (Y/N)?");
            YN = sc.next();

            if (YN.equalsIgnoreCase("y")) {
                System.out.println("Congratulations! You can purchase a vehicle, let's start talking options!");
            } else {
                System.out.println("Commercial driving license is a prerequisite to purchase a vehicle!");
            }

        } else {
            System.out.println("Driving permit is a prerequisite to purchase a vehicle!");
        }

    }
}
