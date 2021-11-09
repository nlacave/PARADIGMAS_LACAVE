package stack;

public class Stack2 {
    static long fibo;
    public static void main(String[] args) {
        long posFibo = fibo(1000000000L);
        System.out.println("La posicion del numero ingresado en la sucesion fibonacci es " + posFibo);
    }

    //StackOverFlowError al buscar una posicion de un numero muy grande
    public static long fibo(long n) {
        if (n == 0 || n == 1) {
            return n;
        } else {
            fibo = fibo(n - 1) + fibo(n - 2);
        }
        return fibo;
    }
}