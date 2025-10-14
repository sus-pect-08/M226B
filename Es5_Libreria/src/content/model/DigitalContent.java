package content.model;

import content.interfaces.Purchasable;

import java.util.Objects;

public abstract class DigitalContent implements Purchasable {
    private int id;
    private String title;
    private String author;
    private double basePrize;
    private double currentDiscount;


    public DigitalContent(int id, String title, String author, double basePrize, double currentDiscount) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.basePrize = basePrize;
        this.currentDiscount = currentDiscount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getauthor() {
        return author;
    }

    public void setauthor(String author) {
        this.author = author;
    }

    public double getBasePrize() {
        return basePrize;
    }

    public void setBasePrize(double basePrize) {
        this.basePrize = basePrize;
    }

    public double getCurrentDiscount() {
        return currentDiscount;
    }

    public void setCurrentDiscount(double currentDiscount) {
        this.currentDiscount = currentDiscount;
    }

    public  double calculatePrice(){
        return basePrize*currentDiscount;
    }

    @Override
    public void applyDiscount(double percentage) {
            currentDiscount = percentage;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        DigitalContent that = (DigitalContent) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
