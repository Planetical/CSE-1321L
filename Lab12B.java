import java.util.Scanner;
public class Lab12B {
    public static void main(String[] args) {
        System.out.println("You are about to create a dog.");
        Scanner sc = new Scanner(System.in);

        System.out.println("How old is the dog: ");
        int age = sc.nextInt();

        System.out.println("How much does the dog weigh: ");
        double weight = sc.nextDouble();

        System.out.println("What is the dog's name: ");
        String name = sc.next();

        System.out.println("What color is the dog: ");
        String furColor = sc.next();

        System.out.println("What breed is the dog: ");
        String breed = sc.next();

        Dog dog1 = new Dog(age,weight,name,furColor,breed);

        System.out.println(dog1.name + " is a " + dog1.age + " year old " + dog1.furColor + " " + dog1.breed + " that weighs " + dog1.weight + " lbs.");

        System.out.print("\n"); dog1.bark();
        System.out.println(dog1.name + " is hungry, how much should he eat: ");
        double eat = sc.nextDouble();
        dog1.eat(eat, weight);
        System.out.println(dog1.name + " isn't a very good name. What should they be renamed to: ");
        String newName = sc.next();
        dog1.rename(newName);

        dog1 = new Dog(age,weight,name,furColor,breed);

        System.out.println("\n" + dog1.name + " is a " + dog1.age + " year old " + dog1.furColor + " " + dog1.breed + " that weighs " + dog1.weight + " lbs.");
    }
}
