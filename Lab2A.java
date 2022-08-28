/*
Class: 1321L
Section: WJ1
Term: Fall 2022
Instructor: Nick Murphy
Name: Adam Hutcheson
Lab#: 2A
 */
import java.util.Scanner;
public class Lab2A {
    public static void main(String[] args){
        System.out.println("Enter a name:");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();

        System.out.println("Enter another name:");
        String anotherName = sc.next();

        System.out.println("Enter a verb:");
        String verb = sc.next();

        System.out.println("Enter an adverb:");
        String adverb = sc.next();

        System.out.println("Once upon a time, there was a person named " + name + " " +
                "who had a child named " + anotherName + ". This child would " + verb + " " + adverb + " " +
                "while singing to strangers.");

    }
}
