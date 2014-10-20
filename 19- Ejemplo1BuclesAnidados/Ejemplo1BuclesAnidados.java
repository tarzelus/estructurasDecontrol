/*
 * Programa que dibuja un rectángulo sólido de asteriscos.
 * El número de filas y columnas se pide por teclado
 */
import java.util.*;
public class Ejemplo1BuclesAnidados {
    public static void main(String[] args) {
	//creacion del objeto de tipo scanner importado previamente
        Scanner sc = new Scanner(System.in);
	//define las variables de filas y columnas de tipo integer
        int filas, columnas;
        //leer número de filas hasta que sea un número > 0
	//de aqui en adelante se leen las instrucciones
        do{
	//imprime mediante string el numero de filas
           System.out.print("Introduce número de filas: ");
	//le da valor a la variable de filas segun lo que escribamos mediante teclado
           filas = sc.nextInt();
	//creacion de la estructura interactiva de while con la condicion que el numero de filas sea menor que 1
	//por lo que  si introdcimos un numero menor que 1 nos volvera a pedir el numero de filas
        }while(filas<1);

	//de aqui en adelante se leen las instrucciones
        do{
	//Pide el numero de columnas mediante string
           System.out.print("Introduce número de columnas: ");
	//se le da valor a la variable de columnas mediante teclado.
           columnas = sc.nextInt();
	//creacion de la estructura interactiva, en este caso con la condicion que el numero de columna sea menor que 1
        }while(columnas<1);

	//define la variable i de tipo integer y le da valor de 1
	//la condicion: mientras que i sea menor o igual al numero de filas introducido
	//en cada vuelta le añadira uno al valor de la variable de filas
        for(int i = 1; i<=filas; i++){    //filas
	
	//define la variable j de tipo integer y leda valor por defecto de 1
	//la condicion mientras que j sea menor o igual a la variable de j
	//en cada vuelta le añadira uno al valor que tenga la variable de columnas
            for(int j = 1; j<=columnas; j++){   //columnas
                 System.out.print(" * ");
            }
            System.out.println();
        }
       
    }
}
