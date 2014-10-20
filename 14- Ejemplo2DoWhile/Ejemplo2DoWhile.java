/*
 * Programa que lee un número entre 1 y 10 ambos incluidos
 */
import java.util.*;
public class Ejemplo2DoWhile {
    public static void main(String[] args) {
	//se define la variable n de tipo integer
        int n;
	//creacion del objeto de tipo scanner importado previamente
        Scanner sc = new Scanner( System.in );
	//a partir de aqui se ejecutan las instrucciones
        do {
	//imprime en pantalla que metamos un numero entre 1 y 10
            System.out.print("Escribe un número entre 1 y 10: ");
	//le da valor a la variable de n introducido mediante teclado
            n = sc.nextInt();
	//se crea el bucle, mientras n sea mayor que 1 y menor que 10, mostrara el numero introducido, si no cumple la condicoin volvera  a pedir que introduzcamos el numero y no salra del programa mientras no se cumpla la condicion
        }while (n<1 || n >10);
        System.out.println("Ha introducido: " + n);
    }
}
