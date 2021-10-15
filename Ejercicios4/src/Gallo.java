public class Gallo extends Animal {

    public Gallo(String nombre) {
        super(nombre, "Gallo");
    }

    @Override
    public void describir() {
        super.describir();
        System.out.println("Cuando soy chico me conocen como pollo");
    }

    @Override
    public void hacerRuido() {
        System.out.println("El gallo " + super.nombre + " hace " + "kikiriki");
    }
}
