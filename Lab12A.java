import java.util.Scanner;
public class Lab12A {
    public static void main(String[] args) {
        System.out.println("You are about to create a chair.");
        Scanner sc = new Scanner(System.in);

        System.out.println("How many legs does your chair have: ");
        int numofLegs = sc.nextInt();

        System.out.println("Is your chair rolling (true/false): ");
        boolean rolling = sc.nextBoolean();

        System.out.println("What is your chair made of: ");
        String material = sc.next();

        Chair chair1 = new Chair(numofLegs,rolling,material);
        String rollingStatus = null;
        if (chair1.rolling == false) {
            rollingStatus = "not rolling";
        } else if (chair1.rolling == true) {
            rollingStatus = "rolling";
        }

        System.out.println("\nYour chair has " + chair1.numOfLegs + " legs, " + "is " + rollingStatus + ", and is made of " + chair1.material + ".");
        System.out.println("\nThis program is going to change that.");

        numofLegs = 4; rolling = false; material = "plastic";
        chair1 = new Chair(numofLegs,rolling,material);
        if (chair1.rolling == false) {
            rollingStatus = "not rolling";
        } else if (chair1.rolling == true) {
            rollingStatus = "rolling";
        }

        System.out.println("\nYour chair has " + chair1.numOfLegs + " legs, " + "is " + rollingStatus + ", and is made of " + chair1.material + ".");

    }
}
