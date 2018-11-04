package es.arelance.criaturas;
/**
 * Clase que representa a la raza elfo
 * @author Francisco Molina Sanchez
 *
 */
public class Elfo extends Criatura {
	/**
	 * Vida maxima de la criatura
	 */
	private static final int VIDA_MAX = 20;
	/**
	 * Fuerza de la craitura
	 */
	private static final int FUERZA = 3;
	/**
	 * Constructor para elfo dado su nombre
	 * 
	 * @param nombre
	 *            nombre del elfo
	 */
	public Elfo(String nombre) {
		super(nombre, VIDA_MAX, FUERZA);
	}

}
