package procesos;

import java.util.List;


public class Proceso {

    public static void procesarBatch(List<Tarea> tareas) {
        for(int i = 0; i < tareas.size(); i++) {
            System.out.println(tareas.get(i).getNombre());
            tareas.get(i).ejecutar();
        }
    }


    protected String nombre;

    protected List<Tarea> lista;

}
