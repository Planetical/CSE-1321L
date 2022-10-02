import java.util.Scanner;
public class Assignment4A {
    public static void main (String[] args) {
        System.out.println("[CCSE Study Abroad Survey]");
        int student = 1;
        int italy = 0,costaRica = 0,paxBisonica = 0,ghana = 0;
        String country; String quit = "";
        Scanner sc = new Scanner(System.in);

        while (!(quit.equalsIgnoreCase("quit"))) {
            System.out.println("Student #" + student + ": Which country should we go to for our next study abroad program?\n" +
                    "Italy\nCosta Rica\nPax Bisonica\nGhana" +
                    "\n(Type Quit to end the survey)");
            country = sc.nextLine();

            if (country.equalsIgnoreCase("italy")) {
                italy++;
            } else if (country.equalsIgnoreCase("Costa Rica")) {
                costaRica++;
            } else if (country.equalsIgnoreCase("Pax Bisonica")) {
                paxBisonica++;
            } else if (country.equalsIgnoreCase("ghana")) {
                ghana++;
            } else if (country.equalsIgnoreCase("quit")) {
                quit = "quit";
            }

            System.out.println("Thank you!");
            student++;
        }

        System.out.println("[Results]");
        System.out.println("Italy: " + italy
        + "\nCosta Rica: " + costaRica +
                "\nPax Bisonica: " + paxBisonica +
                "\nGhana: " + ghana);

        String studyAbroad = "";
        if (italy > costaRica && italy > paxBisonica && italy > ghana) {
            studyAbroad = "Italy";
        } else if (costaRica > italy && costaRica > paxBisonica && costaRica > ghana) {
            studyAbroad = "Costa Rica";
        } else if (paxBisonica > italy && paxBisonica > costaRica && paxBisonica > ghana) {
            studyAbroad = "Pax Bisonica";
        } else if (ghana > italy && ghana > costaRica && ghana > paxBisonica) {
            studyAbroad = "Ghana";
        }

        System.out.println("Next year's study abroad program will take place in " + studyAbroad + ".");
    }
}
