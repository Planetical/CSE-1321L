import java.util.Scanner;
public class Lab6A {
    public static void main (String [] args) {
        System.out.println("Please enter 10 numbers and this program will display the largest.");
        Scanner sc = new Scanner(System.in);
        int largest = 0;
        int[] anArray;
        anArray = new int[10];

        for (int i = 0; i<=9; i++) {
            System.out.println("Please enter number " + (i + 1) + ":");
            anArray[i] = sc.nextInt(); int save = anArray[i];

            if (save >= largest) {
                largest = save;
            }

        }
        System.out.println("The largest number was " + largest);
    }
}
