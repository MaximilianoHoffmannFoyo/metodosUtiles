
package matrices;

import java.util.Random;

public class ImprimirYRellenar {
    
    int[][] matriz = new int[5][5];
    char[][] caracter = {{'q', 'w', 'e'}, {'z', 'x', 'y'}};
    
    public static void imprimirMatriz(int[][] c) {
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[i].length; j++) {
                System.out.println(c[i][j]);
            }
        }
    }
    
    public static void rellenarUnaMatrizDeNumerosAleatorios(int[][] m){
        Random aleatorio = new Random();
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = aleatorio.nextInt(100)+1;
            }
        }
    }
    
    public static void rellenarUnaMatrizDeNumerosConsecutivos(int[][] m) {
        int aux = 1;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = aux;
                aux++;
            }
        }
    }
}
