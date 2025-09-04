package main.twowheels;

import main.Veicolo;

import java.util.Objects;

public final class Moto extends Veicolo {

    private String tipo;
    public Moto(String targa, String marca, String modello, int numeroPosti,String tipo) {
        super(targa, marca, modello, numeroPosti);
        this.tipo = tipo;
    }

    public static void faiRumore(){
        System.out.println("Wraahm");
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Moto moto = (Moto) o;
        return Objects.equals(tipo, moto.tipo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), tipo);
    }

    @Override
    public String toString() {
        return "Moto{" +
                "tipo='" + tipo + '\'' +
                '}';
    }
}
