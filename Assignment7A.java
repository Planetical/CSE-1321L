import java.util.Scanner;
public class Assignment7A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("[Finite State Automata]");
        System.out.println("What state do you want to start at? ");

        int s = sc.nextInt();
        boolean ending = false;
        FSA fsa = new FSA(s);

        do {
            System.out.println("What will you do?"
            + "\n-Go to next state" +
                    "\n-End ");
            String choice = sc.nextLine();

            switch (choice.toUpperCase()) {
                case "GO TO NEXT STATE":
                    s = fsa.goToNextState();
                    System.out.println("You're now at state " + s);
                    break;
                case "END":
                    if (fsa.end() == false) {
                        System.out.println("You can't stop here, you can only stop at state 3");
                    } else {
                        System.out.println("The machine has shut down.");
                        ending = true;
                    }
                    break;
                default:
                    System.out.println("Invalid command");
                    break;
            }


        } while (ending == false);
    }
}
