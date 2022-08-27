/*
Class: CSE 1321L
Section: WJ1
Term: Fall 2022
Instructor: Nick Murphy
Name: Adam Hutcheson
Lab#: 1A
 */
import java.util.Scanner;
public class Assignment1A {
    public static void main(String[] args) {
        int width;
        int height;
        System.out.println("Please enter the width.");
        Scanner sc = new Scanner (System.in);
        width = sc.nextInt();

        System.out.println("Please enter the height.");
        height = sc.nextInt();

        int resolution;
        System.out.println("Please enter the resolution.");
        resolution = sc.nextInt();

        float heightPixels = (float) height / resolution;
        float widthPixels = (float) width / resolution;
        System.out.println("At "+ resolution + " PPI, the image is "+ widthPixels + "\" wide by " + heightPixels +"\" high.");



    }
}
