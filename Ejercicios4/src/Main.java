import ABC.A;
import ABC.B;
import ABC.C;
import SobrecargaySobreescritura.Perro;

public class Main {
    public static void main(String[] args) {

        Perro perro = new Perro();
        Vaca vaca = new Vaca();
        perro.hacerSonido("guau");
        perro.hacerSonido();
        vaca.hacerSonido();
        vaca.hacerSonido("muuuu");

        System.out.println("El animal hace " + perro.hacerSonido());
        System.out.println("El animal hace " + vaca.hacerSonido());

        A objetoA = new A(1);
        B objetoB = new B(2);
        C objetoC = new C(3);

        objetoA.hola();
        objetoB.hola();
        objetoC.hola();

        Animal tomy = new Gato("Tomy");
        Animal belu = new Pato("Belu");
        Animal geronimo = new Gallo("Geronimo");

        Animal[] listaDeAnimales = {tomy, belu, geronimo};

        Animal.escucharTodos(listaDeAnimales);

        tomy.describir();
        belu.describir();
        geronimo.describir();

        Multiplicador m = new Multiplicador(5);
        System.out.println("Multiplicador resultado: " + m.hacerCuenta(3));

        Sumador s = new Sumador(5);
        System.out.println("Sumador resultado: " + s.hacerCuenta(3));

        Exponenciador e = new Exponenciador(5);
        System.out.println("Exponenciador resultado: " + e.hacerCuenta(3));


    }
}
