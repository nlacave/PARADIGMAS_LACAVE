
public class UsuarioFacebook {
    public String getNombreDeUsuario() {
        return nombreDeUsuario;
    }

    public void setNombreDeUsuario(String nombreDeUsuario) {
        this.nombreDeUsuario = nombreDeUsuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    private String nombreDeUsuario = "Marcos";
    private String contrasenia = "123";

    public void iniciarSesion(String contrasenia) {
        if (contrasenia.equals(this.contrasenia)) {
            System.out.println("Contraseña correcta");
        } else {
            System.out.println("Contraseña incorrecta");
        }
    }
}