package animales;

import vehiculos.Volador;

import java.util.*;

public abstract class Animal {

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }



    private String nombre;

    abstract public void describir();

    public static List<Acuatico> dameAcuaticos(List<Animal> animales) {
        List<Acuatico> animalesAcuaticos = new List<Acuatico>() {
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
            public Iterator<Acuatico> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] a) {
                return null;
            }

            @Override
            public boolean add(Acuatico acuatico) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends Acuatico> c) {
                return false;
            }

            @Override
            public boolean addAll(int index, Collection<? extends Acuatico> c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }

            @Override
            public Acuatico get(int index) {
                return null;
            }

            @Override
            public Acuatico set(int index, Acuatico element) {
                return null;
            }

            @Override
            public void add(int index, Acuatico element) {

            }

            @Override
            public Acuatico remove(int index) {
                return null;
            }

            @Override
            public int indexOf(Object o) {
                return 0;
            }

            @Override
            public int lastIndexOf(Object o) {
                return 0;
            }

            @Override
            public ListIterator<Acuatico> listIterator() {
                return null;
            }

            @Override
            public ListIterator<Acuatico> listIterator(int index) {
                return null;
            }

            @Override
            public List<Acuatico> subList(int fromIndex, int toIndex) {
                return null;
            }
        };
        for (int i = 0; i < animales.size(); i++) {
            if (animales.get(i) instanceof Acuatico) {
                animalesAcuaticos.add((Acuatico) animales.get(i));
            }
        }
        return animalesAcuaticos;
    }

    public static void showDeAnimales(List<Animal> animales) {
        for (Animal animal : animales) {
            if (animal instanceof Acuatico) {
                ((Acuatico) animal).nadar();
            } else if (animal instanceof Volador) {
                ((Volador) animal).volar();
            } else {
                System.out.println(animal.nombre + " no hace nada");
            }
        }
    }
}
