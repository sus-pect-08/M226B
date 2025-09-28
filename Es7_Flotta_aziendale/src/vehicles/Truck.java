package vehicles;

import enums.Fuel;
import interfaces.Moving;

public class Truck extends Vehicle implements Moving {
    public Truck(String model, int year, Fuel fuelType) {
        super(model, year, fuelType);
    }



    @Override
    public void fuelCost(double distance) {
        Fuel fuelType = super.fuelType;
        if(fuelType == Fuel.GASOLINE) {
            System.out.println("fuel cost for "+ distance + " km:" + (distance * 0.29));
        } else if (fuelType == Fuel.DIESEL) {
            System.out.println("fuel cost for "+ distance + " km:" + distance * 0.35);
        }
    }
}
