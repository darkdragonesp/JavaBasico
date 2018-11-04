package es.arelance.temperatura;

/**
 * The Class ControladorMemoria.
 * 
 * @author Francisco Molina Sanchez
 */
public class ControladorMemoria extends Controlador {
	// Crear un controlador mejorado en la clase ControladorMemoria, donde
	// adem�s del m�todo controlar disponga de un m�todo getMemoria que permite
	// consultar el �ltimo error producido o null en caso de que la �ltima
	// temperatura no haya salido del rango.
	private Exception memoria;

	/**
	 * Controlador mejorado con memoria
	 */
	public ControladorMemoria() {
		super();
		memoria = null;
	}

	@Override
	public void controlar() throws DemasiadoFrioException, DemasiadoCalorException {
		try {
			super.controlar();
			memoria = null;
		} catch (DemasiadoFrioException|DemasiadoCalorException e) {
			memoria = e;
			throw e;
		}

	}

	/**
	 * Devuelve la excepcion dada segun la temperatura o null si no salto excepcion
	 * 
	 * @return
	 */
	public Exception getMemoria() {
		return memoria;
	}

}
