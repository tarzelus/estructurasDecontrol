/*
 * programa que muestra una tabla de equivalencias entre
 * grados Fahrenheit y grados celsius
 */
public class Ejemplo1For {
    public static void main(String[] args) {
	//define las  constantes de tipo integer 
        final int VALOR_INICIAL = 10; // limite inf. tabla
        final int VALOR_FINAL = 100; // limite sup. tabla
        final int PASO = 10 ; // incremento
	//se defionen las variables
        int fahrenheit;
        double celsius;
	//se le da valor a la variable de farenheit con el valor de la constante VALOR_INICIAL
        fahrenheit = VALOR_INICIAL;
        System.out.printf("Fahrenheit \t Celsius \n");
	//se le da vlor a farenheit 
	//la condicion que farenheit sea menot o igual a VALOR FINAL
	//en cada vuelta le suma  el valor de PASO al valor que tenga farenheit
	//se ejecutara mientras se cumpla la condicion
        for (fahrenheit = VALOR_INICIAL; fahrenheit <= VALOR_FINAL;
              fahrenheit+= PASO) {
             celsius = 5*(fahrenheit - 32)/9.0;
             System.out.printf("%7d \t %8.3f \n", fahrenheit, celsius);
        }
    }
}
