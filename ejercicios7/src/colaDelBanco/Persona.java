package colaDelBanco;

public class Persona {

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    private String nombre;
    private int dni;
    private int edad;

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Persona) {
            Persona miPersona = (Persona) obj;
            if(this.dni == miPersona.dni) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return this.nombre;
    }


}


