package zoo;

import java.util.ArrayList;
import java.util.List;

public class ZooApp {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<Animal>();
        animals.add(new Lion(12, "lion", true));
        animals.add(new Elephant(5, "elephant", false)) ;
        animals.add(new Parrot(3, "parrot") );

        for (Animal animal : animals) {
            System.out.println(animal.getName());
            System.out.println(animal.makeSound());
            if (animal instanceof Feedable) {
                ((Feedable) animal).eat("meat");
                ((Feedable) animal).eat("fish");
            }
        }

    }
}