package casosInesperados.exceptionsPersona;

public class PersonaYaExisteException extends PersonaException{
    public PersonaYaExisteException(String mensaje) {
        super(mensaje);
    }
}
