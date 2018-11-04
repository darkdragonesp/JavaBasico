package es.arelance.criaturas;

/**
 * Clase que representa a la raza trol
 * 
 * @author Francisco Molina Sanchez
 *
 */
public class Trol extends Criatura {
	/**
	 * Vida maxima de la criatura
	 */
	private static final int VIDA_MAX = 14;
	/**
	 * Fuerza de la craitura
	 */
	private static final int FUERZA = 5;

	/**
	 * Constructor para trol dado su nombre
	 * 
	 * @param nombre
	 *            nombre del trol
	 */
	public Trol(String nombre) {
		super(nombre, VIDA_MAX, FUERZA);
	}

}
