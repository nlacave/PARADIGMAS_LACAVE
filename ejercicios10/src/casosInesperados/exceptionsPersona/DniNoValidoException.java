package casosInesperados.exceptionsPersona;

public class DniNoValidoException extends PersonaException {
    public DniNoValidoException() {
        super("EXCEPCION: DniNoValidoException. El dni de la persona es invalido. Debe ser mayor a 0");
    }
}
