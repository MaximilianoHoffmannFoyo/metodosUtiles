package tryCatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TriCatchBasicos {

    private static void TryCatch() {
        Scanner teclado = new Scanner(System.in);
//--------Para controlar que no se metan letras en un int:
        //import java.util.InputMismatchException;
        int num1 = 0;
        boolean parar = true;
        try {
            System.out.println("Introduce un numero entero");
            num1 = teclado.nextInt();
            //Esto es para que si esta en un bucle pare cuando se 
            //introduzca el valor bien
            parar = false;
        } catch (InputMismatchException ime) {
            System.out.println("No introduzcas texto, solo numeros enteros");
            //Se limpi la variable por que se introdujo string
            teclado.nextLine();
        }
//---------------------------------------------------------------------------------------------------        
//--------Para controlar que no de error dividir por 0:
        int i = 1, j = 0;
        try {
            i = i / j;
        } catch (ArithmeticException e) {
            System.out.println("Ocurrió un error: " + e);
        }
        System.out.println("El valor de i es: " + i);
//---------------------------------------------------------------------------------------------------        
//--------Para controlar que no de error al pasar un String a cualquier 
        //tipo de dato numérico, pero el String no tiene el formato apropiado
        try {
            String cadena = "123K";
            cadena = cadena.trim();
            int a = Integer.parseInt(cadena); // provoca excepción
            System.out.println(cadena);
        } catch (NumberFormatException e) {
            System.out.println(
                    "La cadena de texto no tiene formato adecuado" + e);
        }

    }

}
