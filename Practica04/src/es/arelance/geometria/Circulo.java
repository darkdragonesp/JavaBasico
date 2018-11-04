package es.arelance.geometria;

/**
 * Clase que representa un circulo dado su centro y su radio.
 * 
 * @author Francisco Molina Sanchez
 *
 */
public class Circulo {
	protected int radio;
	protected Punto centro;

	/**
	 * Se crea un circulo con radio y centro cero
	 */
	public Circulo() {
		this(new Punto(),0);
	}

	/**
	 * Se crea un circulo con radio y centro dados
	 * 
	 * @param p
	 *            centro del circulo
	 * @param r
	 *            radio del circulo
	 */
	public Circulo(Punto p, int r) {
		this.centro = p;
		this.radio = r;
	}

	/**
	 * Mueve el circulo de posicion en el plano en dos dimensiones
	 * 
	 * @param a
	 *            mueve el centro del circulo en la ordenada del eje x
	 * @param b
	 *            mueve el centro del circulo en la ordenada del eje y
	 */
	public void trasladar(int a, int b) {
		centro.trasladar(a, b);
	}

	public int getRadio() {
		return radio;
	}

	public void setRadio(int radio) {
		this.radio = radio;
	}

	public Punto getCentro() {
		return centro;
	}

	public void setCentro(Punto centro) {
		this.centro = centro;
	}

	@Override
	public String toString() {
		return "Circulo [radio=" + radio + ", centro=" + centro + "]";
	}

}
