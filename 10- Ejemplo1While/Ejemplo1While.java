/*
 * Programa que lee números hasta que se lee un negativo y muestra la
 * suma de los números leídos
 */

//importa las clases desde java/util
import java.util.*;

//creacion de la clase
public class Ejemplo1While {
    public static void main(String[] args) {
	
	//se declara la variable de suma integer de con el valor por defecto de 0 y la variabke de num 
        int suma = 0, num;

	//creacion del objeto de tipo scanner importado previamente
        Scanner sc = new Scanner(System.in);

	//se imprime lo siguiente	
        System.out.print("Introduzca un número: ");
	
	//se le da valor introducionedo mediante teclado a la variable de num
        num = sc.nextInt();

	//creacion del bucle con la condicion que num sea mayor que 0
        while (num >= 0){
		//hace la suma del valor anterior de la variable suma y le suma el numero de la variable de num 
		//siempre que el valor de la variable de num sea mayor que 0
		//en caso contrario saldria del bucle y dejaria de pedir que introduzcamos un nuevo numero
               suma = suma + num;
               System.out.print("Introduzca un número: ");
               num = sc.nextInt();
        }
	//salida del bucle a causa de que el numero introducido es menor que 0
	//imprime la suma de todos los numeros introducidos hasta el ultimo numero que ha sido negativo
        System.out.println("La suma es: " + suma );
    }
}
