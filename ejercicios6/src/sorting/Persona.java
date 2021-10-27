package sorting;

public class Persona implements Ordenable {
    protected int dni;
    protected boolean sexo;
    public Persona(int dni, boolean sexo) {
        this.dni = dni;
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "(" + dni + "," + sexo + ")";
    }

    @Override
    public boolean esMayor(Ordenable o) {
        Persona p = (Persona) o;
        boolean valor = false;
        if (this.dni < p.dni) {
            valor = true;
        }
        if (this.dni == p.dni) {
            if (this.sexo != p.sexo) {
                valor = true;
            }
        }
        return valor;
    }
}
