package es.arelance.matrices;

/**
 * Prueba para la clase Matriz
 * 
 * @author Francisco Molina Sanchez
 *
 */
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// • Crear dos matrices de tamaño 3x3.
		Matriz matriz1 = new Matriz(3);
		Matriz matriz2 = new Matriz(3);
		// • Rellenar la primera con los datos: 3, 2, 1, 1, 2, 3, 2, 3, 1.
		int[] vector1 = { 3, 2, 1, 1, 2, 3, 2, 3, 1 };
		matriz1.asignarDatos(vector1);
		// • Rellenar la segunda con los datos: 1, 1, 2, 2, 1, 1, 1, 2, 1.
		int[] vector2 = { 1, 1, 2, 2, 1, 1, 1, 2, 1 };
		matriz2.asignarDatos(vector2);
		// • Mostrar el contenido de ambas matrices.
		System.out.println(matriz1);
		System.out.println(matriz2);
		// • Multiplicar la primera por la segunda y mostrar el resultado.
		matriz1.producto(matriz2);
		System.out.println(matriz1);
		// • Sumar la primera por la segunda y mostrar el resultado.
		matriz1.suma(matriz2);
		System.out.println(matriz1);
	}

}
