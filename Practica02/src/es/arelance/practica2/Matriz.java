package es.arelance.practica2;

public class Matriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Definir un array bidimensional (matriz) de tamaño cuadrado (NxN). Escribir un
		 * código Java para rellenar el contenido de la matriz por filas con los datos
		 * pasados desde un array unidimensional, comprobando inicialmente si la
		 * longitud del array es compatible, e imprimir el resultado por pantalla.
		 */

		int tamanyoMatriz = 3;
		int[][] matriz = new int[tamanyoMatriz][tamanyoMatriz];
		int[] vector = { 1, 2, 3, 4, 5, 6, 7, 8, 10 };
		int k = 0;

		if (vector.length == Math.pow(tamanyoMatriz, 2)) {
			for (int i = 0; i < matriz.length; i++) {
				for (int j = 0; j < matriz.length; j++) {
					matriz[i][j] = vector[k];
					k++;

				}

			}

			for (int i = 0; i < matriz.length; i++) {
				for (int j = 0; j < matriz.length; j++) {
					System.out.print(matriz[i][j] + " ");
				}
				System.out.println();
			}
		}
	}

}
