 /*
  * programa que pide un número por teclado y calcula si es par o impar
  */

//importa las clases desde java/utils
import java.util.*;

//crea la clase de Ejemplo1OperadorCondicional
public class Ejemplo1OperadorCondicional {
	
    public static void main(String[] args) {

	//creacion del objeto de tipo scanner importado previamente
        Scanner sc = new Scanner(System.in);

	//declaracion de la variable num de tipo integer
        int num;      
	
	//imprime la siguiente linea
        System.out.println("Introduzca numero: ");

	//se le da valor con lo que se escriba por teclado a la varIable de num 
        num = sc.nextInt();

	//se imprime a la vez que hace la operacion
	//Se evalúa la condición y si es true se devuelve valor1 (en este caso par), y si es false se devuelve valor2 (en este caso impar).
        System.out.println((num%2)==0 ? "PAR" : "IMPAR");
    }
}
