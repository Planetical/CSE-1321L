import java.util.Scanner;
import java.util.Random;
public class Assignment7B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FSAb[] fsa = new FSAb[3];
        Random rand = new Random();
        int s;
        for (int i = 0; i <= 2; i++) {
            s = rand.nextInt(4);
            fsa[i] = new FSAb(s);
        }

        System.out.println("[Array of Finite State Automata]");
        for (int i = 0; i <= 2; i++) {
            System.out.println("Machine # " + i + " is starting at state " + fsa[i].showCurrentState());
        }

        boolean quitting = false;
        do {
            System.out.println("What will you do?" +
                    "\n-Check the current status" +
                    "\n-Go to next state" +
                    "\n-End ");

        String choice = sc.nextLine();

        if (choice.equalsIgnoreCase("check the current status")) {
            System.out.println("What machine will you look at? ");
            int choice2 = sc.nextInt();

            boolean active = fsa[choice2].isActive();
            String status;
            if (active == true) {
                status = "active";
            } else {
                status = "not active";
            }
            int state = fsa[choice2].showCurrentState();

            System.out.println("Machine #" + choice2 + " is " + status + " and at state " + fsa[choice2].showCurrentState());
            sc.nextLine();
        } else if (choice.equalsIgnoreCase("go to next state")) {
            System.out.println("What machine will you advance? ");
            int choice2 = sc.nextInt();

            int state = fsa[choice2].goToNextState();
            System.out.println("Machine #" + choice2 + " is now at state " + state);
            sc.nextLine();
        } else if (choice.equalsIgnoreCase("end")) {
            System.out.println("What machine will you stop? ");
            int choice2 = sc.nextInt();

            if(fsa[choice2].end() == true) {
                fsa[choice2].active = false;
                System.out.println("Machine #" + choice2 + " is now deactivated");
                sc.nextLine();
            } else {
                System.out.println("You can't stop here, you can only stop at state 3");
                sc.nextLine();
            }
        } else {
            System.out.println("Invalid command");
        }

        if (fsa[0].isActive() == false && fsa[1].isActive() == false && fsa[2].isActive() == false) {
            quitting = true;
            System.out.println("All machines have been turned off.");
        }

        } while (quitting == false);
    }
}
