package runtimeExceptions;

public class Persona {
    public Persona(String nombre) {
        this.nombre = nombre;
    }
    String nombre;
    public static void mostrarNombre(Persona p) {
            System.out.println(p.nombre);
    }

    public static void verificarPersona(Persona p) {
        try {
            if (p.nombre != null && !p.nombre.equals("")) {
                mostrarNombre(p);
            } else {
                System.out.println("Persona sin nombre");
            }
        } catch (NullPointerException e) {
            System.out.println("EXCEPCION: NullPointerException. La persona no esta definida");
        } finally {
            System.out.println("Verificacion exitosa");
        }
    }

    public static void verificarPersonaEnArreglo(Persona[] personas, int posicionArreglo) {
        try {
            if (personas[posicionArreglo].nombre != null && !personas[posicionArreglo].nombre.equals("")) {
                mostrarNombre(personas, posicionArreglo);
            } else {
                System.out.println("Persona sin nombre");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("EXCEPCION: NullPointerException. La persona no se encuentra en el arreglo");
        } finally {
            System.out.println("Verificacion exitosa");
        }
    }
    public static void mostrarNombre(Persona[] personas, int posicionArreglo)  {
            System.out.println(personas[posicionArreglo].nombre);
    }
}
