import Equals1.Album;
import Equals2.Persona;
import EqualsMasProtected.Animal;
import EqualsMasProtected.Perro;

public class Main {
    public static void main(String[] args) {
        Album a = new Album();
        a.setTitulo("Increible");
        a.setArtista("Miel San Marcos");

        Album b = new Album();
        b.setTitulo("3");
        b.setArtista("4");

        System.out.println(a == b);
        System.out.println(b.equals(a));

        Persona p = new Persona();
        Persona j = new Persona();

        p.setDni(43441883);
        p.setNombre("Nicolas Lacave");
        p.setSexo(true);

        j.setNombre("Esteban Lacave");
        j.setDni(43441883);
        j.setSexo(true);
        System.out.println(p.equals(j));

        Animal animal1 = new Animal("leon",5);
        Animal animal2 = new Animal("leon",7);


        animal1.alimentar(2);
        System.out.println(Animal.getLlamadosAlimentar());
        System.out.println("Peso animal 1: " + animal1.getPeso());

        animal2.alimentar(1);
        System.out.println(animal1.equals(animal2));
        System.out.println(Animal.getLlamadosAlimentar());
        System.out.println("Peso animal 2: " + animal2.getPeso());
        System.out.println(animal1.equals(animal2));
        Perro pepe = new Perro(8);
        Perro scooby = new Perro(7);

        pepe.alimentar(1);
        scooby.alimentar(2);
        System.out.println(scooby.getPeso());
        System.out.println(pepe.getPeso());

        System.out.println(scooby.getEspecie());
        System.out.println(pepe.getEspecie());

        scooby.setRaza("labrador");
        pepe.setRaza("labrador");
        System.out.println(pepe.equals(scooby));
    }
}
