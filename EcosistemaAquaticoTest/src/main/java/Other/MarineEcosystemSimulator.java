package Other;

import Creatures.*;

public class MarineEcosystemSimulator {
    public static void main(String[] args) {
        EcosystemManager manager = new EcosystemManager();

        manager.addCreature(new Shark(90, 10, "Jaws", 75, 65));
        manager.addCreature(new Dolphin(75, 5, "Flipper", 80, 70, 65));
        manager.addCreature(new HerbivorousFish(42, 2,"dori"));
        manager.addCreature(new Jellyfish(65, 1, "andreas"));

        System.out.println("=== SIMULATORE ECOSISTEMA MARINO ===");
        System.out.println("**** 1. Creature con energia > 50:");
        manager.filterByEnergy(50);
        System.out.println("**** 2. Creature con età >= 3:");
        manager.getAdultCreaturesNames(3);
        System.out.println("**** 3. Predatori più pericolosi:");
        manager.findMostDangerousPredators(60,70);
        System.out.println("**** 4. Invoca tutti i metodi polimorfici di un predatore:");
        manager.callAllPredatorsPolimorphicMethods((Predator) (manager.getAquaticCreatures()).get(1));
        System.out.println("**** 5. Invoca tutti i metodi ereditati di un predatore:");
        manager.callAllPredatorsInheritedMethods((Predator) (manager.getAquaticCreatures()).get(1));
        System.out.println("**** 6. Fai muovere una creatura finché non muore:");
        manager.getAquaticCreatures().get(2).move();
        System.out.println("**** 7. Comportamenti specifici:");
        manager.getAquaticCreatures().stream()
                .filter(c -> c instanceof Dolphin)
                .map(c -> (Dolphin) c)
                .forEach(Dolphin::play);
        manager.getAquaticCreatures().stream()
                .filter(c -> c instanceof Jellyfish)
                .map(c -> (Jellyfish) c)
                .forEach(Jellyfish::illuminate);
    }
}