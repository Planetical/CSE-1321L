import java.util.Scanner;
public class Assignment2B {
    public static void main(String[] args){

        System.out.println("Enter the X coordinate for Keyframe #1:");
        Scanner sc = new Scanner(System.in);
        int keyframeOne = sc.nextInt();

        System.out.println("Enter the X coordinate for Keyframe #2:");
        int keyframeTwo = sc.nextInt();

        System.out.println("How many frames have passed?");
        int framesPassed = sc.nextInt();

        int movePlaces = keyframeTwo - keyframeOne;
        float currentXThirty =  keyframeOne + (movePlaces * ((float)framesPassed / 30));
        float currentXSixty =  keyframeOne + (movePlaces * ((float)framesPassed / 60));

        System.out.println("\nThe character has to move " + movePlaces + " places in a second.");
        System.out.println("At 30 FPS, their current X position would be " + currentXThirty);
        System.out.println("At 60 FPS, their current x position would be " + currentXSixty);

    }
}
