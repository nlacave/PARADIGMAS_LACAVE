public class Futbolista {
    private int edad;
    private String nombre;
    private String nacionalidad;

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public int getGoles() {
        return goles;
    }

    public void setGoles(int goles) {
        this.goles = goles;
    }

    private int goles;

    public void patear(String nombre) {
        System.out.println("El jugador " + nombre + " patea al arco");
    }

    public void gol() {
        goles++;
    }

}
