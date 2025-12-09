package Creatures;

import javax.swing.*;
import Other.*;

import java.security.spec.RSAOtherPrimeInfo;

public abstract class AquaticCreature implements Actions {
    private int energy, age;
    private String name;

    public AquaticCreature(int energy, int age, String name) {
        this.energy = energy;
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public void move(){
        if (energy > 0){
            energy -= 2;
            System.out.println(name + "si muove nell'acqua");
        }else{
            System.out.println(name + "è morto");
        }
    }
    public void eat() {
        energy += 25;
        System.out.println(name + "si è nutrito. Nuovo livello di energia: " + energy);
    }
}
