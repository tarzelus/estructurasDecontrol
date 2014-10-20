/*
 * Programa que muestra un saludo distinto según la hora introducida
 */

//importa las clases desde java/utils
import java.util.*;

// creacion de la clase
public class Ejemplo2If {
    public static void main(String[] args) {
	
	//creacion del objeto de tipo scanner importado previamente
      Scanner sc = new Scanner(System.in);

      //declaracion la variable de tipo integer
      int hora;

      //imprime en la pantalla lo siguiente
      System.out.println("Introduzca una hora (un valor entero): ");
 
      //le da valor a la variable de hora previamente creaada (valor de tipo integer que tendremos que meter mediante teclado)
      hora = sc.nextInt();

      //condicion de que si la hora introducida sea mayor o igual que 0 y menor que  12
      if (hora >= 0 && hora < 12)
      //si cumple las dos condiciones previamente creadas imprime el siguiente texto
          System.out.println("Buenos días");

      //establece una segunda condicion; si el numer introducido es mayor o  igual que 12 y menor que 21 imprime el siguiente texto
      else if (hora >= 12 && hora < 21)
           System.out.println("Buenas tardes");

      // establece una tercera condicion; si el numero introducido es mayou o igual a 21 o menor que 24 imprime el siguiente texto
      else if (hora >= 21 && hora < 24)
            System.out.println("Buenas noches");

      //si el numero introducido no cumple ninguno de los anteriores requisitos imprime lo siguiente en la pantalla
      else
            System.out.println("Hora no válida");
    }
}
