package sorting;

import java.util.LinkedList;
import java.util.List;

public class BubbleSort {
    public static void ordenar(int[] elementos) {
        for (int i = 0; i < elementos.length - 1; i++) {
            for (int j = 0; j < elementos.length - 1; j++) {
                if (elementos[j] > elementos[j + 1]) {
                    int auxiliar = elementos[j];
                    elementos[j] = elementos[j + 1];
                    elementos[j + 1] = auxiliar;
                }
            }
        }
    }

    public static void ordenarObjetos(List<Ordenable> lista) {
            for (int i = 0; i < lista.size() - 1; i++) {
                for (int j = 0; j < lista.size() - 1; j++) {
                    if ((lista.get(j)).esMayor(lista.get(j + 1))) {
                        Ordenable auxiliar = lista.get(j);
                        lista.set(j, lista.get(j + 1));
                        lista.set(j + 1, auxiliar);
                    }
                }
            }
        }
    }