package es.arelance.geometria;

/**
 * Prueba para la clase cilindro: se crean varios cilindros, se trasladan y se
 * imprimen.
 * 
 * @author Francisco Molina Sanchez
 *
 */
public class TestCilindro {
	public static void main(String[] args) {
		Punto centroBase = new Punto(3, 5);
		Circulo base = new Circulo(centroBase, 4);
		Cilindro miCilindro = new Cilindro(base, 10);
		System.out.println(miCilindro);
		miCilindro.trasladar(2, 2);
		System.out.println(miCilindro);
		System.out.println(new Cilindro(new Circulo(new Punto(3, 5), 4), 10));
	}
}
