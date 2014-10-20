/*
 * programa que muestra el valor de a, b y su suma mientras que la suma de
 * ambas es menor de 10. En cada iteración el valor de a se incrementa en
 * 1 unidad y el de b en 2
 */
public class Ejemplo3For {
    public static void main(String[] args) {
	//se definen las variables a y b de tipo integer
        int a, b;
	//se les da valor por defecto de 1 a los dos
	//la condicion: la condicion sera que la suma de a y b sea menor que 10
	//en cada vuelta se le sumara 2 al valor que tenga la variable de b
        for(a = 1, b = 1; a + b < 10; a++, b+=2){
	    //se imprime en cada vuelta el valor de a, b y su respectiva suma
            System.out.println("a = " + a + "  b = " + b + "  a + b = " + (a+b));
        }
    }
}
