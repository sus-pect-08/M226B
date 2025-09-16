package zoo;

public  class Lion extends Mammal implements Feedable{


    public Lion(int age, String name, boolean hasFur) {
        super(age, name, hasFur);
    }

    @Override
    String makeSound() {
        return "Rawr";
    }

    @Override
    public void eat(String food) {
        System.out.println( this.getName() + " eats " + food);
    }
}


