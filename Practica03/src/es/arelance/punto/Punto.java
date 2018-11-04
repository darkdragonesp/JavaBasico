package es.arelance.punto;

/**
 * Esta clase representa al objeto punto en un plano de dos dimensiones.
 * 
 * @author Francisco Molina Sanchez
 * 
 */
public class Punto {
	private int x;
	private int y;

	/**
	 * Crea un punto inicializado a 0
	 */
	public Punto() {
		//this(0,0);
	}

	/**
	 * Crea un punto inicializado segun los parametros de entrada
	 * 
	 * @param x
	 *            valor para la ordenada en el eje x
	 * @param y
	 *            valor para la ordenada en el eje y
	 */
	public Punto(int x, int y) {
		this.x = x;
		this.y = y;
	}

	/**
	 * Mueve el punto x e y posiciones en las dos ordenadas dadas.
	 * 
	 * @param x
	 *            mueve el punto x veces en la ordenada en el eje x
	 * @param y
	 *            mueve el punto y veces en la ordenada en el eje y
	 */
	public void trasladar(int x, int y) {
		this.x += x;
		this.y += y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "Punto [x=" + x + ", y=" + y + "]";
	}

}
