public abstract class Animal {
    protected String nombre;
    protected String especie;

    public Animal(String nombre, String especie) {
        this.especie = especie;
        this.nombre = nombre;
    }


    abstract public void hacerRuido();

    public void describir() {
        System.out.println("Este animal es de la especie " + especie + " y se llama " + nombre);
    }

    public static void escucharTodos(Animal[] animales) {
        for (int i = 0; i < animales.length; i++) {
            animales[i].hacerRuido();
        }
    }

}
