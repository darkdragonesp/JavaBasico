package es.arelance.matrices;

/**
 * Clase que representa una matriz cuadrada
 * 
 * @author Francisco Molina Sanchez
 *
 */
public class Matriz {
	private int tamanyo;
	private int[][] matriz;

	/**
	 * Constructor para la matriz cuadrada
	 * 
	 * @param tamanyo
	 *            tamanyo de la matriz
	 */
	public Matriz(int tamanyo) {
		this.tamanyo = tamanyo;
		matriz = new int[this.tamanyo][this.tamanyo];
	}

	/**
	 * Introduce los datos en una matriz cuadrada
	 * 
	 * @param vector
	 *            listado de los numeros a introducir
	 */
	public void asignarDatos(int[] vector) {
		int indice = 0;
		for (int i = 0; i < this.tamanyo; i++) {
			for (int j = 0; j < this.tamanyo; j++) {
				matriz[i][j] = vector[indice];
				indice++;
			}
		}

	}

	/**
	 * Suma dos matrices y guarda el resultado en la primera
	 * 
	 * @param m
	 *            segunda matriz a sumar
	 */
	public void suma(Matriz m) {
		for (int i = 0; i < this.tamanyo; i++) {
			for (int j = 0; j < this.tamanyo; j++) {
				matriz[i][j] += m.matriz[i][j];
			}
		}
	}

	/**
	 * Multiplica dos matrices y guarda el resultado en la primera
	 * 
	 * @param m
	 *            segunda matriz a multiplicar
	 */
	public void producto(Matriz m) {

		for (int i = 0; i < this.tamanyo; i++) {
			for (int j = 0; j < this.tamanyo; j++) {
				matriz[i][j] *= m.matriz[i][j];
			}
		}
	}

	@Override
	public String toString() {
		String res = "";
		for (int i = 0; i < this.tamanyo; i++) {
			for (int j = 0; j < this.tamanyo; j++) {
				res += matriz[i][j] + " ";
			}
			res += "\n";
		}
		res += "--------";
		return res;
	}
}
