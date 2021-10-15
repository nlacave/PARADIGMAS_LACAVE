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

        A objetoA = new A(2);
        B objetoB = new B(2);
        C objetoC = new C(2);

        objetoA.hola();
        objetoB.hola();
        objetoC.hola();

        Animal tomy = new Gato("Tomy");
        Animal belu = new Pato("Belu");
        Animal geronimo = new Gallo("Geronimo");
        Animal[] listaDeAnimales = {tomy, belu, geronimo};

        Animal.escucharTodos(listaDeAnimales);

        Multiplicador m = new Multiplicador(5);
        System.out.println(m.hacerCuenta(3));

        Sumador s = new Sumador(5);
        System.out.println(s.hacerCuenta(3));

        Exponenciador e = new Exponenciador(5);
        System.out.println(e.hacerCuenta(3));


    }
}
