package palabras;

public class MainPalabras {


    public static void main(String[] args) {
        String oracion = "Comer Jugar Dormir Jugar";
        System.out.println("Metodo split sin ordenar");
        System.out.println(Palabras.split(oracion));

        System.out.println("\nMetodo split ordenado alfabeticamente");
        System.out.println(Palabras.splitOrdenado(oracion));

        System.out.println("\nMetodo split con contador");
        System.out.println(Palabras.splitContador(oracion));
    }
}
