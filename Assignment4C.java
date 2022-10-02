import java.util.Scanner;
public class Assignment4C {
    public static void main(String args[]) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.println("[Backspace Animation]");
        System.out.println("Please enter your sentence: ");
        String sentence = sc.nextLine();
        System.out.println("How many letters do you want to backspace? ");
        int backspace = sc.nextInt();
        int i;
        System.out.print(sentence);

        for (i = 0; i < backspace; i++) {
            System.out.print("\b");
            Thread.sleep(500);
        }
    }
}
