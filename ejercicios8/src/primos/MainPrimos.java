package primos;

import palabras.Palabras;

public class MainPrimos {
    public static void main(String[] args) {
        numerosPrimos.esPrimo(3);
        numerosPrimos.esPrimo(4);
        numerosPrimos.esPrimo(5);
        numerosPrimos.esPrimo(2);
        numerosPrimos.esPrimo(7);
        numerosPrimos.esPrimo(10);
        System.out.println(numerosPrimos.primosConocidos());

        System.out.println(numerosPrimos.esPrimo(7));
    }
}
