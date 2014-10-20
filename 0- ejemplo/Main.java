/* Programa que lea dos números por teclado y los muestre por pantalla.
 */
import java.util.*;
public class Main {
    public static void main(String[] args){
        //declaración de variables crea el constructor para usar el escaner
        int n1, n2;
        Scanner sc = new Scanner(System.in);
        //leer el primer número 
	//imprime en la pantalla el siguiente texto
        
	System.out.println("Introduce un número entero: ");

	// recoje el numero entero escrito en la linea de comandos en la variable n1

        n1 = sc.nextInt();      //lee un entero por teclado
        
	//leer el segundo número 
	//imprime en la pantalla el siguiente texto 
        
	System.out.println("Introduce otro número entero: ");
        n2 = sc.nextInt();      //lee un entero por teclado
       
        //mostrar resultado
        System.out.println("Ha introducido los números: " + n1 + " y " + n2);
    }
}
