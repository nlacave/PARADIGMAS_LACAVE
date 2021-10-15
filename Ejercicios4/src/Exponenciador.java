public class Exponenciador extends HacedorDeCuenta{
    Exponenciador(int n) {
        super(n);
    }

    @Override
        public int hacerCuenta(int n2) {
            return (int) Math.pow(n,n2);
    }
}
