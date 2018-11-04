package es.arelance.punto;

/**
 * Clase de prueba para la clase Punto. Se crea una instancia del objeto Punto y
 * se prueba a trasladar imprimiendo el resultado.
 * 
 * @author Francisco Molina Sanchez
 * 
 */
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Punto punto = new Punto();

		System.out.println(punto);
		punto.trasladar(5, -6);
		System.out.println(punto);
		punto.trasladar(1, 1);
		System.out.println(punto);
	}

}
