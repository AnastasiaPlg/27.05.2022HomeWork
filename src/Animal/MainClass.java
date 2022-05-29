package task1;

import task1.Animal;
import task1.Cat;
import task1.Dog;

public class MainClass {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.makeSound();
        Dog dog = new Dog();
        dog.makeSound();
        Animal animal = cat;
        animal.makeSound();
        Animal animal1 = new Dog();
        animal1.makeSound();
    }
}
