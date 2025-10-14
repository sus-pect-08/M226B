package vehicles;

import enums.Fuel;
import interfaces.Moving;


public class Car extends Vehicle implements Moving  {

    public Car(String model, int year, Fuel fuelType) {
        super(model, year, fuelType);
    }


    @Override
    public void fuelCost(double distance) {
        Fuel fuelType = super.fuelType;
        if(fuelType == Fuel.GASOLINE) {
            System.out.println("fuel cost for "+ distance + " km:" + (distance * 0.18));
        } else if (fuelType == Fuel.DIESEL) {
            System.out.println("fuel cost for "+ distance + " km:" + distance * 0.30);
        }else if (fuelType == Fuel.ELECTRIC) {
            System.out.println("No fuel cost");
        }
    }

}
