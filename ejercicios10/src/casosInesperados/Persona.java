package casosInesperados;

import java.util.Map;

public class Persona {
    protected String nombre;
    protected int edad;
    protected int dni;

    public Persona(String nombre, int edad, int dni) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
