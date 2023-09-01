package teorico1.main;

import teorico1.entities.Animal;
import teorico1.entities.Gato;
import teorico1.entities.Perro;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> animales = new ArrayList<>();

        Animal a = new Animal();
        Animal p = new Perro();
        Animal g = new Gato();

        animales.add(a);
        animales.add(p);
        animales.add(g);

        for (Animal aux: animales) {
            aux.hacerRuido();
        }

    }

}