package es.arelance.futbol;

/**
 * Clase de prueba que crea un torneo, inserta los equipos participantes e
 * imprime el ganador
 * 
 * @author Francisco Molina Sanchez
 *
 */
public class Test {

	public static void main(String[] args) {

		Torneo torneo = new Torneo();

		torneo.insertar(new Equipo("Malaga", "Malaga", 1900, 20));
		torneo.insertar(new Equipo("Sevilla", "Malaga", 1900, 4));
		torneo.insertar(new Equipo("Cadiz", "Malaga", 1900, 3));
		torneo.insertar(new Equipo("Granada", "Malaga", 1900, 2));
		torneo.insertar(new Equipo("Huelva", "Malaga", 1900, 14));
		torneo.insertar(new Equipo("Madrid", "Malaga", 1900, 40));
		torneo.insertar(new Equipo("Barcelona", "Malaga", 1900, 50));
		torneo.insertar(new Equipo("Betis", "Malaga", 1900, 10));
		// torneo.insertar(new Equipo("Estepona", "Malaga", 1900, 0));

		try {
			System.out.println("GANADOR: " + torneo.jugar());
		} catch (TorneoException e) {
			System.out.println("El numero de participantes debe ser potencia de 2");
		}

	}

}
