package error;

public class Error {
    public static void main(String[] args) {
        crearArray(5);
    }

    public static void crearArray(int tamanio) {
        int tamanioArray = 0;
        try {
        while (tamanio >= 0) {
                int[] array = new int[tamanio * 10000000];
                tamanio++;
                tamanioArray = array.length;
            }
        } catch (OutOfMemoryError e) {
            System.out.println("Ultimo tamaño exitoso: " + tamanioArray);
        }
    }
}
