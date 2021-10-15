package Vehiculos;

public class Vehiculo {
    public String nombre;
    public int ruedas;
    public int velocidad;
    public long kilometraje;

    public void acelerar(int aumentarVelocidad) {
        int nuevaVelocidad = this.velocidad + aumentarVelocidad;
        System.out.println("El vehículo " + nombre + " acelera, y cambia de " + velocidad + "km/h a " +
                nuevaVelocidad + "km/h.");
        this.velocidad = nuevaVelocidad;
    }

    public boolean frenado() {
        return velocidad == 0;
    }

    public void desacelerar(int disminuirVelocidad) {
        int nuevaVelocidad = this.velocidad - disminuirVelocidad;
        System.out.println("El vehículo " + nombre + " desacelera, y cambia de " + velocidad + "km/h a " +
                nuevaVelocidad + "km/h.");
        this.velocidad = nuevaVelocidad;
    }
}