package animales;

public class Tiburon extends Animal implements Acuatico{

    public Tiburon(String nombre) {
        super(nombre);
    }
    public void nadar() {
        System.out.println("El tiburon " + getNombre() + " esta nadando");
    }

    @Override
    public void describir() {
        System.out.println("El tiburon " + getNombre() + " tiene afilados dientes");
    }
}
