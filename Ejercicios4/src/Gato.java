public class Gato extends Animal {
    Gato(String nombre) {
        super(nombre, "Gato");

    }

    public void hacerRuido() {
        System.out.println("El gato " + super.nombre + " hace " + "miau");
    }
}
