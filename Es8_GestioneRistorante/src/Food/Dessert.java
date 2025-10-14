package Food;


import interfaces.MenuItem;

public class Dessert implements MenuItem {
    private String name;
    private double basePrice;
    private boolean hasExtraTopping;

    public Dessert(String name, double basePrice, boolean hasExtraTopping) {
        this.name = name;
        this.basePrice = basePrice;
        this.hasExtraTopping = hasExtraTopping;
    }


    @Override
    public double calculatePrice() {
        return basePrice + (hasExtraTopping ? (1.5) : 0);

    }

    @Override
    public String getDescription() {
        String result = "Pasta " + name;
        if (hasExtraTopping) {
            result += "  con topping extra";
        }
        return result;
    }

    @Override
    public int getPreparationTime() {
        return 5;
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

    public boolean isHasExtraTopping() {
        return hasExtraTopping;
    }

    public void setHasExtraTopping(boolean hasExtraTopping) {
        this.hasExtraTopping = hasExtraTopping;
    }
}
