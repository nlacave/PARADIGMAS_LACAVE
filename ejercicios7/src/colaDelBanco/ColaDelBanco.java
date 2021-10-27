package colaDelBanco;

import java.util.Deque;
import java.util.Queue;

public class ColaDelBanco extends Persona{
    public ColaDelBanco(Deque<Persona> cola) {
        this.cola = cola;
    }

    public void agregar(Persona p) {
        if (!cola.contains(p)) {
            if (cola instanceof Deque) {
                if (p.getEdad() > 60) {
                    ((Deque<Persona>) cola).addFirst(p);
                }
            } else {
                cola.add(p);
            }
        }
    }
    public Queue<Persona> cola;

    public Persona atender() {
        return cola.poll();
    }

}
