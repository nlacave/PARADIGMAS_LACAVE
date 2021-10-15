public class Gato extends Animal {
    Gato(String nombre) {
        super(nombre, "Gato");

    }
    public void describir() {
        super.describir();
        System.out.println("Me encanta jugar con los punteros laser");
    }

    public void hacerRuido() {
        System.out.println("El gato " + super.nombre + " hace " + "miau");
    }
}
