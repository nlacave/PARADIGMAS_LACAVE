public class UsuarioAfip {
    private String nombre;
    private int dni;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public boolean isHombre() {
        return hombre;
    }

    public void setHombre(boolean hombre) {
        this.hombre = hombre;
    }

    public boolean isMujer() {
        return mujer;
    }

    public void setMujer(boolean mujer) {
        this.mujer = mujer;
    }

    private String cargo;
    private boolean hombre;
    private boolean mujer;

    public void monotributista(String respuesta) {
        if (respuesta.equals("si")) {
            System.out.println(nombre + " no posee vacaciones pagas");
        } else if (respuesta.equals("no")) {
            System.out.println(nombre + " trabaja en relación de dependencia. Por ley posee" +
                    " al menos una semana de vacaciones pagas");
        } else {
            System.out.println("Por favor ingresa un valor correcto: si / no");
        }
    }

    public void verCuit(int dni) {
        this.dni = dni;
        if (hombre && !mujer) {
            System.out.println("El cuit de " + nombre + " es " + "20" + dni + "7");
        } else if (mujer && !hombre) {
            System.out.println("El cuit de " + nombre + " es " + "27" + dni + "9");
        } else {
            System.out.println("El sexo de la persona no está especificado. El cuit asignado es " + "23" + dni + "7/9");
        }
    }
}
