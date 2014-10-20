/*
 * Programa que muestra una tabla con las potencias de x (x x2 x3 x4)
 * para valores de x desde 1 hasta XMAX
 */
public class JavaApplication22 {
    public static void main(String[] args) {
	//se define la constnte de XMAX de tipo integer con el valor de 10
        final int XMAX = 10;
	//se definen las variables de x y n de tipo integer
        int x, n;
        //se imprime lo siguiente como  la cabecera de la tabla
        System.out.printf("%10s%10s%10s%10s%n", "x","x^2","x^3","x^4");
	//le da a x el valor de 1,
	//condicion: mientras x sea menor que XMAX, continuara con las columnas, 
	//empezara ha imprimir la primera fila donde incluye columnas (4)
        for (x = 1; x <= XMAX; x++){   //filas
	//le da a n el valor de 1
	//condicion: mientras n sea menor o igual a 4,
	//imprimira las coloumnas (4) saldra del bucle y seguria con  la siguiente linea
             for (n = 1; n <= 4; n++){   //columnas
                  System.out.printf("%10.0f", Math.pow(x,n));
             }
             System.out.println();
        }
    }
}
