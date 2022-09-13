import java.util.Scanner;
public class Assignment3A {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("[Epic Quest Simulator]" +
                "\nHello stranger! Do you have time to hear my tale?" +
                "\n1) Yes\n2) No");
        String input = sc.next();

        // beginning of the choices
        if (input.equals("1")) {
            System.out.println("Thank you! I come from the land of Pax Bisonica. Our Country has been taken over by a cruel tyrant!");
            System.out.println("1) That's awful!\n2) What can I do?");
            input = sc.next();

            // user says "That's awful!"
            if (input.equals("1")) {
                System.out.println("Alas it is truly terrible...");
                System.out.println("Please, you must journey to Pax Bisonica and free our country!" +
                        "\n1) Okay\n2) No");
                input = sc.next();

                // user says "okay"
                if (input.equals("1")) {
                    System.out.println("Hooray!!");

                } else {
                    System.out.println("Then all is lost...");
                }

                //user said "what can I do?"
            } else {
                System.out.println("Please, you must journey to Pax Bisonica and free our country!" +
                        "\n1) Okay\n2) No");
                input = sc.next();

                if (input.equals("1")) {
                    System.out.println("Hooray!!");
                } else {
                    System.out.println("Then all is lost...");
                }
            }
            // user said "no" in the beginning
        } else {
            System.out.println("Ah then, goodbye...");
        }


    }
}
