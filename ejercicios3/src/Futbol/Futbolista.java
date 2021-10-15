package Futbol;

public class Futbolista {

    public Futbolista() {

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEquipo() {
        return equipo;
    }

    public void setEquipo(int equipo) {
        this.equipo = equipo;
    }

    public int getCantDeGoles() {
        return cantDeGoles;
    }

    private String nombre;
    private int equipo;
    private int cantDeGoles = 0;
    public static Futbolista maximoGoleador = new Futbolista();

    public void anotarGol() {
        cantDeGoles += 1;
            if (this.getCantDeGoles() > maximoGoleador.getCantDeGoles()) {
                maximoGoleador = this;
            }
        }
    }
