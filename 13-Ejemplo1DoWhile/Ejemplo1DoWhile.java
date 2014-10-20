/*
 * Programa que obliga al usuario a introducir un número menor que 100
 */
import java.util.*;
//creacion de la clase 
public class Ejemplo1DoWhile {
    //Dentro de la clase Ejemplo1DoWhile se define el método main
    public static void main(String[] args) {
	//declaracion de la clase valor de tipo integer
        int valor;
	//creacion del objeto de tipo scanner importado previamente
        Scanner in = new Scanner( System.in );
	//se ejecutan las instrucciones a partir de do
        do {
	//imprimira el siguiente string
            System.out.print("Escribe un entero < 100: ");
	//se le da valor a la variable de valor mediante teclado
            valor = in.nextInt();
	//se crea el bucle, se ejecutara mientras eque el valor introducido en la variable de valor sea mayor quecien
	//por lo que si el valor que le hemos dado a la variable valor es mayor que 100 nos volvera a pedir que le introduzcamos un valor
        }while (valor >= 100);
        System.out.println("Ha introducido: " + valor);
    }
}
