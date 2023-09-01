package ejercicio1.entities;

public class Caballo extends Animal{
    public Caballo() {
    }

    public Caballo(String nombre, int edad, String alimento, String raza) {
        super(nombre, edad, alimento, raza);
    }

    @Override
    public void alimentarse() {
        System.out.println("Estoy comiendo " + alimento);
    }
}
