package conjunto;

public class Implementacion1 implements Conjunto {

    @Override
    public boolean pertenece(Object o) {
        if (o instanceof Integer) {
            Integer i = ((Integer) o);
            return i % 2 == 0;
        }
        return false;
    }
}
