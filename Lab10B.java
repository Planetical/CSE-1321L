import java.util.Scanner;
public class Lab10B {
    public static void main(String[] args) {
        boolean quit = false;
        do {
            System.out.println("Enter width: ");
            Scanner sc = new Scanner(System.in);
            double width = sc.nextDouble();
            System.out.println("Enter height: ");
            double height = sc.nextDouble();

            boolean valid = isValid(width,height);
            double area = area(width,height);
            double perimeter = perimeter(width,height);

            if (valid == false) {
                System.out.println("This is an invalid rectangle");
            } else {
                System.out.println("This is a valid rectangle");
                System.out.println("The area is: "+ area);
                System.out.println("The perimeter is: " + perimeter);
            }

            System.out.println("\nDo you want to enter another width and height (Y/N)? : ");
            String answer = sc.next();
            if (answer.equalsIgnoreCase("N")) {
                quit = true;
            } else {
                continue;
            }

        } while (quit == false);
        System.out.println("Program Ends");
    }
    public static boolean isValid(double width,double height) {
        boolean valid = true;
        double total = width * height;
        if (total < 30) {
            valid = false;
        }
        return valid;
    }
    public static double area(double width,double height) {
        double area = width * height;
        return area;
    }
    public static double perimeter(double width, double height) {
        double perimeter = (width * 2) + (height * 2);
        return perimeter;
    }
}
