package diccionario;

import java.util.Map;
import java.util.Set;

public class Diccionario {

    public static void imprimirDefinicion(Set<String> palabras, Map<String, String> diccionario) {
        for (String palabra : palabras) {
            if (diccionario.containsKey(palabra)) {
                System.out.println(palabra + ": " + diccionario.get(palabra));
            } else {
                System.out.println(palabra + ": " + diccionario.getOrDefault(palabra, "Palabra" +
                        " no encontrada"));
            }
        }
    }
}
