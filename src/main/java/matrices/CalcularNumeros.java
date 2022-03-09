
package matrices;

public class CalcularNumeros {
    
    public static int calcularMedia(int[][] c){
        int suma = 0;
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[i].length; j++) {
                suma += c[i][j];
            }
        }
        return suma/100;
    }
    public static int calcularMinimo(int[][] c){
        int menor = 100;
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[i].length; j++) {
                menor = Math.min(menor, c[i][j]);
            }
        }
        return menor;
    }
    public static int calcularMaximo(int[][] c){
        int mayor = 0;
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[i].length; j++) {
                mayor = Math.max(mayor, c[i][j]);
            }
        }
        return mayor;
    }
}
