package sorting;

import java.util.List;

public class Par implements Ordenable {
    public Par(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    private final int n1;
    private final int n2;


    @Override
    public String toString() {
        return "(" + n1 + "," + n2 + ")";
    }

    @Override
    public boolean esMayor(Ordenable o) {
        Par p = (Par) o;
        boolean valor = false;
        if (this.n1 > p.n1) {
            valor = true;
        }
        if (this.n1 == p.n1) {
            if (this.n2 > p.n2) {
                valor = true;
            }
        }
        return valor;
    }
}