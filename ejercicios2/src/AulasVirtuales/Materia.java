package AulasVirtuales;

public class Materia {
    public Docente docente;
    public Alumno[] listaDeAlummnos;

    public Persona[] personas() {
        Persona[] personas = new Persona[listaDeAlummnos.length + 1];
        for (int i = 0; i < listaDeAlummnos.length; i++) {
            personas[i] = listaDeAlummnos[i];
        }
        personas[personas.length - 1] = docente;
        return personas;
    }
}
