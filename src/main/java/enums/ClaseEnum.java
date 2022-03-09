package enums;
//Consturctor privado
//no hay setters
//atributos final pero sin mayusculas
//se definen los objetos al principio de la clase y nombrados con mayusculas
//se puede usar un switch para los enum
//metodo values
public enum ClaseEnum {

    BARBACOA(22, "Barbacoa Cream", new String[]{"carne", "bacon", "queso", "BBQ"}, 13.0),
    CARBONARA(8, "Carbonara", new String[]{"nata", "bacon", "queso"}, 3.0),
    JAMONYQUESO(30, "Jamon y queso", new String[]{"jamon", "queso"}, 20.0);

    private final int tamanio;
    private final String nombre;
    private final String[] ingredientes;
    private final double precio;

    private ClaseEnum(int tamanio, String nombre, String[] ingredientes, double precio) {
        this.tamanio = tamanio;
        this.nombre = nombre;
        this.ingredientes = ingredientes;
        this.precio = precio;
    }

    public int getTamanio() {
        return tamanio;
    }

    public String getNombre() {
        return nombre;
    }

    public String[] getIngredientes() {
        return ingredientes;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return "ApuntesEnum{" + "tamanio=" + tamanio + ", nombre=" + nombre + ", ingredientes=" + ingredientes + ", precio=" + precio + '}';
    }
}
