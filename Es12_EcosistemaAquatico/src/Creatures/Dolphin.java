package Creatures;

public class Dolphin extends Predator{

    private int intelligence;

    public Dolphin(int energy, int age, String name, int ferocity, int speed, int intelligence) {
        super(energy, age, name, ferocity, speed);
        this.intelligence = intelligence;
    }

    @Override
    public String makesound() {
        return "ghghgh";
    }

    @Override
    public boolean hunt(){
        boolean result = random.nextInt(50) * this.getSpeed() * intelligence * this.getEnergy() / 150 > 70;
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

    public void play(){
        System.out.println(getName() + " gioca e fa acrobazie");
    }
}
