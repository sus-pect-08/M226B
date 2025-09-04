package Mechanics;

public class Motore {
    private String numeroDiSerie;
    private String modello;

    public Motore(String numeroDiSerie, String modello) {
        this.numeroDiSerie = numeroDiSerie;
        this.modello = modello;
    }

    public String getNumeroDiSerie() {
        return numeroDiSerie;
    }

    public void setNumeroDiSerie(String numeroDiSerie) {
        this.numeroDiSerie = numeroDiSerie;
    }

    public String getModello() {
        return modello;
    }
    public void setModello(String modello) {
        this.modello = modello;
    }

    @Override
    public String toString() {
        return "Motore{modello='" + modello + "', numeroDiSerie='" + numeroDiSerie + "'}";
    }
}
