package Vehiculos;

public class Moto extends Vehiculo {
    private int cilindrada;
    private boolean neumaticoSport;

    public void hacerWilly() {
        System.out.println("La moto " + nombre + " hace la willy");
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }


    public void setNeumaticoSport(boolean neumaticoSport) {
        this.neumaticoSport = neumaticoSport;
    }

    public boolean getNeumaticoSport() {
        return neumaticoSport;
    }

    }

