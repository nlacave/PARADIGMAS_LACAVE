package animales;

import vehiculos.Volador;

public class Aguila extends Animal implements Volador {

    public Aguila(String nombre) {
        super(nombre);
    }

    @Override
    public void describir() {
        System.out.println("El aguila " + this.getNombre() + " posee alas muy largas");
    }

    @Override
    public void volar() {
        System.out.println("El aguila " + this.getNombre() + " esta volando");
    }
}
