
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

    public String iniciarSesion(String contrasenia) {
        if (contrasenia.equals(this.contrasenia)) {
            return "Contraseña correcta";
        } else {
            return "Contraseña invalida";
        }
    }
}