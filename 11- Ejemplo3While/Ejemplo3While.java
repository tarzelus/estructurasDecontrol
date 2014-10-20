/*
 * programa que muestra una tabla de equivalencias entre
 * grados Fahrenheit y grados celsius
 */

//creacion de la clase
public class Ejemplo3While {

    //Dentro de la clase Ejemplo3While se define el método main
    public static void main(String[] args) {
	// declaracion de las constantes con valor fijo
        final int VALOR_INICIAL = 10;  // limite inf. tabla
        final int VALOR_FINAL = 100;  // limite sup. tabla
        final int PASO = 10 ; // incremento
	//declaracion de las variables sin valor por defecto
        int fahrenheit;
        double celsius;
	
	//a la variable de farenheit se le pasa el valor del constante VAOLOR_INICIAL
        fahrenheit = VALOR_INICIAL;
	
	//se imprime en la pantalla lo siguiente
        System.out.printf("Fahrenheit \t Celsius \n");

	//creacion del bucle con la condicion que el valor de la variable de farenhe se menor o igual a VALOR_FINAL
		//en caso de que no se cumpla sale del bucle
        while (fahrenheit <= VALOR_FINAL ){
	       //se le da valor a la variable de celsius calculando con el valor que tenga Farenheit
               celsius = 5*(fahrenheit - 32)/9.0;
	       //se imprime el valor que tenga farenheit y celsius,
	       //               distancia  a la que empieza a imprimir y la configuracion de las tabulaciones 
               System.out.printf("%7d \t %8.3f \n", fahrenheit, celsius);
	       //Se le cambia el valor a Farenheit sumandole 10 mas al valor que tiene y vuelve a empezar el bucle
		//a no ser que el numero de farenheit sea mayor a VALOR_INICIAL
               fahrenheit += PASO;
        }
    }
}
