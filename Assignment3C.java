import java.util.Scanner;
public class Assignment3C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("[App Checklist]");
        System.out.println("What mobile device do you have?");
        String device = sc.next();

        // beginning if statement to figure out version
        if (device.equalsIgnoreCase("android") || device.equalsIgnoreCase("apple")) {
            System.out.println("What version do you have?");
            float version = sc.nextFloat();

        // this is the android section of the code
            if (device.equalsIgnoreCase("android") && version >= 11) {
                System.out.println("Congratulations, you can run the app!");
            } else if (device.equalsIgnoreCase("android") && version < 11) {
                System.out.println("Does your device support Augmented Reality?");
                String AR = sc.next();

                if (AR.equalsIgnoreCase("Yes")) {
                    System.out.println("Congratulations, you can run the app!");
                } else if (AR.equalsIgnoreCase("No")) {
                    System.out.println("I'm sorry, our app does not support your device.");
                }

            }// This is the apple section :)
            else if (device.equalsIgnoreCase("apple") && version >= 12) {
                System.out.println("Congratulations, you can run the app!");
            } else if (device.equalsIgnoreCase("apple") && version < 12) {
                System.out.println("Does your device support Bluetooth connections?");
                String bluetooth = sc.next();

                if (bluetooth.equalsIgnoreCase("yes")) {
                    System.out.println("Congratulations, you can run the app!");
                } else if (bluetooth.equalsIgnoreCase("no")) {
                    System.out.println("I'm sorry, our app does not support your device.");
                }
            }

        } else { // This is for if the device isn't apple or android (not supported)
            System.out.println("I'm sorry, our app does not support your device.");
        }

    }
}
