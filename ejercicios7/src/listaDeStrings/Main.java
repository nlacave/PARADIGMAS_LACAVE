package listaDeStrings;
import colaDelBanco.ColaDelBanco;
import colaDelBanco.Persona;
import conjunto.Implementacion1;
import conjunto.Implementacion2;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        LinkedList<String> listaDeNombres = new LinkedList<>();


        listaDeNombres.add("Pedro");
        listaDeNombres.add("Juan");
        listaDeNombres.add("Pablo");
        listaDeNombres.add("Marcos");
        listaDeNombres.add("Mateo");
        listaDeNombres.add("Lucas");

        System.out.println("Lista de nombres con for clasico");
        for (int i = 0; i < listaDeNombres.size(); i++) {
            System.out.println(listaDeNombres.get(i));
        }
        System.out.println();


        System.out.println();
        System.out.println("Lista de nombres con for de colecciones");
        for (String nombre : listaDeNombres) {
            System.out.println(nombre);
        }

        listaDeNombres.set(0, "Nicolas");
        listaDeNombres.set(2, "Esteban");
        listaDeNombres.set(5, "David");

        System.out.println();
        System.out.println("Lista de nombres modificados");
        System.out.println(listaDeNombres);

        System.out.println();
        System.out.println("Lista con nombre borrado");
        listaDeNombres.remove(0);
        System.out.println(listaDeNombres);

        System.out.println();
        System.out.println("Lista con nombre repetido");
        listaDeNombres.add(0, "Nicolas");
        listaDeNombres.add(1, "Nicolas");
        System.out.println(listaDeNombres);

        System.out.println();
        System.out.println("Lista con nombre repetido borrado");
        listaDeNombres.remove("Nicolas");
        System.out.println(listaDeNombres);

        System.out.println();
        System.out.println("Se encuentra el elemento buscado?");
        System.out.println(listaDeNombres.contains("Esteban"));
        listaDeNombres.add(4, "Esteban");
        System.out.println(listaDeNombres);
        System.out.println();

        System.out.println("Aplicando el metodo borrarTodos:");
        Listas.borrarTodos(listaDeNombres, "Esteban");
        System.out.println(listaDeNombres);

        System.out.println();
        System.out.println("Creacion de listas de tipos primitivos");
        LinkedList<Integer> listaDeEnteros = new LinkedList<>();
        listaDeEnteros.add(1);
        listaDeEnteros.add(2);
        listaDeEnteros.add(5);
        listaDeEnteros.add(7);
        listaDeEnteros.add(8);
        listaDeEnteros.add(6);

        System.out.println(listaDeEnteros);
        System.out.println();

        LinkedList<Long> listaDeLongs = new LinkedList<>();
        listaDeLongs.add(1L);
        listaDeLongs.add(54L);
        listaDeLongs.add(643L);
        listaDeLongs.add(22456L);
        listaDeLongs.add(225676L);
        listaDeLongs.add(22568775L);

        System.out.println(listaDeLongs);
        System.out.println();

        ArrayList<Float> listaDeFloats = new ArrayList<>();
        listaDeFloats.add(5.4F);
        listaDeFloats.add(3.4F);
        listaDeFloats.add(2.7F);
        listaDeFloats.add(8.5F);
        listaDeFloats.add(1.4F);
        listaDeFloats.add(9.3F);

        System.out.println(listaDeFloats);
        System.out.println();


        ArrayList<Boolean> listaDeBooleans = new ArrayList<>();
        listaDeBooleans.add(true);
        listaDeBooleans.add(false);
        listaDeBooleans.add(true);
        listaDeBooleans.add(true);
        listaDeBooleans.add(false);
        listaDeBooleans.add(true);

        System.out.println(listaDeBooleans);
        System.out.println();

        LinkedList<Double> listaDeDoubles = new LinkedList<>();
        listaDeDoubles.add(535.45);
        listaDeDoubles.add(456.353);
        listaDeDoubles.add(123.457);
        listaDeDoubles.add(987764.2);
        listaDeDoubles.add(5325.212);
        listaDeDoubles.add(7765.86);

        System.out.println(listaDeDoubles);
        System.out.println();

        ArrayList<Character> listaDeChars = new ArrayList<>();
        listaDeChars.add('a');
        listaDeChars.add('3');
        listaDeChars.add('e');
        listaDeChars.add('p');
        listaDeChars.add('D');
        listaDeChars.add('5');

        System.out.println(listaDeChars);
        System.out.println();

        int[] arrayDeNumeros = {1, 6, 4, 9, 2, 59, 23, 78, 10, 28, 54};

        java.util.Arrays.sort(arrayDeNumeros);

        for (int numero : arrayDeNumeros) {
            System.out.print(numero + " ");
        }
        System.out.println();
        List<int[]> listaDeNumeros = java.util.Arrays.asList(arrayDeNumeros);


        for (int i = 0; i < listaDeNumeros.size(); i++) {
            System.out.println((Arrays.toString(listaDeNumeros.get(i))));
        }

        List<Integer> listaDesordena = new ArrayList<>();
        listaDesordena.add(4);
        listaDesordena.add(3);
        listaDesordena.add(0);
        listaDesordena.add(5);
        listaDesordena.add(1);

        java.util.Collections.sort(listaDesordena);
        System.out.println(listaDesordena);

        Object[] nuevoArray = listaDesordena.toArray();
        for (int i = 0; i < nuevoArray.length; i++) {
            System.out.print(nuevoArray[i] + " ");
        }
        System.out.println();

        Persona p1 = new Persona();
        Persona p2 = new Persona();
        Persona p3 = new Persona();
        p1.setNombre("Nicolas");
        p2.setNombre("Esteban");
        p1.setDni(43);
        p1.setEdad(20);
        p2.setDni(43);
        p2.setEdad(50);
        p3.setNombre("Pedro");
        System.out.println(p1.equals(p2));
        p3.setEdad(61);
        Deque<Persona> colaDePersonas = new LinkedList<>();
        colaDePersonas.add(p1);
        colaDePersonas.add(p2);

        ColaDelBanco colaDelBanco = new ColaDelBanco(colaDePersonas);
        System.out.println(colaDelBanco.cola.toString());

        colaDelBanco.agregar(p3);
        System.out.println(colaDelBanco.cola.toString());

        System.out.println(colaDelBanco.atender());
        System.out.println(colaDelBanco.cola.toString());

        Implementacion1 numerosPares = new Implementacion1();
        Integer num = 6;
        System.out.println(numerosPares.pertenece(num));
        System.out.println();

        List<Object> nombres = new LinkedList<>();
        nombres.add("Pablo");
        nombres.add("Hector");
        nombres.add("Eduardo");
        Implementacion2 listaDeObjetos = new Implementacion2(nombres);
        System.out.println(listaDeObjetos.pertenece("Pablo"));
    }
}