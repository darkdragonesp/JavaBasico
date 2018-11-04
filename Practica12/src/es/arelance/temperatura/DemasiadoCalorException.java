package es.arelance.temperatura;

/**
 * Clase DemasiadoCalorException.
 * 
 * @author Francisco Molina Sanchez
 */
public class DemasiadoCalorException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5991801561150544726L;
	public DemasiadoCalorException() {
		
	}
	/**
	 * Instancia la excepcion demasiado calor exception.
	 *
	 * @param msg
	 *            mensaje
	 */
	public DemasiadoCalorException(String msg) {
		super(msg);
	}
	public DemasiadoCalorException(Exception ex) {
		super(ex);
	}
}
