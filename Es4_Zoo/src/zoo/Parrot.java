package zoo;

public  class Parrot extends Animal implements Feedable {
    public Parrot(int age, String name) {
        super(age, name);
    }

    @Override
    String makeSound() {
        return "hee";
    }

    @Override
    public void eat(String food) {
        System.out.println(this.getName() + " eats " + food);
    }
}
