package heap;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Heap {
    public Heap(String nombre) {
        this.nombre = nombre;
    }

    String nombre;
    Object objetoUnido;
    public static void main(String[] args) {
        Heap objeto1 = new Heap("Casa");
        Heap objeto2 = new Heap("Pelota");
        Heap objeto3 = new Heap("Avion");

        System.out.println("Objeto 1: " + objeto1.toString());
        System.out.println("Objeto 2: " + objeto2.toString());
        System.out.println("Objeto 3: " + objeto3.toString());
        System.out.println();

        Heap miObjeto = objeto1;
        System.out.println("Mi Objeto: " + miObjeto.toString());
        Heap tuObjeto = objeto1;
        System.out.println("Tu Objeto: " + tuObjeto.toString());
        Heap suObjeto = objeto1;
        System.out.println("Su Objeto: " + suObjeto.toString());

        System.out.println();
        Heap elObjeto;
        elObjeto = objeto1;
        System.out.println("El objeto: " + elObjeto.toString());
        elObjeto = objeto2;
        System.out.println("El objeto: " + elObjeto.toString());
        elObjeto = objeto3;
        System.out.println("El objeto: " + elObjeto.toString());

        Object o;
        o = new Object(); //Objeto que se llevara el GC.
        o = new Heap("mi objeto");
        System.out.println(o);

        int contObjetos = 0;
        System.out.println("\n1000 objetos que no se llevara el garbage collector");
        while (contObjetos < 1000) {
            o = new Object();
            List<Object> listaDeObjetos = new LinkedList<>();
            listaDeObjetos.add(o);
            contObjetos++;
            System.out.println(contObjetos + "" + listaDeObjetos);
        }
        contObjetos = 0;
        while (contObjetos < 1000) {
            o = new Object();
            contObjetos++;
            System.gc();
        }


    }

    @Override
    public String toString() {
        return this.nombre;
    }

    List<Object> lista = new ArrayList<>();


}



