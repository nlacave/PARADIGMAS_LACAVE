package heap;


import stack.Stack;

public class Heap2 {
    public static void main(String[] args) {
        objetoInfinito();
    }

    public static Heap cadenaDeObjetos() {
        Heap miObjeto = new Heap("Mi objeto");
        while (true) {
            for (int i = 0; i < 1000000; i++) {
                for (int j = 0; j < 1000000; j++) {
                    Heap nuevoObjeto = new Heap("Nuevo objeto");
                    nuevoObjeto.objetoUnido = miObjeto;
                    miObjeto = nuevoObjeto;
                    //OutOfMemoryError al crear objetos y encadenarlos entre si de manera
                    // que el GC no los pueda borrar

                }
            }
            return miObjeto;
        }
    }

    public static Object objetoInfinito() {
        Object nuevoObjeto = null;
        while (true) {
            for (int i = 0; i < 1000000; i++) {
                for (int j = 0; j < 1000000; j++) {
                    nuevoObjeto = new Object(); //Nunca se rompe por falta de memoria
                    System.out.println(nuevoObjeto);
                }
            }
            return nuevoObjeto;
        }
    }

}