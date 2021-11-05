package carritoDeCompras;

import java.util.Objects;

public class Producto implements Comparable {
    Producto(String nombre, int idProducto) {
        this.nombre = nombre;
        this.idProducto = idProducto;
    }

    int idProducto;
    String nombre;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Producto)) {
            return false;
        }
        Producto producto = (Producto) o;
        return idProducto == producto.idProducto;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idProducto, nombre);
    }

    @Override
    public String toString() {
        return nombre + " ID: " + idProducto;
    }

    @Override
    public int compareTo(Object o) {
        if(o instanceof Producto) {
            return this.idProducto - ((Producto) o).idProducto;
        }
        return -1;
    }
}