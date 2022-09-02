/*
Class: CSE 1321L
Section: WJ1
Term: Fall 2022
Instructor: Nick Murphy
Name: Adam Hutcheson
Lab#: 3B
 */
import java.util.Scanner;

class Lab3B {
  public static void main(String[] args) {
    float hourOne, hourTwo, hourThree, hourFour;
    float gradeOne, gradeTwo, gradeThree, gradeFour;
    float qualityOne, qualityTwo, qualityThree, qualityFour;

    System.out.print("Course 1 hours: ");
    Scanner sc = new Scanner(System.in);
    hourOne = sc.nextFloat();
    System.out.print("Grade for course 1: ");
    gradeOne = sc.nextFloat();
    qualityOne = hourOne * gradeOne;

    System.out.print("Course 2 hours: ");
    hourTwo = sc.nextFloat();
    System.out.print("Grade for course 2: ");
    gradeTwo = sc.nextFloat();
    qualityTwo = hourTwo * gradeTwo;

    System.out.print("Course 3 hours: ");
    hourThree = sc.nextFloat();
    System.out.print("Grade for course 3 ");
    gradeThree = sc.nextFloat();
    qualityThree = hourThree * gradeThree;

    System.out.print("Course 4 hours: ");
    hourFour = sc.nextFloat();
    System.out.print("Grade for course 4: ");
    gradeFour = sc.nextFloat();
    qualityFour = hourFour * gradeFour;

    float totalHour = hourOne + hourTwo + hourThree + hourFour;
    float totalQuality = qualityOne + qualityTwo + qualityThree + qualityFour;

    System.out.println("Total hours is: " + totalHour);
    System.out.println("Total quality points is: " + totalQuality);

    float GPA = totalQuality / totalHour;
    System.out.println("Your GPA for this semester is " + GPA);
  }
}
