package ABC;

public class C extends B{
    public C(int numero){
        super(numero);
        System.out.println("Estoy construyendo un C: " + numero);
    }

    public void hola() {
        System.out.println("Hola en C");
    }
}
