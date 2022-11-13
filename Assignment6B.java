import java.util.Scanner;
public class Assignment6B {
    public static void main(String[] args) {
        System.out.println("What's my datatype?");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an int: ");
        int dataInt = sc.nextInt();

        System.out.println("Enter a string: ");
        String string = sc.next();

        System.out.println("Enter a float: ");
        float floating = sc.nextFloat();

        System.out.println("Enter a char: ");
        char character = sc.next().charAt(0);

        System.out.println("Enter a boolean: ");
        boolean boo = sc.nextBoolean();

        System.out.println("What datatype do you want to check?");
        String choice = sc.next();

        if (choice.equalsIgnoreCase("int")) {
            String value = Integer.toString(dataInt);
            String type = WhatsMyType(dataInt);
            System.out.println("'" + value + "' is a " + type + " value!");
        } else if (choice.equalsIgnoreCase("string")) {
            String value = string;
            String type = WhatsMyType(string);
            System.out.println("'" + value + "' is a " + type + " value!");
        } else if (choice.equalsIgnoreCase("float")) {
            String value = Float.toString(floating);
            String type = WhatsMyType(floating);
            System.out.println("'" + value + "' is a " + type + " value!");
        } else if (choice.equalsIgnoreCase("char")) {
            String value = Character.toString(character);
            String type = WhatsMyType(character);
            System.out.println("'" + value + "' is a " + type + " value!");
        } else if (choice.equalsIgnoreCase("boolean")) {
            String value = Boolean.toString(boo);
            String type = WhatsMyType(boo);
            System.out.println("'" + value + "' is a " + type + " value!");
        }
    }
    public static String WhatsMyType (int dataInt) {
        String type;
        if (dataInt == (int)dataInt) {
            type = "int";
        } else {
            type = null;
        }

        return type;
    }
    public static String WhatsMyType(String string) {
        String type;
        if (string == (String)string) {
            type = "string";
        } else {
            type = null;
        }

        return type;
    }
    public static String WhatsMyType(float floating) {
        String type;
        if (floating == (float)floating) {
            type = "float";
        } else {
            type = null;
        }
        return type;
    }
    public static String WhatsMyType(char character) {
        String type;
        if (character == (char)character) {
            type = "char";
        } else {
            type = null;
        }
        return type;
    }
    public static String WhatsMyType(boolean boo) {
        String type;
        if (boo == (boolean) boo) {
            type = "boolean";
        } else {
            type = null;
        }
        return type;
    }
}
