package es.arelance.futbol;

public class TorneoException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = -905947207135995271L;
	public TorneoException() {
		
	}
	public TorneoException(String msg) {
		super(msg);
	}
	public TorneoException(Exception ex) {
		super(ex);
	}
}
