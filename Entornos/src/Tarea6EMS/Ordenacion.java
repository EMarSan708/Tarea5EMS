/**
 * 
 */
package Tarea6EMS;

/**
 * Esta clase contiene métodos para ordenar y mostrar matrices unidimensionales
 * @author Juan Simón
 *
 */

public class Ordenacion {
	
	/**
	* Método que ordena una matriz de menor a mayor intercambiando el valor máximo
	* @param array Matriz unidimensional
	*/
	public void ordenarMatriz(int[] array) {
		for (int i = array.length - 1; i > 0; i--) {
			int maxValue = 0;
			for (int j = 0; j < i; j++) {
				if (array[j + 1] > array[maxValue]) {
					maxValue = j + 1;
				}
			}
			intercambiar(array, i, maxValue);
			imprimirMatriz(array);
		}
	}
	/**
	* Método que ordena una matriz de menor a mayor intercambiando los números
	* @param numbers Matriz unidimensional
	* @return devuelve la matriz ordenada
	*/
	public int[] ordenarMatriz2(int[] numbers) {
		for (int i=0; i < numbers.length - 1;i++) {
			for (int j=i+1;j<numbers.length;j++) {
				if (numbers[i]>numbers[j]) {
					int auxiliar=numbers[i];
					numbers[i]=numbers[j];
					numbers[j]=auxiliar;
				}
			}
		}
		return numbers;
	}
	/**
	* Método muestra una matriz
	* @param array Matriz unidimensional
	*/
	public void imprimirMatriz(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.printf("%d \t", array[i]);
		}
		System.out.println();
	}
	/**
	* Método que ordena una matriz intercambiando los números
	* @param array Matriz unidimensional
	* @param a primer índice a intercambiar
	* @param b segundo índice a intercambiar
	*/
	public void intercambiar(int[] array, int a, int b) {
		int value = array[b];
		array[b] = array[a];
		array[a] = value;
	}
}