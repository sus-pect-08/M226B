package Manager;

import Food.Dessert;
import Food.Pasta;
import Food.Pizza;
import interfaces.MenuItem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class RestaurantManager {
    private HashMap<String, MenuItem> menu = new HashMap<>();
    private HashSet<String> costumers = new HashSet<>();
    private HashMap<String, Integer> orders = new HashMap<>();

    public void addMenuItems(){
        ArrayList<String> topping_m = new ArrayList<String>();
        topping_m.add("mozzarella");
        topping_m.add("pomodoro");
        topping_m.add("basilico");
        ArrayList<String> topping_q = new ArrayList<String>();
        topping_q.add("mozzarella");
        topping_q.add("prosciutto");
        topping_q.add("funghi");
        topping_q.add("carciofi");
        topping_q.add("olive");
        Pizza margherita = new Pizza("Margherita", 7.50, topping_m);
        Pizza quattro_stagioni = new Pizza("Quattro Stagioni", 7.50, topping_q);

        Dessert tiramisu = new Dessert("Tiramisù", 5, false);
        Dessert panna_cotta = new Dessert("Panna Cotta", 5, true);

        Pasta arrabiata = new Pasta("Arrabiata", 9.6, true);
        Pasta carbonara = new Pasta("Carbonara", 9.0, false);

        menu.put("margerita", margherita);
        menu.put("quattro formaggi", quattro_stagioni);
        menu.put("tiramisu", tiramisu);
        menu.put("panna cotta", panna_cotta);
        menu.put("arrabiata", arrabiata);
        menu.put("carbonara", carbonara);

        System.out.println(menu);


    }

    public void addOrder(String costumer, String item){
        costumers.add(costumer);
        if (orders.containsKey(item)){
            orders.put(item, orders.get(item) + 1);
        }else{
            orders.put(item, 1);
        }
        System.out.println("Ordine registrato: " + costumer + " - " + orders.get(item));
    }

    public void Statiscs(){
        System.out.println("========== STATISTICHE GIORNALIERE ==========");
        System.out.println("Clienti unici oggi: "  + costumers.size());
        System.out.println("Clienti: \n" + costumers);
        for (String item : orders.keySet()){

        }
        System.out.println("Piatto più poplare: " );

        int totaltime = 0;
        double totalprice = 0;
        for (String item : orders.keySet()){
            for (String key : menu.keySet()){
                if (key.equals(item)){
                    totaltime += (menu.get(key)).getPreparationTime();
                    totalprice += (menu.get(key)).calculatePrice();
                }
            }
        }
        System.out.println("Tempo medio di preparazione: " + totaltime + " minuti");
        System.out.println("=============================================");
        System.out.println("FATTURATO TOTALE: $" + totalprice);

    }

}
