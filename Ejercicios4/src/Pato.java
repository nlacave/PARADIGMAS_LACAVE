public class Pato extends Animal {
    public Pato(String nombre) {
        super(nombre, "Pato");
    }

    public void describir(){
        super.describir();
        System.out.println("Me gusta pasear por los lagos de Palermo");
    }

    @Override
    public void hacerRuido() {
        System.out.println("El Pato " + nombre + " hace " + "cuak cuak");
    }
}
