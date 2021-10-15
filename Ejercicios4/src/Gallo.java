public class Gallo extends Animal {

    public Gallo(String nombre) {
        super(nombre, "Gallo");
    }

    @Override
    public void describir() {
        super.describir();
    }

    @Override
    public void hacerRuido() {
        System.out.println("El gallo " + super.nombre + " hace " + "kikiriki");
    }
}
