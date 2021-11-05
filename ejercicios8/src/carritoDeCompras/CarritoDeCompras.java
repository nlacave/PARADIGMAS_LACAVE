package carritoDeCompras;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;


public class CarritoDeCompras {

    public static void main(String[] args) {

        Producto queso = new Producto("Queso La Serenisima", 1001);
        Producto jamon = new Producto("Jamon Cocido", 1032);
        Producto pan = new Producto("Pan Bimbo", 1023);
        Producto mayonesa = new Producto("Mayonesa Helmmans", 1230);
        Producto mayonesa2 = new Producto("Mayonesa Helmmans Con Menos Grasa", 1330);

        Map<Producto, Integer> carritoDeCompras = new HashMap<>();
        carritoDeCompras.put(queso, 1);
        carritoDeCompras.put(jamon, 2);
        carritoDeCompras.put(pan, 3);
        carritoDeCompras.put(mayonesa, 1);
        carritoDeCompras.put(mayonesa2, 3);

        System.out.println("\nProductos ordenados por ID de Menor a Mayor");
        Map<Producto, Integer> carritoOrdenado = new TreeMap<>(carritoDeCompras);
        System.out.println(carritoOrdenado);


        Map<Producto, Integer> productosComp = new TreeMap<>(new Comparator<Producto>() {
            @Override
            public int compare(Producto o1, Producto o2) {
                return o1.nombre.compareTo(o2.nombre);
            }

            @Override
            public boolean equals(Object obj) {
                if (obj instanceof Producto) {
                    return this.equals(obj);
                }
                return false;
            }
        });
        productosComp.putAll(carritoOrdenado);
        System.out.println("Productos ordenados por nombre");
        System.out.println(productosComp);
    }
}
