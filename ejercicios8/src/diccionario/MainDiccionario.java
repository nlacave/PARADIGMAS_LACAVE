package diccionario;

import palabras.Palabras;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MainDiccionario {

    public static void main(String[] args) {

        Map<String, String> diccionario = new TreeMap<>();

        diccionario.put("Comer", "Tomar alimento por la boca, en especial un alimento sólido, " +
                "masticándolo y tragándolo para que pase al estómago.");
        diccionario.put("Jugar", "Realizar una actividad o hacer una cosa, generalmente ejercitando" +
                " alguna capacidad o destreza, con el fin de divertirse o entretenerse.");

        Set<String> conjuntoDePalabras1 = Palabras.split("Comer Dormir");

        Diccionario.imprimirDefinicion(conjuntoDePalabras1, diccionario);

        Set<String> conjuntoDePalabras2 = Palabras.split("Jugar Comer");

        System.out.println();

        Diccionario.imprimirDefinicion(conjuntoDePalabras2,diccionario);
    }
}
