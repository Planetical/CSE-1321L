import java.util.Random;
import java.util.Scanner;
public class Lab6B {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 1000: ");
        int number = sc.nextInt();
        int rand_int1 = rand.nextInt(1000);


        int i = 1; while (number > rand_int1 || number < rand_int1) {
            System.out.println("My guess was " + rand_int1);
            i++;
            rand_int1 = rand.nextInt(1000);
        }
        System.out.println("I guessed the number was " + number + " and it only took me " + i + " guesses");


    }
}
