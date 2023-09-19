package ejercicio2.entities;

public class Lavadora extends Electrodomestico {
    protected int carga;

    public Lavadora() {
    }

    public Lavadora(double precio, String unColor, String consumoEnergetico, double peso, int carga) {
        super(precio, unColor, consumoEnergetico, peso);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }
    




}
