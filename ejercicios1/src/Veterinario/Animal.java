package Veterinario;

public class Animal {
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

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getPeso() {
        return peso;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    private String especie;
    private int edad;
    private String nombre;
    private int peso;

    public void describir() {
        if (especie.equals("leon")) {
            System.out.println("El león es un animal carnivoro. Posee afiladas garras para" +
                    " atrapar a sus presas y fuertes colmillos para devorarlas");
        } else if (especie.equals("aguila")) {
            System.out.println("El águila posee grandes alas que le permiten planear. Puede volar" +
                    " a una gran velocidad, lo cual le permite atrapar peces al caer en picada");
        } else {
            System.out.println("Ese animal no está en nuestra base de datos");
        }
    }

    public void rugir() {
        if (especie.equals("leon")) {
           System.out.println(nombre + " hace groarrr");
        } else {
            System.out.println("Este animal no puede rugir");
        }
    }

    public void comer(Alimento alimento) {
        if (alimento.getEspecie().equals(especie)) {
            peso += alimento.getPeso();
        } else {
            System.out.println("Esta comida no es para " + especie);
        }

    }
}
