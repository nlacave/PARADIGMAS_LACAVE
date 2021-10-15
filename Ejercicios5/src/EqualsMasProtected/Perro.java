package EqualsMasProtected;

public class Perro extends Animal {

    public Perro(int peso) {
        super("perro", peso);
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    private String raza;

    public boolean equals(Object obj) {
        Perro p = (Perro) obj;
        return this.peso == p.peso && this.raza == p.raza && this.especie == p.especie;
    }
}
