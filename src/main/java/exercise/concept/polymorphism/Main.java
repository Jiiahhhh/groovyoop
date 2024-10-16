package exercise.concept.polymorphism;

public class Main {
    public static String playSound(Animal animal) {
        return animal.makeSound();
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();

        System.out.println("Hewan ini berbunyi: " + playSound(cat));
        System.out.println("Hewan ini berbunyi: " + playSound(dog));
    }
}
