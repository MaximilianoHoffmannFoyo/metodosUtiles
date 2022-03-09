
package arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ListaReproduccion {
    
    private ArrayList<Cancion> lista;
    
/*constructor predeterminado (creará e inicializará la lista).*/
    public ListaReproduccion() {
        this.lista = new ArrayList<>();
    }
/*numeroCanciones(): devuelve el número de canciones de la lista.*/
    public int numeroCanciones(){
        return this.lista.size();
    }
/*estaVacia(): devuelve si la lista de reproducción está vacía.*/
    public boolean estaVacia(){
        return this.lista.isEmpty();
    }
/*escucharCancion(int): devuelve la Cancion que se encuentra en la posición indicada.*/
    public Cancion escucharCancion(int posicion){
        return this.lista.get(posicion);
    }
/*cambiarCancion(int, Cancion): cambia la Cancion de la posición indicada 
    por la nueva Cancion proporcionada.*/
    public void cambiarCancion(int posicion, Cancion cancion){
        this.lista.add(posicion, cancion);
    }
/*grabarCancion(Cancion): agrega al final de la lista la Cancion proporcionada.*/
    public void grabarCancion(Cancion cancion){
        if(cancion != null){
            this.lista.add(cancion);
        }
    }
/*eliminaCancion(int): elimina la Cancion que se encuentra en la posición indicada.*/
    public void eliminaCancion(int posicion){
        this.lista.remove(posicion);
    }
/*eliminaCancion(Cancion c), elimina el objeto c si se encuentra en la lista de 
    reproducción. Usa el método remove(Cancion)*/
    public void eliminaCancion(Cancion c){
        this.lista.remove(c);
    }
/*imprimirLista (ListaReproduccion tmp). Método de clase que imprime los nombres
    de las canciones contenidas en tmp.*/
    public static void imprimirLista(ListaReproduccion tmp){
        for (int i = 0; i < tmp.numeroCanciones(); i++) {
            System.out.println(tmp.lista.get(i).getNombre());
        }        
    }
/*buscarCancion(Cancion c), busca la canción c en la lista de reproducción y 
    devuelve la posición en la que se encuentra. Usa el método indexOf.*/
    public int buscarCancion(Cancion c){
        return this.lista.indexOf(c);
    }
/*Incluye un par de método de ordenación (por ejemplo, por título y por cantante) 
    usando el método Collections.sort(lista, criterioComparator)*/
    
    public void ordenarComparatorNombre(){
        Collections.sort(lista, (Cancion c1,Cancion c2)->c1.getNombre().compareTo(c2.getNombre()));
    }
    public void ordenarComparatorAutor(){
        Collections.sort(lista, (Cancion c1,Cancion c2)->c1.getAutor().compareTo(c2.getAutor()));
    }
    
/*Añade también métodos para buscar, usando Collections.binarySearch
    (lista, objeto, criterioComparator)*/
    
    public int buscarNombre(Cancion c){
        return Collections.binarySearch(lista, c, (Cancion c1,Cancion c2)->c1.getNombre().compareTo(c2.getNombre()));
    }
    public int buscarAutor(Cancion c){
        return Collections.binarySearch(lista, c, (Cancion c1,Cancion c2)->c1.getAutor().compareTo(c2.getAutor()));
    }
    
}
