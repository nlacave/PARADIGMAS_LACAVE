package sorting;

public class Suma implements Ordenable{
    private final int n1, n2;
    public Suma(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
    }
    @Override
    public String toString() {
        return "(" + n1 + "," + n2 + ")";
    }

    @Override
    public boolean esMayor(Ordenable o) {
        Suma s = (Suma) o;
        boolean valor = false;
        if ((this.n1 + this.n2) > (s.n1 + s.n2))  {
            valor = true;
        }
        return valor;
    }
}
