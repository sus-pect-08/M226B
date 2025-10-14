package Main;
import Manager.RestaurantManager;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Main {
    public static void main(String[] args) {


        System.out.println("=============== MENU DEL RISTORANTE ===============");
        RestaurantManager manager = new RestaurantManager();
        manager.addMenuItems();
        System.out.println("========== REGISTRAZIONE ORDINI ==========");
        manager.addOrder("Mario Rossi", "margherita");
        manager.addOrder("Luca Bainchi", "carbonara");
        manager.addOrder("Anna Verdi", "quattro stagioni");
        manager.addOrder("Mario Rossi", "tiramisu");
        manager.addOrder("Luca Bainchi", "panna cotta");
        manager.addOrder("Anna Verdi", "tiramisu");

        manager.Statiscs();
    }
}