package Creatures;

import java.util.Random;

public abstract class Predator extends AquaticCreature {
    private int ferocity, speed;
    Random random = new Random();

    public Predator(int energy, int age, String name,  int ferocity, int speed) {
        super(energy, age, name);
        this.ferocity = ferocity;
        this.speed = speed;
    }

    public int getFerocity() {
        return ferocity;
    }
    public void setFerocity(int ferocity) {
        this.ferocity = ferocity;
    }
    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean hunt(){
        boolean result = random.nextInt(50) * this.getSpeed() * this.getEnergy() / 25 > 70;
        setEnergy(this.getEnergy() - 20);
        if (result){
            System.out.println("Preda catturata");
            eat();
        } else if (getEnergy() <= 0) {
            System.out.println("Caccia fallita, la preda è sfuggita");
            System.out.println(getName() + "è morto");
        }else{
            System.out.println("Caccia fallita, la preda è sfuggita, nuovo livello di energia: " + getEnergy());
        }
        return result;
    }
}
