/*
 * programa que lee una nota y escribe la calificación correspondiente
 */
import java.util.*;
public class Ejemplo3If {
    public static void main(String[] args) {

	//creacion del objeto de tipo scanner importado previamente
      Scanner sc = new Scanner(System.in);
      
      //declaracion de la variable nota de tipo double (numero con dos decimales)
      double nota;

      //imprime el siguiente texto en la pantalla
      System.out.println("Introduzca una nota entre 0 y 10: ");
     
      //le da valor de lo que escribamos  por teclado a la variable nota
      nota = sc.nextDouble();
      
      //imprime el siguiente texto
      System.out.println("La calificación del alumno es ");

      //primera condicion: si el numero introducido es menor que 0 o mayor que 10 imprime que la nota no es valida
      if(nota < 0 || nota > 10)
         System.out.println("Nota no válida");

      //en las siguientes lineas compara el numero introducido con un numero 5 al 10 para calificar su nota
      // igual a 10 matricula de honor  || del 9 al 9,99 sobresaliente  || del 7 al 8,99 notable || 6 al 6,99 bien || 5 al 5,99 suficiente
      else if(nota==10)
           System.out.println("Matrícula de Honor");
      else if (nota >= 9)
           System.out.println("Sobresaliente");
      else if (nota >= 7)
           System.out.println("Notable");
      else if (nota >= 6)
           System.out.println("Bien");
      else if (nota >= 5)
           System.out.println("Suficiente");
      //si el numero introducido no esta entre el 5 y el 10 califica la nota como suspenso
      else
           System.out.println("Suspenso");
    }
}
