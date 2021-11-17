package runtimeExceptions;
public class RunTimeException {
    public static void main(String[] args) {
        Persona p = null;
        //Persona.mostrarNombre(p); NullPointerExceptionException
        Persona.verificarPersona(p);
        System.out.println();
        p = new Persona("Esteban");
        Persona.verificarPersona(p);
        System.out.println();
        p = new Persona("");
        Persona.verificarPersona(p);
        Persona p0 = new Persona("Pablo");
        Persona p1 = new Persona("Nicolas");
        Persona p2 = new Persona("Vanessa");
        Persona p3 = new Persona("Jose");
        Persona p4 = new Persona("");

        Persona[] personas = new Persona[5];
        personas[0] = p0;
        personas[1] = p1;
        personas[2] = p2;
        personas[3] = p3;
        personas[4] = p4;

        System.out.println();
        // Persona.mostrarNombre(personas,5); IndexOutOfBoundsException
        Persona.mostrarNombre(personas, 1);
        Persona.verificarPersonaEnArreglo(personas,3);
        Persona.verificarPersonaEnArreglo(personas,6);
        Persona.verificarPersonaEnArreglo(personas,4);
    }
}

