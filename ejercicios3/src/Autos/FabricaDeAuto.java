package Autos;

public class FabricaDeAuto {
    public String marca;
    public static int anioActual = 2021;

    public FabricaDeAuto(String marca) {
        this.marca = marca;
    }

    public Auto fabricarAuto(String modelo) {
        if(anioActual == 0) {
            System.out.println("Error. El anio no esta seteado");
            return null;
        } else {
            return new Auto(marca,modelo,anioActual);
        }
    }
}
