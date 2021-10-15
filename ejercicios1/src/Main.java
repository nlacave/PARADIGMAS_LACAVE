import Veterinario.Alimento;
import Veterinario.Animal;

public class Main {

    public static void main(String[] args) {
        Futbolista jugador = new Futbolista();

        jugador.patear("Messi");
        jugador.gol();
        jugador.setNacionalidad("argentino");
        jugador.setNombre("Messi");
        jugador.setEdad(32);
        System.out.println("El jugador " + jugador.getNacionalidad() + " " + jugador.getNombre() + " de " + jugador.getEdad() + " años" + " metio " + jugador.getGoles() + " goles");
        jugador.gol();
        System.out.println(jugador.getGoles());


        UsuarioFacebook usuario = new UsuarioFacebook();
        usuario.setNombreDeUsuario("Esteban");
        usuario.setContrasenia("1234");
        System.out.println(usuario.getNombreDeUsuario());
        String valorDeInicio = usuario.iniciarSesion("8767");
        System.out.println(valorDeInicio);


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
        simba.edad = 3;
        simba.nombre = "Simba";
        simba.especie = "leon";
        simba.peso = 5;

        simba.comer(alimentoLeon);
        System.out.println(simba.peso);
        simba.comer(alimentoLeon);
        System.out.println(simba.peso);

        simba.describir();
        simba.rugir();

        Animal tomi = new Animal();
        tomi.edad = 5;
        tomi.nombre = "Sammy";
        tomi.especie = "tortuga";
        tomi.peso = 1;

        tomi.comer(alimentoLeon);
        System.out.println(tomi.peso);

        tomi.describir();
        tomi.rugir();

    }
}
