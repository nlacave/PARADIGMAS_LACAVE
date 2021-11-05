package palabras;

import java.util.*;

public class Palabras implements Set {

    public static Set<String> split(String oracion) {
        String[] array = oracion.split(" ");
        return new HashSet<>(Arrays.asList(array));
    }

    public static Set<String> splitOrdenado(String oracion) {
        String[] array = oracion.split(" ");
        return new TreeSet<>(Arrays.asList(array));


    }

    public static Map<String, Integer> splitContador(String oracion) {
        String[] arrayDePalabras = oracion.split(" ");
        Map<String, Integer> mapaDePalabras = new TreeMap<>();
        for (String palabra : arrayDePalabras) {
            mapaDePalabras.put(palabra, mapaDePalabras.getOrDefault(palabra, 0) + 1);
        }
        return mapaDePalabras;
    }


    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public boolean add(Object o) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }
}