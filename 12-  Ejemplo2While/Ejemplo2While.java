/*
 * programa que lee un número n y muestra n asteriscos
 */
import java.util.*;

//creacion de la valse 
public class Ejemplo2While {
    public static void main(String[] args) {

	//creacion del objeto de tipo scanner importado previamente
        Scanner sc = new Scanner(System.in);
	
	//declaracion de las variables n y contador (contador con el valor por defecto de 0)
        int n, contador = 0;
	
	//inprime la siguiente linea
        System.out.print("Introduce un número: ");

	//se le da valor a la variable n de tipo integer mediante teclado
        n = sc.nextInt();

	//va ha entrar en el bucle siempre que la variable de n sea mayor que la del variable contador por lo que eso hace que el bucle se 		vaya ha ejecutar las veces que el valor que le hayamos dado a la variable n
	//el bucle en cada vuelta va imprimir un * por lo que se van a imprimir la misma cantidad de asteriscos que el valor de n
        while (contador < n){
		//imprime *
               System.out.println(" * ");
		//le suma 1 al valor del contador en cada vuelta
               contador++;
        }
    }
}
