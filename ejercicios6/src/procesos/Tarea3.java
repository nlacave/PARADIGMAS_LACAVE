package procesos;

public class Tarea3 extends Proceso implements Tarea {

    public Tarea3(String nombre) {
        super.nombre = nombre;
    }

    @Override
    public void ejecutar() {
        nombre = "Tarea generica";
    }

    @Override
    public String getNombre() {
        return nombre;
    }
}

