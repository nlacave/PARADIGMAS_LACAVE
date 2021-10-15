import Veterinario.Alimento;
import Veterinario.Animal;

public class Main {

    public static void main(String[] args) {
        Futbolista messi = new Futbolista();

        messi.setNombre("Messi");
        messi.patear();
        messi.hacerGol();
        messi.setNacionalidad("argentina");
        messi.setEdad(32);
        System.out.println("El jugador de " + messi.getNacionalidad() + " " + messi.getNombre() + " de " + messi.getEdad() + " años" + " metio " + messi.getGoles() + " goles");
        messi.hacerGol();
        System.out.println("Goles de Messi: " + messi.getGoles());


        UsuarioFacebook usuario = new UsuarioFacebook();
        usuario.setNombreDeUsuario("Esteban");
        usuario.setContrasenia("1234");
        usuario.iniciarSesion("8767");


        UsuarioAfip trabajador = new UsuarioAfip();
        trabajador.setNombre("Leonel");
        trabajador.setHombre(true);
        trabajador.setCargo("Programador");
        trabajador.monotributista("no");
        trabajador.verCuit(43441883);


        Alimento alimentoLeon = new Alimento();
        alimentoLeon.setEspecie("leon");
        alimentoLeon.setPeso(20);

        Animal simba = new Animal();
        simba.setEdad(3);
        simba.setNombre("Simba");
        simba.setEspecie("leon");
        simba.setPeso(5);
        System.out.println("Peso original de simba: " + simba.getPeso());
        simba.comer(alimentoLeon);
        System.out.println("Peso de simba habiendo comido: " + simba.getPeso());
        simba.comer(alimentoLeon);
        System.out.println("Peso de simba habiendo comido por segunda vez: " + simba.getPeso());

        simba.describir();
        simba.rugir();

        Animal tomi = new Animal();
        tomi.setEdad(5);
        tomi.setNombre("Tomi");
        tomi.setEspecie("tortuga");
        tomi.setPeso(1);

        tomi.comer(alimentoLeon);
        System.out.println(tomi.getNombre() + " pesa " + tomi.getPeso() + "kg y es de la especie " + tomi.getEspecie());

        tomi.describir();
        tomi.rugir();

    }
}
