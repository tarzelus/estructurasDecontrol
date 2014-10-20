/*
 * Programa que pide dos números y un operador y muestra el resultado
 */

//importa las clases desde java/utils
import java.util.*;

//importa las clases desde java/io
import java.io.*;

//creación de la clase
public class Ejemplo1Switch {

	//ioexception se  usa para  ppara cuando quieres lanzar un error producido en la entrada o salida de datos
    public static void main(String[] args) throws IOException{
	
	//declaracion de las variables de tipo integer A,B y Resultado con el valor por defecto de 0
        int A,B, Resultado = 0 ;

	//declaracion de la variable de operador de tipo char
        char operador;

	//declaracion de la variable de operador de tipo boolean con el valor por defecto de true
        boolean calculado = true;

	//creacion del constructor para darle uso a scanner.
        Scanner sc = new Scanner(System.in);

	//imprime en la pantalla lo siguiente
        System.out.print("Introduzca un numero entero:");

	//lo escrito por  teclado lo recoge como tipo integer y lo guarda en la variablle de A
        A = sc.nextInt();

	//imprime en la pantalla lo siguiente
        System.out.print("Introduzca otro numero entero:");

	//lo escrito en la pantalla lo recoge como tipo integer y lo guarda en la variablle de A
        B = sc.nextInt();

	//imprime en la pantalla lo siguiente
        System.out.print("Introduzca un operador (+,-,*,/):");
	
	//recoge el lo escrito en el teclado como  string y lo convierte en este caso a char sinbolo introducido de + - * o / y lo convierte 		en caracter para poder compararlo mas adelante
        operador = (char)System.in.read();

	//es una estructura de control que compara en este caso el el sinbolo intruducido con los siguientes cuatro casos    
        switch (operador) {
	
		//si el sinbolo introducido concuerda con - ejecuta la siguiente operacion y lo guarda en la variable de Resultado
                case '-' : Resultado = A - B;
			   //sale del caso -
                           break;
	
		//si el sinbolo introducido concuerda con / ejecuta la siguiente operacion y lo guarda en la variable de Resultado
                case '+' : Resultado = A + B;
			   //sale del caso -
                           break;

		//si el sinbolo introducido concuerda con * ejecuta la siguiente operacion y lo guarda en la variable de Resultado
                case '*' : Resultado = A * B;
			   //sale del caso -
                           break;

		//si el sinbolo introducido concuerda con / ejecuta la siguiente operacion y lo guarda en la variable de Resultado
		//compara que la variable B sea diferente a 0 para que haga la division correctamente, en caso contrario salta el error
                case '/' : if(B!=0)
                              Resultado = A / B;
                           else{
                              System.out.println("\nNo se puede dividir por cero");
                              calculado = false;
                           }
			   //sale del caso -
                           break;

		//en caso de que no concuerde con ninguno de los anteriores casos salta el mensaje de operadon no valido.
                default : System.out.println("\nOperador no valido");
			  //como el caracter introducido no es correcto cambia el valor de la variable de calculo y lo convierte en false.
                          calculado = false;
                         
        }
	
	//si la variable previamente creada es true quiere decir que el sinbolo introducido es correcto por lo que debe imprimir el resultado
        if(calculado){
            System.out.println("\nEl resultado es: " + Resultado);
        }
    }
}
