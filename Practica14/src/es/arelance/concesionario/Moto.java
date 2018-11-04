package es.arelance.concesionario;

/**
 * Clase que representa al vehiculo moto
 * 
 * @author Molina Sanchez, Francisco
 *
 */
public class Moto extends Vehiculo {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */
	
	private int cilindrada;

	/**
	 * Crea un vehiculo de tipo moto
	 * 
	 * @param matricula
	 * @param color
	 * @param reservado
	 * @param precio
	 * @param cilindrada
	 */
	public Moto(String matricula, ColorVehiculo color, boolean reservado, double precio, int cilindrada) {
		super(matricula, color, reservado, precio);
		this.cilindrada = cilindrada;
	}

	public int getCilindrada() {
		return cilindrada;
	}

	@Override
	public String toString() {
		return "Moto [cilindrada=" + cilindrada + ", " + super.toString() + "]";
	}

}
