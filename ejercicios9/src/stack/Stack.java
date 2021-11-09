package stack;

public class Stack {
    public int tamanio;

    public int[] crearArray(int tamanio) {
        return new int[tamanio];
    }

    public int[] agregarValor(int posicion, int valor) {
        int[] array = crearArray(10);
        array[posicion] = valor;
        return array;
    }

    public void imprimirArray() {
        int valor = 0;
        int[] array = agregarValor(10, valor);
        //error ArrayIndexOutOfBounds por querer agregar un valor en una posicion que no existe
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + tamanio);
        }
    }
}

