package Food;

import interfaces.MenuItem;

import java.util.ArrayList;

public class Pizza  implements MenuItem{
    private String name;
    private double basePrice;
    private ArrayList<String> toppings;

    public Pizza(String name, double basePrice, ArrayList<String> toppings) {
        this.name = name;
        this.basePrice = basePrice;
        this.toppings = toppings;
    }

    @Override
    public double calculatePrice() {
        return basePrice + toppings.size();
    }

    @Override
    public String getDescription() {
        return "Pizza " + name + " con: " + toppings.toString();
    }

    @Override
    public int getPreparationTime() {
        return 20 + toppings.size();
    }

    @Override
    public String toString() {
        return name.toUpperCase() + "\n" + getDescription() + "\n Prezzo: " + calculatePrice() + "\n Tempo preparazione: " + getPreparationTime() + "min";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    public ArrayList<String> getToppings() {
        return toppings;
    }

    public void setToppings(ArrayList<String> toppings) {
        this.toppings = toppings;
    }
}
