package procesos;

public class Tarea1 extends Proceso implements Tarea{


    public Tarea1 (String nombre) {
        super.nombre = nombre;
    }

    @Override
    public void ejecutar() {
        System.out.println("Ejecutando " + nombre);
    }

    @Override
    public String getNombre() {
        return nombre;
    }
}
