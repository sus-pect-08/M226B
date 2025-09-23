package zoo;

public abstract class Mammal extends Animal{
    private boolean hasFur;

    public Mammal(int age, String name, boolean hasFur) {
        super(age, name);
        this.hasFur = hasFur;
    }


    public boolean isHasFur() {
        return hasFur;
    }

}
