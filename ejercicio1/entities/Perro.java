package ejercicio1.entities;

public class Perro extends Animal{
    public Perro() {
    }

    public Perro(String nombre, int edad, String alimento, String raza) {
        super(nombre, edad, alimento, raza);
    }

    @Override
    public void alimentarse() {
        System.out.println("Estoy comiendo " + alimento);
    }
}
