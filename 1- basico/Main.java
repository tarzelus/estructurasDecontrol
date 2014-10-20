/*
 * Programa que lee dos números de tipo double por teclado
 * y muestra su suma, resta y multiplicación.
 */
import java.util.*;
public class Main {
    public static void main(String[] args){
	//creacion del constructor del escaner
        Scanner sc = new Scanner(System.in);
	
	//declaración de variables crea el constructor para usar el escaner
        double numero1, numero2;

	//imprime en la pantalla el siguiente texto
        System.out.println("Introduce el primer número:");

	//en la variable previamente declarada mete un numero escrito en la pantalla de (no tiene que ser de tipo entero)
        numero1 = sc.nextDouble();

	//imprime en la pantalla el siguiente texto
        System.out.println("Introduce el segundo número:");

	//en la variable previamente declarada mete un numero escrito en la pantalla de (no tiene que ser de tipo entero)
        numero2 = sc.nextDouble();
	
	// imprime en la pantalla los numeros previamente escritos 
        System.out.println("Números introducido: " + numero1 + "  " + numero2);

	//muestra la suma la suma resta y multiplicacion de los dos numeros y a la vez hace la operacion
        System.out.println
          (numero1 + " + " + numero2 + " = " + (numero1+numero2));
        System.out.println
          (numero1 + " - " + numero2 + " = " + (numero1-numero2));
        System.out.println
          (numero1 + " * " + numero2 + " = " + numero1*numero2);
    }
}
