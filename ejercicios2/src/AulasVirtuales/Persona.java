package AulasVirtuales;

public class Persona {
    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static void describir(Materia materia) {
        Persona[] listaDePersonas = materia.personas();
        for(int i = 0; i < listaDePersonas.length; i++) {
            System.out.println(listaDePersonas[i].getNombre());
        }
    }
}
