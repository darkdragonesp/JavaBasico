package es.arelance.temperatura;
/**
 * Clase DemasiadoFrioException.
 * 
 * @author Francisco Molina Sanchez
 */
public class DemasiadoFrioException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 8728328591122917227L;
	public DemasiadoFrioException() {
		
	}
	/**
	 * Instancia la exception demasiado frio .
	 *
	 * @param msg mensaje
	 */
	public DemasiadoFrioException(String msg) {
		super(msg);
	}
	public DemasiadoFrioException(Exception ex) {
		super(ex);
	}
}
