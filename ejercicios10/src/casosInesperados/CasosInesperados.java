package casosInesperados;

import casosInesperados.exceptionsPersona.*;

import java.util.*;

public class CasosInesperados {
    public static void main(String[] args) throws PersonaException, IllegalArgumentException {
        Map<Integer,Persona> registroDePersonas = new HashMap<>();
        List<Integer> numerosPositivos = new ArrayList<>();
        numerosPositivos.add(2);
        numerosPositivos.add(0);
        numerosPositivos.add(8);
        numerosPositivos.add(0);
        try {
            System.out.println(dameMayorADiez(numerosPositivos));
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

        Persona p = crearPersona("Nicolas", 20, 43441883);
        System.out.println(p.nombre + " - " + p.edad + " - " + p.dni);

        try {
            Persona p2 = crearPersona("", 44, 23912353);
            System.out.println(p2.nombre + " - " + p2.edad + " - " + p2.dni);
        } catch (PersonaException j) {
            System.out.println(j.getMessage());
        }
        try {
            Persona p3 = (Persona) crearPersona2("Pablo", -1, 32453245);
            System.out.println(p3.nombre + " - " + p3.edad + " - " + p3.dni);
        } catch (IllegalArgumentException i) {
            System.out.println(i.getMessage());
        }
        //Creamos las personas y se agregan a nuestro registro por unica vez.
        crearPersona3("Nicolas",20,43441883,registroDePersonas);
        crearPersona3("Pablo",52,20463267,registroDePersonas);
        System.out.println(registroDePersonas);
        crearPersona3("Leonel",20,43441883,registroDePersonas); //Excepcion

        //La persona debe ser mayor de edad para que podamos crearla.
        crearPersona3("Aldana",17,48765432,registroDePersonas); //Excepcion
    }

    public static int dameMayorADiez(List<Integer> listaDeNumeros) throws RuntimeException {
        for (int numero : listaDeNumeros) {
            if (numero > 10) {
                return numero;
            }
        }
        throw new RuntimeException("EXCEPCION: RunTimeException. No hay ningun numero mayor a 10 en la lista");
    }

    //Funcion crearPersonas con excepciones propias
    public static Persona crearPersona(String nombre, int edad, int dni) throws PersonaException {
        if (nombre == null || nombre.equals("")) {
            throw new SinNombreException();
        }
        if (edad < 0) {
            throw new EdadNegativaException();
        }
        if (dni <= 0) {
            throw new DniNoValidoException();
        }
        return new Persona(nombre, edad, dni);
    }


    //Funcion crearPersonas con IllegalArgumentException
    public static Persona crearPersona2(String nombre, int edad, int dni) throws IllegalArgumentException {
        if (nombre == null || nombre.equals("") || edad < 0 || dni <= 0) {
            throw new IllegalArgumentException("EXCEPCION: IllegalArgumentException. Argumentos de la persona no validos");
        }
        return new Persona(nombre,edad,dni);
    }

    //Funcion crearPersonas con excepciones del ejercicio + propias
    public static Persona crearPersona3(String nombre, int edad, int dni, Map<Integer, Persona> registroDePersonas) throws IllegalArgumentException, PersonaException {
        if (nombre == null || nombre.equals("")) {
            throw new SinNombreException();
        }
        if (edad < 0) {
            throw new EdadNegativaException();
        }
        if (dni <= 0) {
            throw new DniNoValidoException();
        }
        Persona persona = new Persona(nombre, edad, dni);

        if(registroDePersonas.containsKey(persona.dni))
            throw new PersonaYaExisteException("EXCEPCION: PersonaYaExisteException. La persona ya existe, no se puede agregar a la lista. Persona que se intenta ingresar: " + persona.nombre + " " + persona.dni);
        else if(persona.edad < 18) {
            throw new PersonaMenorException("EXCEPCION: PersonaMenorException. La persona es menor de edad. La edad debe ser de 18 o superior. Edad de la persona que intenta ingresar es: " + persona.edad);
        } else {
            registroDePersonas.put(dni,persona);
        }
        return persona;
    }
}