import AulasVirtuales.Alumno;
import AulasVirtuales.Docente;
import AulasVirtuales.Materia;
import AulasVirtuales.Persona;
import Vehiculos.Auto;
import Vehiculos.Moto;

public class Main {
    public static void main(String[] args) {
        Alumno[] alumnos = new Alumno[3];

        alumnos[0] = new Alumno();
        alumnos[1] = new Alumno();
        alumnos[2] = new Alumno();
        alumnos[0].setNombre("Esteban Lacave");
        alumnos[1].setNombre("Nicolás Lacave");
        alumnos[2].setNombre("Nancy Mingrino");
        alumnos[0].setPromedio(9);
        alumnos[1].setPromedio(9);
        alumnos[2].setPromedio(7);

        Docente docente = new Docente();

        docente.setNombre("Pablo Lacave");
        docente.setEspecialidad("Ingles");

        Materia materia = new Materia();

        materia.listaDeAlummnos = alumnos;
        materia.docente = docente;

        Persona.describir(materia);

        Auto honda = new Auto();

        honda.nombre = "Fit";
        honda.cantDePuertas = 4;
        honda.ruedas = 4;
        honda.velocidad = 80;
        honda.kilometraje = 50000;
        honda.acelerar(40);
        honda.airbag = true;
        honda.aireAutomatico(2);
        System.out.println("Vehiculos.Auto.Auto frenado: " + honda.frenado());
        honda.desacelerar(120);
        System.out.println("Vehiculos.Auto.Auto frenado: " + honda.frenado());

        Moto yamaha = new Moto();

        yamaha.nombre = "R6 Race";
        yamaha.setCilindrada(599);
        yamaha.velocidad = 200;
        yamaha.setNeumaticoSport(true);
        yamaha.ruedas = 2;
        yamaha.acelerar(70);

    }
}
