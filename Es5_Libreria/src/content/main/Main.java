package content.main;

import content.enums.Difficulty;
import content.interfaces.Purchasable;
import content.model.AudioBook;
import content.model.DigitalMagazine;
import content.model.EBook;
import content.model.OnlineCourse;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        AudioBook book1 = new AudioBook(1,"blood and ash", "Jennifer Armentrout", 20, 0.1);
        EBook book2 = new EBook(2, "Fourth wing", "Rebbecca Yorros", 20, 0.1);
        DigitalMagazine magazine = new DigitalMagazine(3, "maga", "brussels", 10, 0.0, 1, date);
        OnlineCourse course = new OnlineCourse(4, "base", "tito", 5.00, 0.2, "tito", Difficulty.INTERMEDIATE);
        Set<Purchasable> purchasables = new HashSet<>();
        purchasables.add(book1);
        purchasables.add(book2);

        for (Purchasable purchasable : purchasables) {
            System.out.println(purchasable.calculatePrice() + "metodo ereditario");
            System.out.println(purchasable.calculatePrice() + "metodo polimorfico");
        }
        System.out.println(purchasables);

    }
}