/*
 * programa que muestra los números del 1 al 10
 */
public class Ejemplo0For {
    public static void main(String[] args) {
	// se define la variable i de tipo integer
        int i;
	//Las instrucciones se escriben en el for. el valor por defecto de i es un,
	//la condicion: "i<=10"  mientras que i sea menor que 10
	//mientras se cumpla la condicion sumara uno a i en cada vuelta.
	// el bucle termina cuando deje de cumplirse la condicion
	// en cada vuelta imprimira el valor de i
        for(i=1; i<=10;i++)
            System.out.println(i + " ");
    }
}
