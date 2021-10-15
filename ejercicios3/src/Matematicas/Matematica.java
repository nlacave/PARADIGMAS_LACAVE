package Matematicas;

public class Matematica {
    public static void sumar(int n1, int n2) {
        return n1 + n2;
        
    }

    public static void multiplicar(int n1, int n2) {
        return n1 * n2;
        
    }
    public Multiplicador dameMultiplicador(int n) {
        return new Multiplicador(n);
    }
}

