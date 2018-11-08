package brand;

import animal.Animal;
import animal.Cat;
import animal.Dog;
import animal.Elephant;

import java.util.ArrayList;
import java.util.List;

public class AnimalBrand {

    List<Animal> animals = new ArrayList<>();

    public void play() {
        for(Animal animal : animals) {
            animal.makeSound();
        }
    }

    public static void main(String[] args) {
       AnimalBrand band = new AnimalBrand();
       Dog dog1 = new Dog();
       band.animals.add(dog1);
       Dog dog32 = new Dog();
       band.animals.add(dog32);
       Cat cat = new Cat();
       band.animals.add(cat);
        Elephant elephant = new Elephant();
        band.animals.add(elephant);

//        Animal animal = new Animal();
        band.play();

    }
}
