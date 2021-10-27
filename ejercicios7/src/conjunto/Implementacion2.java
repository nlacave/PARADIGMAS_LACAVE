package conjunto;

import java.util.List;

public class Implementacion2 implements Conjunto{
    List<Object> listaDeObjetos;
    public Implementacion2(List<Object> listaDeObjetos) {
        this.listaDeObjetos = listaDeObjetos;
    }

    @Override
    public boolean pertenece(Object o) {
        return listaDeObjetos.contains(o);
    }
}
