public class Multiplicador extends HacedorDeCuenta {

    Multiplicador(int n) {
        super(n);
    }

    @Override
    public int hacerCuenta(int n2) {
        return n * n2;
    }
}
