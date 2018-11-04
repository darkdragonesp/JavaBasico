package es.arelance.temperatura;

/**
 * The Class ControladorMemoria.
 * 
 * @author Francisco Molina Sanchez
 */
public class ControladorMemoria extends Controlador {
	// Crear un controlador mejorado en la clase ControladorMemoria, donde
	// además del método controlar disponga de un método getMemoria que permite
	// consultar el último error producido o null en caso de que la última
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
