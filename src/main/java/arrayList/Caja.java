
package arrayList;

import java.util.ArrayList;

public class Caja {
    
    private ArrayList<Objeto> lista;

    public Caja(ArrayList<Objeto> caja) {
        this.lista = caja;
    }

    public Caja() {
    }

    public ArrayList<Objeto> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Objeto> lista) {
        this.lista = lista;
    }
    
    public void agregarObjeto(Objeto objeto){
        if(objeto != null){
            this.lista.add(objeto);
        }
    }
    
    public void listarObjetos(){
        System.out.println("Listado de objetos:");
        lista.forEach(System.out::println);
    }
    
    public boolean borrarObjeto(Objeto objeto){
//        if(caja.contains(objeto)){
            return lista.remove(objeto);
//            return true;
//        }
//        return false;
    }
    
    public int getCantidadObjetos(){
        return lista.size();
    }
    
    public Objeto buscarPorCodigo(String codigo){
        Objeto aux = new Objeto("",codigo,"",0,0);
        int indice;
        indice = lista.indexOf(codigo);
        if(indice>=0){
            return lista.get(indice);
        }
        return null;
    }
    
    public ArrayList<Objeto> buscarPorColor(String color){
        ArrayList<Objeto> cajaAux = new ArrayList<>();
        for(Objeto objeto : this.lista){
            if(objeto.getColor().equals(color)){
                cajaAux.add(objeto);
            }
        }
        return cajaAux;
    }

    @Override
    public String toString() {
        return "Caja{" + "caja=" + lista + '}';
    }
    
    
    
    
    
    
    
}
