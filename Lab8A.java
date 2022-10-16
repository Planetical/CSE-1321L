/*
Class: CSE 1321L
Section: WJ1
Term: Fall 2022
Instructor: Nick Murphy
Name: Adam Hutcheson
Lab#: 8A
 */
import java.util.Scanner;
public class Lab8A {
    public static void main(String[] args) {

        int[] first; first = new int [5];
        int[] second; second = new int [5];
        Scanner sc = new Scanner (System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Please enter 5 integers for the first array:");
            System.out.println("Integer " + (i + 1) + ": ");
            first[i] = sc.nextInt();
        }

        for (int i2 = 0; i2 < 5; i2++) {
            System.out.println("Please enter 5 integers for the second array:");
            System.out.println("Integer " + (i2 + 1) + ": ");
            second[i2] = sc.nextInt();
        }

        int[] sums = new int [5];
        for (int i3 = 0; i3 < 5; i3++) {
            sums[i3] = first[i3] + second[i3];
        }

        System.out.println("The resulting sums are ");
        for (int i4 = 0; i4<5; i4++) {
            System.out.print(sums[i4] + "|");
        }

    }
}
