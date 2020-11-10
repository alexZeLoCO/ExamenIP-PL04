
import java.util.Scanner;		//IMPORTAR SCANNER
/**
 * @author UO281827
 * 	Examen IP PL04
 * 	ENUNCIADO: 
 * 			1) DADO UN INTERVALO CERRADO DEFINIDO POR DOS N�MEROS NATURALES A Y B, AMBOS INCLUIDOS, CALCULAR E IMPRIMIR EN PANTALLA
 * 			   LA SUMA DE TODOS LOS N�MEROS PARES O M�LTIPLOS DE 7.
 * 			2) A CONTINUACI�N, DADA UNA SECUENCIA DE N�MEROS ENTEROS POSITIVOS (LA SECUENCIA FINALIZA CON UN N�MERO NEGATIVO O CERO)
 * 			   INDICAR SI TODOS LOS ELEMENTOS DE LA SECUENCIA CUMPLEN QUE EL ELEMENTO I-�SIMO ES MAYOR O IGUAL QUE I.
 * 			(NOTA: EN EL MOMENTO EN QUE SE DETECTE UN N�MERO QUE NO CUMPLE LA CONDICI�N BUSCADA EL PROGRAMA DEBE DEJAR DE LEER LOS SIGUIENTES.)
 *
 */
public class examenmartesip {

	
	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);		//CREAR TECLADO
		
		//-------------EJERCICIO 1------------
		System.out.println("En un intervalo del tipo [a,b].");		//GU�A USR
		System.out.print("Defina a: ");		//SOLICITA DATO
		int a = teclado.nextInt();		//ALMACENA DATO EN A
		System.out.print("Defina b: ");		//SOLICITA DATO
		int b = teclado.nextInt();		//ALMACENA DATO EN B
		int suma = 0;		//INICIALIZA SUMA = 0 
		
		for (int i=a;i<=b;i++) {		//PARA TANTAS VECES COMO VALORES HAYA EN INTERVALO.
					//EMPEZANDO POR A Y ACABANDO POR B
			if (i%2==0 || i%7==0) {		//SI ES PAR O M�LTIPLO DE 7
			//CONDICI�N SER PAR + PROBABLE, PRIMERA CONDICI�N
				suma = suma + i;		//SUMAR AL TOTAL
			}
		}
				//OUTPUT
		System.out.printf("La suma de todos los n�meros pares y m�ltiplos de 7 dentro del intervalo es: %d. \n",suma);
	
		//----------EJERCICIO 2-------------
		System.out.println("Introduzca una secuencia de n�meros: ");		//SOLICITA VALOR
		int  n;		//INICIALIZAR N (SECUENCIA)
		int contador=0;		//INICIALIZAR CONTADOR
		
		do {
			contador++;			//ACTUALIZAR CONTADOR
			n=teclado.nextInt();		//ALMACENA VALOR EN N
		} while (n>0 && n>=contador);		//MIENTRAS SEA MAYOR QUE 0 Y MAYOR O IGUAL A SU POSICI�N EN SECUENCIA
		
		if (n<0) {		//SI EL VALOR ES MENOR A 0
					//OUTPUT
			System.out.print("Todos los valores son mayores o iguales a su posici�n en la secuencia.");
		} else {		//SI NO
					//OUTPUT
			System.out.print("El valor no es mayor a su posici�n en la secuencia.");
		}
	}
}
