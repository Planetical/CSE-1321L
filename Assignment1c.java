/*
Class: CSE 1321L
Section: WJ1
Term: Fall 2022
Instructor: Nick Murphy
Name: Adam Hutcheson
Lab#: 1B
*/
import java.util.Scanner;
public class Assignment1c {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Please enter a letter.");
        char letter = sc.next().charAt(0);

        char next = (char) (letter + 1);
        char nextNext = (char) (letter + 2);
        char nextNextNext = (char) (letter + 3);

        System.out.println("The next letters after " + letter + " are " + next + ", " + nextNext + ", and " + nextNextNext + "!");



        

    }
}
