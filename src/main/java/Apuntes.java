

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Apuntes {
/*
    Las clases hijas no se pueden crear como el new del padre pero alreves si
    NO --> hijo h = new padre();
    SI --> padre p = new hijo(); pero no puede acceder a los metodos del hijo
    
    this --> propia clase
    super --> clase padre
    
    en una lista de objetos padre se pueden meter objetos hijos
    */
    private static void VariablesYConstantes() {
        //Declaracion de variables
        int var1, var2;
        double estaturaPersona;
        //Inicialisación de variables
        var1 = 12;
        var2 = 14;
        //Se puede declarar e inicializar a la vez
        int var3 = 9;
        //Declaracion e inicializacion numeros mu largos
        float pesoPersona = 67.6f;
        long millonesQueMeVaisAPagar = 23_000_000_000l;
        //Constantes, Al ser constante no puede cambiar su valor
        final boolean SIEMPRE_SI = true;
        final double SUPLEMENTO = 123.45;
    }

    private static void ClaseScanner() {
        //import java.util.Scanner;
        Scanner teclado = new Scanner(System.in);
        //Para pedir un dato int
        int numero = teclado.nextInt();
        //Para pedir un dato int
        String nombre = teclado.nextLine();

        //Con scanner, despues de leer numeros hay que limpiar la variable
        //se limpia asi 
        teclado.nextLine();

        //Para leer por teclado usamos 
        //la clase Scanner
        //Declaracion de un objeto scanner y otro string
        Scanner entradateclado;
        String miNombre;

        //Construye el objeto Scanner con su constructor
        //pasando como parámetro el flujo de entreda estandar
        //Entrada estandar es System.in
        //todos los constructores necesitan palabra reservada
        //new para poder reservar memoria
        entradateclado = new Scanner(System.in);

        //se guarda en la variable miNombre el 
        //resultado de introducir caracteres por teclado 
        //Hasta que se pulsa enter
        System.out.println("Introduce tu nombre: ");
        miNombre = entradateclado.nextLine();
        System.out.println("Has puesto: " + miNombre);

        //Como voy a leer un string despues de leer un numero 
        //limpiamos la variable entradateclado (el bufer)
        //entradaTeclado.nextline();
    }

    private static void ClaseJOption() {
        //import javax.swing.JOptionPane;
        //Con JOption no se crea nada, solo se importa

        //Para mostrar mensaje e introducir valor a la vez:
        String nombre = JOptionPane.showInputDialog("Introduce tu apellido: ");
        //Para solo mostrar texto o variables
        JOptionPane.showMessageDialog(null, "Texto " + nombre);

    }

    private static void ClaseRandom() {
        //import java.util.Random;
        Random aleatorio = new Random();
        //para poner un rango especifico de numeros se usa esta formula
        //aleatorio.nextInt(finalRango - inicioRango + 1) + inicioRango;
        int finalRango = 60;
        int inicioRango = 23;
        int result = aleatorio.nextInt(finalRango - inicioRango + 1) + inicioRango;
    }

    private static void Redondeo() {
        double expresion;
        //Math,ceil, floor, round
        expresion = Math.ceil(3.4); //ceil redondea hacia arriba
        System.out.println(expresion);
        expresion = Math.floor(4.9); //floor redondea hacia abajo
        System.out.println(expresion);
        expresion = Math.round(4.2); //round redondea al más cercano
        System.out.println(expresion);
        expresion = Math.round(4.8);
        System.out.println(expresion);
        expresion = Math.round(4.5);
        System.out.println(expresion);
    }

    private static void CondicionalIf() {
        if (1 == 2) {
            //Entra cuando 1 sea igual a 2
        } else if (1 == 3) {
            //entra cauando 1 sea igual a 3
        } else {
            //entra cuando no se ha entrado en ninguno de los anteriores
        }
    }

    private static void CondicionalSwitch() {
        int opcion = 1;
        switch (opcion) {
            case 1:
                System.out.println("Ha seleccionado calcular el área de un cuadrado...");
                break;
            case 2:
                System.out.println("Ha seleccionado calcular el área de un triángulo...");
                break;
            case 3:
                System.out.println("Ha seleccionado calcular el área de un círculo...");
                break;
            //si no se pone break en los case cuando entre en uno ejecutara
            //todos los demas por que tenga por debajo 
        }
    }

    private static void arrays(){
        char[] letras; 
        letras = new char[10];
        
        int[] num = new int[5];
        num[0] = 7;
        num[1] = 3;
        num[1] = num[0]+num[1];
        System.out.println(num[2]);
        //cuando intentas acceder a una posicion del array que no existe
        //Salta la exepción ArrayIndexOutOfBonds
    }
    //por hacer
    private static void BuclesWhile() {

    }

    private static void BuclesFor() {
        int factorial = 1;
//Inicializacion;Condicion del bucle;Aumento de la variable
        //Este for se repetira 5 veces
        for (int i = 1; i <= 5; i++) {
            factorial = factorial * i;
        }
        System.out.println("El factorial de 5 es " + factorial);
    }

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
    
    private static void Clases(){
        //Partes de una clase
        //Definicion:
            //public class NombreClase{ ...  }
            
        //Atributos, campos, propiedades
            //public String nombre;
        //Encapsulamiento(atributo private)
            //private int atributo1; 
        
        //Metodos: Constructores, Getters y Setters, 
        //Constructores sobrecargados igual nombre distintos parametros 
        
        //toString 
            //en un sout al poner solo el nombre del objeto, si existe el metodo 
            //toString sacara por pantalla como si fuera el metodo el 
        
        //Utilidad de public y private en los atributos de una clase
        
        //Static / de clase
            //no requiere crear objetos
            //Usamos el nombre de la clase seguido de punto para usar el metodo
            
        //No static / de instancia
            //Si requiere crear objetos
            
        
    }

    private static void Math(){
        //Devuelve el numero absoluto, osea un negativo pasa a positivo
        Math.abs(-5);
        
    }
    public static void main(String[] args) {

    }

}
