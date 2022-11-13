public class Dog {
    public int age;
    public double weight;
    public String name;
    public String furColor;
    public String breed;

    public Dog(int age, double weight, String name, String furColor, String breed) {
        this.age = age;
        this.weight = weight;
        this.name = name;
        this.furColor = furColor;
        this.breed = breed;
    }

    public void bark() {
        System.out.println("Woof! Woof!");
    }

    public String rename(String newName) {
        name = newName;
        return name;
    }

    public double eat(double eat, double weight) {
        weight+=eat;
        return weight;
    }
}
