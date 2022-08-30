/*
Class: CSE 1321L
Section: WJ1
Term: Fall 2022
Instructor: Nick Murphy
Name: Adam Hutcheson
Assignment#: 2C
 */
import java.util.Scanner;
public class Assignment2C {
    public static void main(String[] args){
        System.out.println("[Bisonica Currency Exchange]");
        System.out.println("General Bison welcomes you to Pax Bisionica!");

        Scanner sc = new Scanner (System.in);
        System.out.println("\nHow many US Dollars do you have?");
        int dollars = sc.nextInt();

        double USDPND_RATE = 0.85;
        double BISPND_RATE = 5;
        double dollarWorth = dollars * USDPND_RATE;
        double bisonWorth = dollarWorth / BISPND_RATE;

        System.out.println(dollars + " US Dollar(s) is " + dollarWorth +
                " British Pound(s), which is worth " + bisonWorth + " Bison Dollar(s)!");

    }
}
