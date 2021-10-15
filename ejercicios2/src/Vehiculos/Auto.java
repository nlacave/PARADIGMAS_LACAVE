package Vehiculos;

public class Auto extends Vehiculo {
    public int getCantDePuertas() {
        return cantDePuertas;
    }

    public void setCantDePuertas(int cantDePuertas) {
        this.cantDePuertas = cantDePuertas;
    }

    public boolean isAirbag() {
        return airbag;
    }

    public void setAirbag(boolean airbag) {
        this.airbag = airbag;
    }

    public int cantDePuertas;
    public boolean airbag;

    public void aireAutomatico(int temperatura) {
        boolean aireFrio = false;
        boolean aireCaliente = false;

        if (temperatura >= 30) {
            aireFrio = true;
            System.out.println("El aire se ha encendido en modo frio");
        } else if (temperatura <= 10) {
            aireCaliente = true;
            System.out.println("El aire se ha encendido en modo caliente");
        } else {
            System.out.println("La temperatura es buena, no es necesario prender el aire");
        }

        System.out.println("Aire frio: " + aireFrio);
        System.out.println("Aire caliente: " + aireCaliente);
    }
}