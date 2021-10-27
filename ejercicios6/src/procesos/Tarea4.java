package procesos;

import java.util.List;

public class Tarea4 extends Proceso implements Tarea{
    float n;
    public Tarea4(String nombre, List<Tarea> lista, int n) {
        super.nombre = nombre;
        super.lista = lista;
        this.n = n;
    }

    @Override
    public void ejecutar() {
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i).getNombre() + " ID: " + (n + (n * 2) + 50 / 0.58 + i * (i + 5)));
        }
    }

    @Override
    public String getNombre() {
        return nombre;
    }
}
