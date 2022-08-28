/*
Class: CSE 1321L
Section: WJ1
Term: Fall 2022
Instructor: Nick Murphy
Name: Adam Hutcheson
Lab#: 1B
*/
import java.util.Scanner;
public class Assignment1B {
    public static void main (String[] args) {
        float lab,assignment,midterm,finalExam;

        System.out.print("Enter your average lab grade.");
        Scanner sc = new Scanner (System.in);
        lab = sc.nextFloat();

        System.out.println("Enter your average assignment grade.");
        assignment = sc.nextFloat();

        System.out.println("Enter your midterm exam grade.");
        midterm = sc.nextFloat();

        System.out.println("Enter your final exam grade.");
        finalExam = sc.nextFloat();

        float newLab,newAssignment,newMidterm,newFinalExam;
        newLab = (float) (lab * .1); newAssignment = (float) (assignment * .4);
        newMidterm = (float) (midterm * .2); newFinalExam = (float) (finalExam * .3);

        System.out.println("Your weighted lab average is " + newLab);
        System.out.println("Your weighted assignment average is " + newAssignment);
        System.out.println("Your weighted midterm exam average is " + newMidterm);
        System.out.println("Your weighted final exam average is " + newFinalExam);

        float finalGrade = newLab + newAssignment + newMidterm + newFinalExam;
        System.out.println("Your final grade in CSE 1321L is " + finalGrade);

    }
}
