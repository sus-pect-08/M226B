package Creatures;

public class Shark extends Predator{

    public Shark(int energy, int age, String name, int ferocity, int speed) {
        super(energy, age, name, ferocity, speed);
    }

    @Override
    public String makesound() {
        return "gnhagnah";
    }

}
