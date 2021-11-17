package exceptions;

public class Exception {
    public static void main(String[] args) throws ArithmeticException {
        // division(4, 0); ArithmeticException
        try {
            division(4, 0);
        } catch (ArithmeticException a) {
            System.out.println("EXCEPCION: ArithmeticException. No se puede dividir por 0");
        }
    }

    public static void division(int n, int n2) throws ArithmeticException {
        System.out.println("El resultado de la division es " + n / n2);
    }
}
