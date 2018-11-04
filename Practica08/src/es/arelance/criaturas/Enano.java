package es.arelance.criaturas;
/**
 * Clase que representa a la raza enano
 * @author Francisco Molina Sanchez
 *
 */
public class Enano extends Criatura {
	/**
	 * Vida maxima de la criatura
	 */
	private static final int VIDA_MAX = 10;
	/**
	 * Fuerza de la craitura
	 */
	private static final int FUERZA = 10;
	/**
	 * Constructor para enano dado su nombre
	 * 
	 * @param nombre
	 *            nombre del enano
	 */
	public Enano(String nombre) {
		super(nombre, VIDA_MAX, FUERZA);
	}

}
