
package arrayList;

public class Main {

    public static void main(String[] args) {
        
        ListaReproduccion album = new ListaReproduccion();
        
        Cancion mar = new Cancion("Sin tu piel", "Nil Molinier", 3.41);
        Cancion tierra = new Cancion("Mi religión", "Nix Molinier", 3.22);
        Cancion aire = new Cancion("Soldadito de hierro", "Nia Molinier", 2.24);
        
        
        
        System.out.println("Numero de canciones: "+album.numeroCanciones());
        
        String resultado = "";
        if(album.estaVacia()){
            resultado = "Si";
        }else{
            resultado = "No";
        }
        System.out.println("¿Esta vacia? "+resultado);
        
        album.grabarCancion(aire);
        album.grabarCancion(mar);
        album.grabarCancion(tierra);
        
//        ListaReproduccion.imprimirLista(album);
//        
//        System.out.println("Numero de canciones: "+album.numeroCanciones());
//        
//        System.out.println("Esta escuchando: "+album.escucharCancion(0));
//        
//        album.cambiarCancion(0, tierra);
//        
//        System.out.println("Esta escuchando: "+album.escucharCancion(0));
//        
//        ListaReproduccion.imprimirLista(album);
//        
//       System.out.println(album.buscarCancion(tierra));
//        album.eliminaCancion(mar);
//        System.out.println("Numero de canciones: "+album.numeroCanciones());
//        album.eliminaCancion(0);
//        System.out.println("Numero de canciones: "+album.numeroCanciones());
        
        ListaReproduccion.imprimirLista(album);
        
        System.out.println("----------------");
        album.ordenarComparatorNombre();
        System.out.println(album.buscarNombre(aire));
        ListaReproduccion.imprimirLista(album);
        
        System.out.println("----------------");
        album.ordenarComparatorAutor();
        System.out.println(album.buscarAutor(aire));
        ListaReproduccion.imprimirLista(album);
        
    }
    
}
