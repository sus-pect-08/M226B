package Creatures;

public class HerbivorousFish extends AquaticCreature{


    public HerbivorousFish(int energy, int age, String name) {
        super(energy, age, name);
    }

    @Override
    public String makesound() {
        return "blublu";
    }


}
