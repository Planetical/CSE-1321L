/*
Class: CSE 1321L
Section: WJ1
Term: Fall 2022
Instructor: Nick Murphy
Name: Adam Hutcheson
Lab#: 4A
 */
import java.util.Scanner;
public class Lab4A {
    public static void main (String[] args) {

        System.out.println("Enter the score of your exam: ");
        Scanner sc = new Scanner(System.in);
        float score = sc.nextFloat();

        String letterGrade;

        if (score >= 98) {
            letterGrade="A+";
        } else if (score >= 95) {
            letterGrade="A";
        } else if (score >= 92) {
            letterGrade="A-";
        } else if (score >= 89) {
            letterGrade="B+";
        } else if (score >= 86) {
            letterGrade="B";
        } else if (score >= 83) {
            letterGrade="B-";
        } else if (score >= 80) {
            letterGrade="C+";
        } else if (score >= 77) {
            letterGrade="C";
        } else if (score >= 74) {
            letterGrade="C-";
        } else if (score >= 71) {
            letterGrade="D+";
        } else if (score >= 68) {
            letterGrade="D";
        } else if (score >= 65) {
            letterGrade="D-";
        } else {
            letterGrade="F";
        }

        System.out.println("Letter grade is: "+ letterGrade);

    }
}
