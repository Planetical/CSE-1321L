import java.util.Scanner;
public class Lab4B {
    public static void main (String[] args) {
        System.out.println("Enter the day: ");
        Scanner sc = new Scanner(System.in);
        String day = sc.next();

        if (day.equalsIgnoreCase("monday") || day.equalsIgnoreCase("wednesday")){
            System.out.println("I have class today!");
        } else if (day.equalsIgnoreCase("friday")) {
            System.out.println("It's Friday! Friday! Gotta get down on Friday!");
        } else {
            System.out.println("I should use this time to do my homework.");
        }
    }
}
