/*
 * programa que muestra los números del 10 al 1
 */
public class Ejemplo2For {
    public static void main(String[] args) {
	//se define la variable i de tipo integer
        int i;
	//Las instrucciones se escriben en el for. el valor por defecto de i es 10,
	//la condicion: "i>0"  mientras que i sea mayot que 0
	//mientras se cumpla la condicion sumara restara a i en cada vuelta.
	// el bucle termina cuando deje de cumplirse la condicion
	// en cada vuelta imprimira el valor de i
        for(i=10; i>0;i--)
            System.out.println(i + " ");
    }
}
