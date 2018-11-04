package es.arelance.urnas;

/**
 * Clase que representa una urna con bolas de colores
 * @author Francisco Molina Sanchez
 *
 */
import java.util.Random;

public class Urna {
	private int negras;
	private int blancas;
	private Random r;

	/**
	 * Constructor de la urna
	 * 
	 * @param negras
	 *            cantidad de bolas negras
	 * @param blancas
	 *            cantidad de bolas blancas
	 */
	public Urna(int negras, int blancas) {
		super();
		this.negras = negras;
		this.blancas = blancas;
		r = new Random();
	}

	/**
	 * Total de bolas en la urna
	 * 
	 * @return entero con la cantidad de bolas
	 */
	public int totalBolas() {
		return negras + blancas;
	}

	/**
	 * Introduce una bola blanca en la urna
	 */
	public void introducirBlanca() {
		blancas++;
	}

	/**
	 * Introduce una bola negra en la urna
	 */
	public void introducirNegra() {
		negras++;
	}

	/**
	 * Extrae de forma aleatoria una bola de la urna
	 * 
	 * @return el color de la bola extraida
	 */
	public Color extraer() {
		Color color;
		int bolaNumero = r.nextInt(this.totalBolas() + 1) + 1;
		if (bolaNumero <= blancas) {
			blancas--;
			color = Color.BLANCO;
		} else {
			negras--;
			color = Color.NEGRO;
		}
		return color;
	}
}
