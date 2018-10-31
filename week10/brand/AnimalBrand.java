package brand;
import animal.Animal;
import animal.Cat;
import animal.Dog;

public class AnimalBrand {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Cat cat1 = new Cat();
        Animal a1 = new Animal();

        a1.makeSound();
        dog1.makeSound();
        cat1.makeSound();
        dog1.move();

        System.out.print(cat1 instanceof Animal);
        System.out.println(a1 instanceof Dog);
    }
}
