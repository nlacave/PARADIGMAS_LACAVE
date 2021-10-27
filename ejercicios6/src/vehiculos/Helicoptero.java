package vehiculos;

public class Helicoptero extends Vehiculo implements Volador {

    @Override
    public void volar() {
        System.out.println("El helicoptero esta volando");
    }

}
