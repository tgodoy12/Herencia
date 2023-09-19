package ejercicio2.enumeracion;

public enum ConsumoEnergetico {
    A(1000),
    B(800),
    C(600),
    D(500),
    E(300),
    F(100);

    int precioConsumo;

    ConsumoEnergetico(int precio) {
        this.precioConsumo = precio;
    }

    public int getPrecioConsumo() {
        return precioConsumo;
    }
}
