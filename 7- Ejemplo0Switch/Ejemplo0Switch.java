/*
 * Programa que pide un número de mes y muestra el nombre correspondiente
 */
import java.util.*;
public class Ejemplo0Switch {
    public static void main(String[] args) {
	//declaracion de la variable mes de tipo integer
        int mes;

	//creacion del objeto de tipo scanner importado previamente
        Scanner sc = new Scanner(System.in);
	//imprime la siguiente linea escrita
        System.out.print("Introduzca un numero de mes: ");
	// le da valor de tipo integer mediante teclado
        mes = sc.nextInt();

	//es una estructura de control que compara en este caso el nuemero del mes que introducimos con  los diferentes casos      
	switch (mes)
        {
		//compara el numero introducido con los siguientes casos; si cumple alguno de los siguientes 
		//numeros imprime el mes que le corresponde al numero
                case 1: System.out.println("ENERO");
		//sale del caso 1
                           break;

                case 2: System.out.println("FEBRERO");
                           break;
                case 3: System.out.println("MARZO");
                           break;
                case 4: System.out.println("ABRIL");
                           break;
                case 5: System.out.println("MAYO");
                           break;
                case 6: System.out.println("JUNIO");
                           break;
                case 7: System.out.println("JULIO");
                           break;
                case 8: System.out.println("AGOSTO");
                           break;
                case 9: System.out.println("SEPTIEMBRE");
                           break;
                case 10: System.out.println("OCTUBRE");
                             break;
                case 11: System.out.println("NOVIEMBRE");
                             break;
                case 12: System.out.println("DICIEMBRE");
                             break;
		//si el numero introducido no coincide con ninguno de los anteriores sale el siguiente mensaje
                default : System.out.println("Mes no válido");                       
        }
    }
}
