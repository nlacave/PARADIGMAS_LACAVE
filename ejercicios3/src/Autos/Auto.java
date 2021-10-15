package Autos;

public class Auto {

    public String marca;
    public String modelo;
    public int anio;


    // Utilizando package no podemos crear un objeto Auto desde el main.

    public Auto(String marca, String modelo, Integer anio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    }

}