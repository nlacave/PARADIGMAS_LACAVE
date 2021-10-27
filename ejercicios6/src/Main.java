import animales.*;
import procesos.*;
import sorting.*;
import vehiculos.Auto;
import vehiculos.Helicoptero;
import vehiculos.Vehiculo;
import vehiculos.Lancha;
import vehiculos.Avion;
import vehiculos.Volador;

import java.util.*;

public class Main {


    public static void main(String[] args) {
        Auto auto = new Auto();
        Avion avion = new Avion();
        Lancha lancha = new Lancha();
        Helicoptero helicoptero = new Helicoptero();

        Vehiculo[] vehiculos = new Vehiculo[4];
        vehiculos[0] = auto;
        vehiculos[1] = avion;
        vehiculos[2] = lancha;
        vehiculos[3] = helicoptero;

        Volador volador = (Volador) vehiculos[1];
        volador.volar();

        System.out.println("Vehiculo 0: " + Vehiculo.esVolador(vehiculos[0]));
        System.out.println("Vehiculo 1: " + Vehiculo.esVolador(vehiculos[1]));
        System.out.println("Vehiculo 2: " + Vehiculo.esVolador(vehiculos[2]));
        System.out.println("Vehiculo 3: " + Vehiculo.esVolador(vehiculos[3]));

        Volador[] voladores = new Volador[vehiculos.length];
        for (int i = 0; i < vehiculos.length; i++) {
            if (vehiculos[i] instanceof Volador) {
                voladores[i] = (Volador) vehiculos[i];
                voladores[i].volar();
            }
        }
        Vehiculo.hacerVolar(vehiculos[0]);
        Vehiculo.hacerVolar(vehiculos[1]);

        Animal leon = new Leon("Simba");
        Animal tiburon = new Tiburon("Sammy");
        Animal aguila = new Aguila("Jack");
        Animal tiburon2 = new Tiburon("Snake");
        ArrayList<Animal> listaDeAnimales = new ArrayList<>();
        listaDeAnimales.add(leon);
        listaDeAnimales.add(tiburon);
        listaDeAnimales.add(aguila);
        listaDeAnimales.add(tiburon2);
        List<Acuatico> listaAcuaticos = Animal.dameAcuaticos(listaDeAnimales);

        //Recorremos la lista de animales acuaticos para ver que animales se encuentran dentro
        for (int i = 0; i < listaAcuaticos.size(); i++) {
            if (listaAcuaticos.get(i) instanceof Animal)
                System.out.println((((Animal) listaAcuaticos.get(i)).getNombre()));
        }

        Animal.showDeAnimales(listaDeAnimales);

        System.out.println();

        Tarea1 miTarea1 = new Tarea1("Edicion");
        miTarea1.ejecutar();

        Tarea1 miTarea1_2 = new Tarea1("Efectos Graficos");
        miTarea1_2.ejecutar();

        System.out.println();

        List<Tarea> listaDeTareas = new ArrayList<>();
        listaDeTareas.add(miTarea1);
        listaDeTareas.add(miTarea1_2);

        Tarea2 miTarea2 = new Tarea2("Numeracion de Tareas", listaDeTareas);
        miTarea2.ejecutar();

        System.out.println();
        Tarea3 miTarea3 = new Tarea3("Variables globales");
        System.out.println(miTarea3.getNombre());
        miTarea3.ejecutar();
        System.out.println(miTarea3.getNombre());
        System.out.println();

        Tarea4 miTarea4 = new Tarea4("Variable con ID", listaDeTareas, 3);
        miTarea4.ejecutar();

        System.out.println();
        List<Tarea> nuevaListaDeTareas = new ArrayList<>();
        nuevaListaDeTareas.add(miTarea1);
        nuevaListaDeTareas.add(miTarea2);
        nuevaListaDeTareas.add(miTarea1_2);
        nuevaListaDeTareas.add(miTarea3);
        nuevaListaDeTareas.add(miTarea4);

        Proceso.procesarBatch(nuevaListaDeTareas);

        System.out.println("Sin ordenar");
        int[] listaDeEnteros = {4, 10, 49, 5, 13, 8};
        for (int listaDeEntero : listaDeEnteros) {
            System.out.print(listaDeEntero + " ");
        }

        System.out.println();
        System.out.println("Ordenado");
        BubbleSort.ordenar(listaDeEnteros);
        for (int listaDeEntero : listaDeEnteros) {
            System.out.print(listaDeEntero + " ");
        }
        System.out.println();
        System.out.println("Bubble sort clase Par");
        Par p1 = new Par(5,3);
        Par p2 = new Par(4,2);
        Par p3 = new Par(4,5);
        List<Ordenable> listaDeObjetos = new LinkedList<>();
        listaDeObjetos.add(p1);
        listaDeObjetos.add(p2);
        listaDeObjetos.add(p3);
        BubbleSort.ordenarObjetos(listaDeObjetos);
        System.out.println(listaDeObjetos);

        System.out.println("Bubble sort clase Suma");
        Suma s1 = new Suma(5,3);
        Suma s2 = new Suma(4,2);
        Suma s3 = new Suma(4,5);

        List<Ordenable> listaDeObjetos2 = new LinkedList<>();
        listaDeObjetos2.add(s1);
        listaDeObjetos2.add(s2);
        listaDeObjetos2.add(s3);
        BubbleSort.ordenarObjetos(listaDeObjetos2);

        System.out.println(listaDeObjetos2);

        Persona lucas = new Persona(34524531,false);
        Persona nicolas = new Persona(43441883,false); //FALSE EQUIVALE A SEXO HOMBRE
        Persona nancy = new Persona(43441883,true); //TRUE EQUIVALE A SEXO MUJER
        List<Ordenable> listaDeObjetos3 = new LinkedList<>();
        listaDeObjetos3.add(lucas);
        listaDeObjetos3.add(nicolas);
        listaDeObjetos3.add(nancy);
        BubbleSort.ordenarObjetos(listaDeObjetos3);
        //Ordena primero por los dni mas grandes (personas mas chicas de edad) o por el sexo.
        System.out.println(listaDeObjetos3);
    }
}