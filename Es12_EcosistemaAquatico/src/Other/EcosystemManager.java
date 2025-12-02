package Other;

import Creatures.AquaticCreature;
import Creatures.Dolphin;
import Creatures.Predator;

import java.util.ArrayList;
import java.util.List;

public class EcosystemManager {
    List<AquaticCreature> aquaticCreatures = new ArrayList<>();
    public void addCreature(AquaticCreature a) {
        aquaticCreatures.add(a);
    }
    public void filterByEnergy(int e) {
        aquaticCreatures.stream()
                .filter(a -> a.getEnergy() > e)
                .forEach(System.out::println);
    }
    public void getAdultCreaturesNames(int age){
        aquaticCreatures.stream()
                .filter(a -> a.getAge() >= age)
                .map(AquaticCreature::getName)
                .forEach(System.out::println);
    }
    public void findMostDangerousPredators(int e, int f){
        aquaticCreatures.stream()
                .filter(a -> a instanceof Predator)
                .map(a -> (Predator) a)
                .filter(a -> a.getEnergy() >= e)
                .filter(a -> a.getFerocity() >= f)
                .forEach(System.out::println);
    }
    public void callAllPredatorsPolimorphicMethods(Predator p){
        p.makesound();
        if (p instanceof Dolphin){
            p.hunt();
        }

    }
    public void callAllPredatorsInheritedMethods(Predator p){
        p.move();
        p.eat();
        System.out.println(p.getName());
        System.out.println(p.getAge());
        System.out.println(p.getEnergy());
        p.hunt();
    }

    public List<AquaticCreature> getAquaticCreatures() {
        return aquaticCreatures;
    }
}
