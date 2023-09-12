package ejercicio2.entities;

import ejercicio2.enumeracion.Color;
import ejercicio2.enumeracion.ConsumoEnergetico;

public class Electrodomestico {

    protected double precio;
    protected String unColor;
    protected String consumoEnergetico;
    protected double peso;

    public Electrodomestico() {
    }

    public Electrodomestico(double precio, String unColor, String consumoEnergetico, double peso) {
        this.precio = precio;
        this.unColor = unColor;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return unColor;
    }

    public void setColor(String color) {
        this.unColor = color;
    }

    public String getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(String consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Electrodomestico{" +
                "precio=" + precio +
                ", color='" + unColor + '\'' +
                ", consumoEnergetico=" + consumoEnergetico +
                ", peso=" + peso +
                '}';
    }

    /**
     * Método comprobarConsumoEnergetico(char letra): comprueba que la letra es correcta,
     * sino es correcta usara la letra F por defecto. Este método se debe invocar al crear el
     * objeto y no será visible.
     */

    public String comprobarConsumoEnergetico(String letra) {
        /**
        if (!(letra.equalsIgnoreCase("A") || letra.equalsIgnoreCase("B") || letra.equalsIgnoreCase("C") || letra.equalsIgnoreCase("D") || letra.equalsIgnoreCase("E"))) {
            this.consumoEnergetico = consumoEnergetico.F;
        }
         */

        for (ConsumoEnergetico aux: ConsumoEnergetico.values()) {
            if (letra.equalsIgnoreCase(aux.name())){
                return consumoEnergetico = letra;
            }
        }

        this.consumoEnergetico = ConsumoEnergetico.F.name();
        return consumoEnergetico;
    }

    /**
     * Método comprobarColor(String color): comprueba que el color es correcto, y si no lo es,
     * usa el color blanco por defecto. Los colores disponibles para los electrodomésticos son
     * blanco, negro, rojo, azul y gris. No importa si el nombre está en mayúsculas o en
     * minúsculas. Este método se invocará al crear el objeto y no será visible.
     * @param color
     * @return unColor
     */
    public String comprobarColor(String color) {
        for (Color aux : Color.values()) {
            if (color.equalsIgnoreCase(aux.name())){
                return unColor = color;
            }
        }

        this.unColor = Color.BLANCO.name();
        return unColor;
    }

    /**
     * Metodo crearElectrodomestico(): le pide la información al usuario y llena el
     * electrodoméstico, también llama los métodos para comprobar el color y el consumo. Al
     * precio se le da un valor base de $1000.
     * @param color
     * @param consumo
     * @param peso
     * @return
     */
    public Electrodomestico crearElectrodomestico(String color, String consumo, double peso) {
        Electrodomestico e = new Electrodomestico();
        e.setColor(comprobarColor(color));
        e.setConsumoEnergetico(comprobarConsumoEnergetico(consumo));
        e.setPeso(peso);
        e.setPrecio(1000);

        return e;
    }
}
