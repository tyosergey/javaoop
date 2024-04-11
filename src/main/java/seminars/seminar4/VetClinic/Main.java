package seminars.seminar4.VetClinic;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Felix", 1);
        Cat cat2 = new Cat("Sam", 2);
        Dog dog1 = new Dog("Volt", 3);
        Dog dog2 = new Dog("Batman", 4);
        List<Animal> animals = new ArrayList<>(List.of(cat1, cat2, dog1, dog2));
        VetClinic<Animal> animalVetClinic = new VetClinic<>(animals);
        animalVetClinic.animalInspection(1);
        animalVetClinic.animalHeal(0);
        System.out.println(animalVetClinic.getIndex(2));
    }
}
