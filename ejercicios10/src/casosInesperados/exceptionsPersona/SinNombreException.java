package casosInesperados.exceptionsPersona;

public class SinNombreException extends PersonaException{
    public SinNombreException() {
        super("EXCEPCION: SinNombreException. La persona no tiene nombre");
    }
}
