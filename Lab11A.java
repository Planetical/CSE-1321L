import java.util.Scanner;
public class Lab11A {
    public static void main(String[] args) {
        boolean rerun = true;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Menu");
            System.out.println("0) Hello World" +
                    "\n1) Goodbye Moon" +
                    "\n2) Walking on Sunshine");
            System.out.println("What would you like to do: ");
            int option = sc.nextInt();

            if (option == 0) {
                System.out.println("\nHello!");
            } else if (option == 1) {
                System.out.println("\nOk, bye.");
            } else if (option == 3) {
                System.out.println("\nWHOA!");
            }

            System.out.println("\nType YES to rerun.");
            String input = sc.next();
            if(input.equalsIgnoreCase("yes")) {
                rerun = true;
            } else {
                rerun = false;
            }
        } while (rerun == true);
        System.out.println("Program Ends");
    }
}
