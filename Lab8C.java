/*
Class: CSE 1321L
Section: WJ1
Term: Fall 2022
Instructor: Nick Murphy
Name: Adam Hutcheson
Lab#: 8C
 */
import java.util.Scanner;
public class Lab8C {
    public static void main(String[] args) {
        System.out.println("Please enter the number of rows: ");
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        System.out.println("Please enter the number of columns: ");
        int columns = sc.nextInt();

        int spaces = rows * columns;
        System.out.println("\nI have " + rows + " and " + columns + " columns. I need to fill-up " + spaces + " spaces.");
        System.out.println("\nThe " + rows + "x" + columns + " array:");

        int[][] array = new int[rows][columns];
        int loop = 0;

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[0].length; j++) {
                loop++;
                array[i][j] = loop;
                System.out.print(array[i][j] + "|");
            }
            System.out.println();
        }

        System.out.println("\nThe " + rows + "x" + columns + " 2-D array flattened into a 16 cell 1-D array:");

        for (int k = 0; k < spaces; k++) {
            System.out.print((k + 1) + "|");
        }

    }
}
