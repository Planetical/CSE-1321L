import java.util.Scanner;
public class Lab10A {
    public static void main(String[] args) {
        System.out.println("Enter number 1: ");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        System.out.println("Enter number 2: ");
        int num2 = sc.nextInt();

        int result1 = min(num1,num2);
        int result2 = max(num1,num2);
        float result3 = average(num1,num2);

        System.out.println("Min is " + result1);
        System.out.println("Max is " + result2);
        System.out.println("Average is " + result3);
    }
    public static int min(int num1, int num2) {
        int minimum = 0;
        if (num1 > num2) {
            minimum = num2;
        } else if (num2 > num1) {
            minimum = num1;
        }
        return minimum;
    }
    public static int max(int num1, int num2) {
        int maximum = 0;
        if (num1 > num2) {
            maximum = num1;
        } else if (num2 > num1) {
            maximum = num2;
        }
        return maximum;
    }
    public static float average(int num1, int num2) {
        float average = ((float)num1 + (float)num2) / 2;

        return average;
    }
}

