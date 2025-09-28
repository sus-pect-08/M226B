import enums.Fuel;
import vehicles.Car;
import vehicles.Truck;
import vehicles.Van;

public class Main {
    public static void main(String[] args) {
        // 3 automobili
        Car car1 = new Car("Fiat Panda", 2020, Fuel.GASOLINE);
        Car car2 = new Car("Volkswagen Golf", 2018, Fuel.DIESEL);
        Car car3 = new Car("Tesla Model 3", 2022, Fuel.ELECTRIC);

        // 3 camion
        Truck truck1 = new Truck("Iveco Stralis", 2019, Fuel.GASOLINE);
        Truck truck2 = new Truck("Mercedes Actros", 2021, Fuel.DIESEL);
        Truck truck3 = new Truck("Volvo FH16", 2020, Fuel.ELECTRIC);

        // 3 furgoni
        Van van1 = new Van("Ford Transit", 2017, Fuel.GASOLINE);
        Van van2 = new Van("Renault Kangoo", 2019, Fuel.DIESEL);
        Van van3 = new Van("Peugeot Boxer", 2021, Fuel.GASOLINE);

        // Stampa dei veicoli
        System.out.println("Auto:");
        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);

        System.out.println("\nCamion:");
        System.out.println(truck1);
        System.out.println(truck2);
        System.out.println(truck3);

        System.out.println("\nFurgoni:");
        System.out.println(van1);
        System.out.println(van2);
        System.out.println(van3);
    }
}