import Autos.Auto;
import Autos.FabricaDeAuto;
import Futbol.Futbolista;
import Matematicas.Matematica;
import Matematicas.Multiplicador;

public class Main {
    public static void main(String[] args) {
        Matematica.multiplicar(5, 4);
        Matematica.sumar(4, 5);
        Multiplicador m = new Multiplicador(2);
        System.out.println(m.multiplicar(6));

        Matematica m2 = new Matematica();
        System.out.println(m2.dameMultiplicador(2).multiplicar(2));
        System.out.println(m2.dameMultiplicador(5).multiplicar(3));


        Futbolista messi = new Futbolista();
        messi.setNombre("Lionel Messi");
        messi.anotarGol();
        Futbolista neymar = new Futbolista();
        neymar.setNombre("Neymar Jr");
        System.out.println(messi.getCantDeGoles());
        System.out.println(neymar.getCantDeGoles());
        neymar.anotarGol();
        neymar.anotarGol();
        System.out.println(neymar.getCantDeGoles());
        System.out.println(Futbolista.maximoGoleador.getNombre());
        messi.anotarGol();
        messi.anotarGol();
        System.out.println(messi.getCantDeGoles());
        System.out.println(Futbolista.maximoGoleador.getNombre());

        FabricaDeAuto fabrica = new FabricaDeAuto("Honda");

        Auto nuevoAuto = fabrica.fabricarAuto("Fit");
        System.out.println("Usted tiene un " + nuevoAuto.marca + " " + nuevoAuto.modelo + " anio " + nuevoAuto.anio);
    }
}
