/*
 * programa que pide un número por teclado y calcula si es par o impar
 */


import java.util.*;

//creacion de la clase
public class EjemploIf {

    //lo que hace leer la clase
    public static void main(String[] args) {
	
	//crea el constructor para poder usar la clase de scanner
        Scanner sc = new Scanner(System.in);
	// declara la variable de tipo integer (numero entero)
        int num;      

	//imprime el siguiente texto
        System.out.println("Introduzca numero: ");

	//le da valor a la variable previamente declarada (valor escrito en la pantalla)
        num = sc.nextInt();

	//condicion que si la resto de la division del numero introducido previamente, dividido entre dos  sea igual a 0	
        if ((num%2)==0)	
	   //si el resto del numero introducido es 0 quiere decir que es par por lo que imprime lo siguiente:
           System.out.println("PAR");
        else
	   //en caso contrario a que no cumpla el requisito de que el resto sea 0 imprime que el numero es impar
            System.out.println("IMPAR");
    }
}
