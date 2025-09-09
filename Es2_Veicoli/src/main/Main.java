package main;

import Mechanics.Motore;
import main.fourwheels.Camion;
import main.twowheels.*;


public class Main {
    public static void main(String[] args){
        Moto moto = new Moto("TI 3424", "Ducati", "950 sport", 2, "sportiva stradale");
        Camion camion = new Camion("AG 237409234", "Volvo", "FM", 3, 120);

        Moto.faiRumore();
        Camion.faiRumore();

        moto.setMotore(new Motore("AH347JD","bicilindrico a L raffreddato a liquido, Testastretta 11°"));


    }
}
