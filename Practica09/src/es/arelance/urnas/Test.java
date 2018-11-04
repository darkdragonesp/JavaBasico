package es.arelance.urnas;

/**
 * Test con el algoritmo de la urna
 * 
 * @author Francisco Molina Sanchez
 *
 */
public class Test {

	private static final int BOLAS_BLANCAS = 25;
	private static final int BOLAS_NEGRAS = 25;

	public static void main(String[] args) {
		Urna urna = new Urna(BOLAS_NEGRAS, BOLAS_BLANCAS);
		while (urna.totalBolas() > 1) {
			if (urna.extraer().equals(urna.extraer())) {
				urna.introducirBlanca();
			} else {
				urna.introducirNegra();
			}
		}
		System.out.println(urna.extraer());
	}

}
