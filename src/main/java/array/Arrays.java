package array;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Arrays {

//Leer valores por teclado y almacenarlos en el array. Se le pasará el array como 
//    parámetro y no devolverá nada.
    private static void PedirNumeros(int[] array) {
        Scanner teclado = new Scanner(System.in);
        boolean repetir = false;

        for (int i = 0; i < array.length; i++) {
            do {
                repetir = true;
                try {
                    System.out.println("Introduce el numero entero que va en la pocisión " + i);
                    array[i] = teclado.nextInt();
                    //El bucle para cuando se introduzca el valor bien
                    repetir = false;
                } catch (InputMismatchException ime) {
                    System.out.println("No introduzcas texto, solo numeros enteros");
                    //Se limpia la variable por que se ha introducido string
                    teclado.nextLine();
                }
            } while (repetir);
        }
    }
//Contar positivos, se le pasará el array como parámetro y devolverá el número de 
//    positivos almacenados en el array. 

    private static int contarPositivos(int[] array) {
        int contador = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                contador++;
            }
        }
        return contador;
    }
//Contar negativos, se le pasará el array como parámetro y devolverá el número de 
//    negativos almacenados en el array. 

    private static int contarNegativos(int[] array) {
        int contador = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                contador++;
            }
        }
        return contador;
    }
//Contar ceros, se le pasará el array como parámetro y devolverá el número de 
//    ceros almacenados en el array. 

    private static int contarDeCeros(int[] array) {
        int contador = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                contador++;
            }
        }
        return contador;
    }
//Mostrar array, se le pasará el array como parámetro y no devolverá nada, sólo 
//    imprimirá por pantalla el array.

    private static void mostrarArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Posición " + i + " del array: " + array[i]);
        }
    }
//Calcular media positivos, se le pasará el array como parámetro y no devolverá 
//    nada, sólo imprimirá por pantalla la media aritmética de los positivos.

    private static void calcularMediaPositivos(int[] array) {
        int suma = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                suma = suma + array[i];
            }
        }
        int media = suma / contarPositivos(array);
    }
//Calcular media negativos, se le pasará el array como parámetro y no devolverá 
//    nada, sólo imprimirá por pantalla la media aritmética de los negativos.

    private static void calcularMediaNegativos(int[] array) {
        int suma = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                suma = suma + array[i];
            }
        }
        int media = suma / contarPositivos(array);
    }
    
    public static void inicializarArraysConNumerosRandom(int [] array)
    {
        Random aleatorio = new Random(); 
        for (int i = 0; i < array.length; i++) {
            array[i] = aleatorio.nextInt(100) + 1;;
        }
    }
    
    public static int[] multiplicar(int [] array1, int [] array2){
        int [] arrayMultiplicado = new int[array1.length];
        for (int i = 0; i < array1.length; i++) {
            arrayMultiplicado[i] = array1[i] * array2[i];
        }
        return arrayMultiplicado;
    }
}
