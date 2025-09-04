package main;

import Mechanics.Motore;

import java.util.Objects;

public class Veicolo {
    private String targa;
    private String marca;
    private String modello;
    private int numeroPosti;
    private Motore motore;

    public Veicolo(String targa, String marca, String modello, int numeroPosti) {
        this.targa = targa;
        this.marca = marca;
        this.modello = modello;
        this.numeroPosti = numeroPosti;
    }


    public static void faiRumore(){
        System.out.println("Wruuhm");
    }


    public String getTarga() {
        return targa;
    }

    public String getMarca() {
        return marca;
    }

    public String getModello() {
        return modello;
    }

    public int getNumeroPosti() {
        return numeroPosti;
    }

    public void setTarga(String targa) {
        this.targa = targa;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setNumeroPosti(int numeroPosti) {
        this.numeroPosti = numeroPosti;
    }

    public Motore getMotore() {
        return motore;
    }

    public void setMotore(Motore motore) {
        this.motore = motore;
    }

    @Override
    public String toString() {
        return "Veicolo{" +
                "targa='" + targa + '\'' +
                ", marca='" + marca + '\'' +
                ", modello='" + modello + '\'' +
                ", numeroPosti=" + numeroPosti + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Veicolo veicolo = (Veicolo) o;
        return  Objects.equals(marca, veicolo.marca) && Objects.equals(modello, veicolo.modello);
    }

    @Override
    public int hashCode() {
        return Objects.hash(marca, modello);
    }
}