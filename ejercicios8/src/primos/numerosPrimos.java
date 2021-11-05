package primos;
import java.util.*;

public class numerosPrimos {
    static int n;
    static Map<Integer, Boolean> map = new HashMap<>();

    public static boolean esPrimo(int n) {
        if (map.containsKey(n)) {
            return map.get(n);
        } else {
            int contador = 0;
            for (int i = 1; i <= n; i++) {
                if (n % i == 0 && n > 1) {
                    contador++;
                }
            }
            if (contador == 2) {
                map.put(n, true);
            } else {
                map.put(n, false);
            }
            return map.get(n);
        }
    }

    public static TreeSet<Integer> primosConocidos() {
        TreeSet<Integer> primos = new TreeSet<>();
        for (Map.Entry<Integer, Boolean> entrada : map.entrySet()) {
            if (entrada.getValue()) {
                primos.add((entrada.getKey()));
            }
        }
        return primos;
    }
}