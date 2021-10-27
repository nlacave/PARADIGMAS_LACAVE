package listaDeStrings;

import java.util.List;

public class Listas {
    public static void borrarTodos(List<String> lista, String nombre) {
        while (lista.contains(nombre)) {
            lista.remove(nombre);
        }
    }
}