/*
Class: CSE 1321L
Section: WJ1
Term: Fall 2022
Instructor: Nick Murphy
Name: Adam Hutcheson
Assignment#: 2A
 */
import java.util.Scanner;
public class Assignment2A {
    public static void main(String[] args){

        System.out.println("How many people are in your group?");
        Scanner sc = new Scanner(System.in);
        int people = sc.nextInt();

        System.out.println("How many groups do you want?");
        int groups = sc.nextInt();

        int leftOut = people % groups;

        System.out.println("If we divide " + people + " people into " + groups + " groups, there will be " + leftOut + " people without a group.");
    }
}
