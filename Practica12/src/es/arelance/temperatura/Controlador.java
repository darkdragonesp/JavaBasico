package es.arelance.temperatura;
/**
 * Clase Controlador.
 * 
 * @author Francisco Molina Sanchez
 */
public class Controlador {

	/** Representa el nivel mas bajo de temperatura posible */
	private static final int LIMITE_INFERIOR = 20;

	/** Representa el nivel mas alto de temperatura posible */
	private static final int LIMITE_SUPERIOR = 50;

	private Sala sala;

	/**
	 * Constructor del contolador.
	 */
	public Controlador() {
		sala = new Sala();
	}

	/**
	 * Controlar.
	 *
	 * @throws DemasiadoFrioException
	 *             excepcion para demasiado frio
	 * @throws DemasiadoCalorException
	 *             excepcion para demasiado calor
	 */
	public void controlar() throws DemasiadoFrioException, DemasiadoCalorException {
		int temperatura = sala.getTemperatura();
		if (temperatura < LIMITE_INFERIOR) {
			throw new DemasiadoFrioException("Mensaje para programador: Demasiado frio.");
		} else if (temperatura > LIMITE_SUPERIOR) {
			throw new DemasiadoCalorException("Mensaje para programador: Demasiado calor.");
		}
	}

}
