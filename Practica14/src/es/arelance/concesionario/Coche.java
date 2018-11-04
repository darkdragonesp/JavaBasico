package es.arelance.concesionario;



/**
 * Clase que representa al vehiculo coche
 * 
 * @author Molina Sanchez, Francisco
 *
 */
public class Coche extends Vehiculo{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */
	private int plazas;
	private boolean extras;

	/**
	 * Crea un vehiculo de tipo coche
	 * 
	 * @param matricula
	 * @param color
	 * @param reservado
	 * @param precio
	 * @param plazas
	 * @param extras
	 */
	public Coche(String matricula, ColorVehiculo color, boolean reservado, double precio, int plazas, boolean extras) {
		super(matricula, color, reservado, precio);
		this.plazas = plazas;
		this.extras = extras;
	}

	public int getPlazas() {
		return plazas;
	}

	public boolean isExtras() {
		return extras;
	}

	@Override
	public String toString() {
		return "Coche [plazas=" + plazas + ", extras=" + extras + ", " + super.toString() + "]";
	}

}
