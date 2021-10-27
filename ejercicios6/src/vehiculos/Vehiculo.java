package vehiculos;

public abstract class Vehiculo {

    public static boolean esVolador(Vehiculo vehiculo) {
        return vehiculo instanceof Volador;
    }

    public static void hacerVolar(Vehiculo vehiculo) {
        if(vehiculo instanceof Volador) {
            ((Volador) vehiculo).volar();
        } else {
            System.out.println("Este vehiculo no vuela");
        }
    }
}
