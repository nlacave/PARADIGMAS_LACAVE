package Autos;

/* Crear una clase Auto en un paquete autos con atributos marca, modelo, año y que se construya con esos tres atributos.

Luego cambiar el constructor, hacerlo de acceso de paquete. Verificar que no se pueda construir desde el main.

Crear una clase FabricaDeAuto en el mismo paquete que se construya con una marca. Debe tener:

•	Un atributo estático año para guardar el año en el que estamos (igual para todas las fábricas)
•	Un método fabricarAuto(modelo) que crea un auto de esa marca, modelo en el año actual.
Si el año no está seteado, debe imprimir un mensaje de error y devolver null
 */

public class FabricaDeAuto {
    public String marca;
    public static int anioActual = 0;

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
