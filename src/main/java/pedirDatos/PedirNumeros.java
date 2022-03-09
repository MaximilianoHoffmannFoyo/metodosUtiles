package pedirDatos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PedirNumeros {

    public static void pedirNumeroEnteroPositivoOCero() {
        Scanner teclado = new Scanner(System.in);
        boolean repetir = false;
        int numeroPersonas = 0;

        System.out.println("Introduce el número:");
        do {
            repetir = true;
            try {
                numeroPersonas = teclado.nextInt();
                repetir = false;//El bucle para cuando se introduzca el valor bien
            } catch (InputMismatchException ime) {
                System.out.println("No introduzcas texto, solo numeros enteros positivos:");
                teclado.nextLine();//Se limpia la variable por que se ha introducido string
            }

            if (numeroPersonas < 0) {
                repetir = true;
                System.out.println("Introduce un número valido:");
            }
        } while (repetir);
    }
}
