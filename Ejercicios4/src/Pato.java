public class Pato extends Animal {
    public Pato(String nombre) {
        super(nombre, "Pato");
    }

    @Override
    public void hacerRuido() {
        System.out.println("El Pato " + nombre + " hace " + "cuak cuak");
    }
}
