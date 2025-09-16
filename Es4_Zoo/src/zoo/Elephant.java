package zoo;

public class Elephant extends Mammal implements Feedable{
    public Elephant(int age, String name, boolean hasFur) {
        super(age, name, hasFur);
    }

    @Override
    String makeSound() {
        return "phhuu";
    }

    @Override
    public void eat(String food) {
        System.out.println(this.getName() + " eats " + food);
    }
}
