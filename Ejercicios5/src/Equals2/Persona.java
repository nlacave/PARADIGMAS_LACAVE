package Equals2;

public class Persona {
    int dni;

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public boolean isSexo() {
            return sexo;
        }

    public void setSexo(boolean sexo) {
        this.sexo = sexo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    boolean sexo;
    String nombre;

    @Override
    public boolean equals(Object obj) {
        Persona p = (Persona) obj;
        return this.sexo == p.sexo && this.dni == p.dni;
    }
}
