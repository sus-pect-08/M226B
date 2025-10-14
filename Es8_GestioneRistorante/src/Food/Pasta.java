package Food;

import interfaces.MenuItem;

public class Pasta implements MenuItem {
    private String name;
    private double price;
    private boolean isGlutenFree;

    public Pasta(String name, double price, boolean isGlutenFree) {
        this.name = name;
        this.price = price;
        this.isGlutenFree = isGlutenFree;
    }

    @Override
    public double calculatePrice() {
        return price;
    }

    @Override
    public String getDescription() {
        String result = "Pasta " + name;
        if (isGlutenFree) {
            result += " (senza glutine)";
        }
        return result;
    }

    @Override
    public int getPreparationTime() {
        return 12;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isGlutenFree() {
        return isGlutenFree;
    }

    public void setGlutenFree(boolean glutenFree) {
        isGlutenFree = glutenFree;
    }
}
