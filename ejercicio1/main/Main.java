package ejercicio1.main;

import ejercicio1.entities.Animal;
import ejercicio1.entities.Caballo;
import ejercicio1.entities.Gato;
import ejercicio1.entities.Perro;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Animal p1 = new Perro("Chiquito", 15, "comida de perro", "beagle");
        Animal c1 = new Caballo("Horse", 6, "pasto", "x");
        Animal g1 = new Gato("Bichito", 2, "galletitas", "mezcladito");

        ArrayList<Animal> animales = new ArrayList<>();
        animales.add(p1);
        animales.add(c1);
        animales.add(g1);

        for (Animal aux: animales) {
            aux.alimentarse();
            System.out.println(aux.getNombre());
        }

    }
}
