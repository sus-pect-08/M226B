package content.interfaces;

public interface Purchasable {
    double calculatePrice();
    void applyDiscount(double percentage);
    static double getDedfaultTaxRate(){
        return 0.22;
    }
    default double getPriceWithTax(){
        return calculatePrice()+getDedfaultTaxRate();
    }
}
