package vehicles;

import enums.Fuel;

public abstract class Vehicle {
    private String model;
    private int year;
    Fuel fuelType;

    public Vehicle(String model, int year, Fuel fuelType) {
        this.model = model;
        this.year = year;
        this.fuelType = fuelType;
    }

    public String assingDestination(String destination) {
        return getModel() + " has been assigned to destination: " + destination + "\n Status: Vehicle is in motion";
    }

    void departureAndArrival(boolean isArrival) {
        if (isArrival == true) {
            System.out.println("Arrived at destination.");
        }else {
            System.out.println(model + "has departed from start point.");
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
