package EqualsMasProtected;

public class Animal {

    public Animal(String especie, int peso) {
        this.especie = especie;
        this.peso = peso;
    }

    public String getEspecie() {
        return especie;
    }

    public int getPeso() {
        return peso;
    }

    protected String especie;
    protected int peso;

    public static int getLlamadosAlimentar() {
        return llamadosAlimentar;
    }

    private static int llamadosAlimentar;

    public void alimentar(int peso) {
        this.peso += peso;
        llamadosAlimentar++;
    }

    @Override
    public boolean equals(Object obj) {
        Animal a = (Animal) obj;
        return this.especie == a.especie && this.peso == a.peso;
    }
}
