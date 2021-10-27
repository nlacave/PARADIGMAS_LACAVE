package vehiculos;

public class Avion extends Vehiculo implements Volador {

    @Override
    public void volar() {
        System.out.println("El avion esta volando");
    }
}
