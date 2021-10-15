package ABC;

public class B extends A{
    public B(int numero){
        super(numero);
        System.out.println("Estoy construyendo un B: " + numero);
    }

    public void hola() {
        System.out.println("Hola en B");
    }
}
