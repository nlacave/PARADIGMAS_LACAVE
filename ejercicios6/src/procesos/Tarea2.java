package procesos;

import java.util.List;

public class Tarea2 extends Proceso implements Tarea {

    public Tarea2(String nombre, List<Tarea> lista) {
        super.nombre = nombre;
        super.lista = lista;
    }

    @Override
    public void ejecutar() {
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(i + ". " + lista.get(i).getNombre());
        }

    }

    @Override
    public String getNombre() {
        return nombre;
    }
}
