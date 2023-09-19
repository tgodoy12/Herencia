package ejercicio2.main;

import ejercicio2.entities.Electrodomestico;


public class Main {
    public static void main(String[] args) {
        Electrodomestico e = new Electrodomestico();

        Electrodomestico e2 = e.crearElectrodomestico("NEGRO", "D", 50);
        System.out.println(e2.toString());



    }
}
