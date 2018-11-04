package es.arelance.geometria;

/**
 * Clase que representa un cilindro en el plano dado su altura y su base
 * 
 * @author Francisco Molina Sanchez
 *
 */
public class Cilindro {
	protected int altura;
	protected Circulo base;

	/**
	 * Crea un cilindro con altura y base de radio 0
	 */
	public Cilindro() {
		this(new Circulo(),0);
	}

	/**
	 * Crea un cilindro con altura y base de radio dados
	 * 
	 * @param b
	 *            base del cilindro
	 * @param a
	 *            altura del cilindro
	 */
	public Cilindro(Circulo b, int a) {
		this.base = b;
		this.altura = a;
	}

	/**
	 * Mueve el cilindro de posicion en el plano en dos dimensiones
	 * 
	 * @param a
	 *            mueve la base del cilindro en la ordenada del eje x
	 * @param b
	 *            mueve la base del cilindro en la ordenada del eje y
	 */
	public void trasladar(int a, int b) {
		base.trasladar(a, b);
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public Circulo getBase() {
		return base;
	}

	public void setBase(Circulo base) {
		this.base = base;
	}

	@Override
	public String toString() {
		return "Cilindro [altura=" + altura + ", base=" + base + "]";
	}

}
