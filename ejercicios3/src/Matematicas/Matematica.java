package Matematicas;

public class Matematica {
    public static void sumar(int n1, int n2) {
        int suma = n1 + n2;
        System.out.println("El resultado de la suma es " + suma);
    }

    public static void multiplicar(int n1, int n2) {
        int multiplicacion = n1 * n2;
        System.out.println("El resultado de la multiplicación es " + multiplicacion);
    }
    public Multiplicador dameMultiplicador(int n) {
        return new Multiplicador(n);
    }
}

