package Creatures;

public class Jellyfish extends AquaticCreature{


    public Jellyfish(int energy, int age, String name) {
        super(energy, age, name);
    }

    @Override
    public String makesound() {
        return "gluglu";
    }

    public void illuminate() {
        System.out.println(getName() + " emette una luce bioluminescente!");
    }

}
