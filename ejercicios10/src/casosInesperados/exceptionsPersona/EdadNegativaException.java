package casosInesperados.exceptionsPersona;

public class EdadNegativaException extends PersonaException {
    public EdadNegativaException() {
        super("EXCEPCION: EdadNegativaException. La persona no puede tener una edad negativa");
    }
}
