import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
public class Assignment6A {
    public static void main(String[] args) {
        System.out.println("[Is It Sorted?]");
        int array_size = 10;
        int[] array = new int[array_size];
        create_random_array(array,array_size);
        Scanner sc = new Scanner(System.in);

        System.out.println("Random Array: ");
        for (int i = 0; i < array_size; i++) {
            if (i < array_size - 1) {
                System.out.print(array[i] + ", ");
            } else {
                System.out.print(array[i]);
            }
        }


        boolean quit = false;
        do {
            System.out.println("\nWhat do you want to do?" +
                    "\n1) Generate a new random array" +
                    "\n2) Is the array sorted?" +
                    "\n3) Sort the array" +
                    "\n4) Quit");
            int choice = sc.nextInt();
            if (choice == 1) {
                create_random_array(array,array_size);
            } else if (choice == 2) {
                boolean sorted = is_array_sorted(array,array_size);
                if (sorted = true) {
                    System.out.println("The array is sorted.");
                } else {
                    System.out.println("The array is not sorted.");
                }
            } else if (choice == 3) {
                sort_array(array,array_size);
                System.out.println("Sorted array: ");
                for (int i = 0; i < array_size; i++) {
                    if (i < array_size - 1) {
                        System.out.print(array[i] + ", ");
                    } else {
                        System.out.print(array[i]);
                    }
                }
            } else if (choice == 4) {
                quit = true;
            }
        } while (quit == false);

    }
    public static void create_random_array(int[] array, int array_size) {
        Random rand = new Random();
        for(int i = 0; i < array_size; i++) {
            array[i] = rand.nextInt(1000) - 500;
        }
    }
    public static boolean is_array_sorted(int[] array, int array_size) {
        boolean is_array_sorted = true;
        for(int i = 0; i < array_size - 1; i++) {
            if (array[i] < array[i+1]) {
                is_array_sorted = false;
            } else {
                continue;
            }
        }
        return is_array_sorted;
    }
    public static void sort_array(int[] array, int array_size) {

        for (int i = 0; i < array_size - 1; i++) {
            int minPos = i;
            for (int j = i + 1; j< array_size; j++) {
                if(array[minPos] > array[j]) {
                    minPos = j;
                }
            }

            if (minPos != i) {
                int temp = array[i];
                array[i] = array[minPos];
                array[minPos] = temp;
            }
        }

    }
}
