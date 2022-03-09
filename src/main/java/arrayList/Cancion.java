
package arrayList;

import java.util.Objects;

public class Cancion implements Comparable<Cancion>{
    
    private String nombre;
    private String autor;
    private double duracion;

    public Cancion(String nombre, String autor, double duracion) {
        this.nombre = nombre;
        this.autor = autor;
        this.duracion = duracion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Cancion{" + "nombre=" + nombre + ", duracion=" + duracion + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.nombre);
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.duracion) ^ (Double.doubleToLongBits(this.duracion) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cancion other = (Cancion) obj;
        if (Double.doubleToLongBits(this.duracion) != Double.doubleToLongBits(other.duracion)) {
            return false;
        }
        return Objects.equals(this.nombre, other.nombre);
    }

    @Override
    public int compareTo(Cancion c) {
        return this.nombre.compareTo(c.nombre);
    }
    
    
}
