package es.arelance.futbol;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * Clase que simula un torneo
 * 
 * @author Francisco Molina Sanchez
 *
 */
public class Torneo {
	// Construir una clase Torneo, cuyas instancias representen un torneo en
	// el que se inscriben equipos, se celebran rondas eliminatorias y
	// finalmente se produce un campeón. Para ello disponer de un conjunto
	// de equipos ordenados por número de títulos (potencia de 2) y una
	// colección de partidos generados de forma que los equipos con más
	// puntos se enfrenten con los de menos (por ejemplo 1o vs 8o, 2o vs 7o,
	// ...). Disponer de un método jugar, que juegue todos los partidos y
	// monte una nueva ronda con los equipos restantes, hasta que en el
	// torneo solamente quede un campeón.
	private List<Equipo> participantes; //TODO sortedSet->treeSet

	/**
	 * Constructor del torneo, inicialzia la lista de participantes
	 */
	public Torneo() {
		participantes = new LinkedList<Equipo>();
	}

	/**
	 * Si el numero de equipos es valido, juega el torneo y decide el ganador
	 * 
	 * @return
	 * @throws TorneoException
	 */
	public Equipo jugar() throws TorneoException {
		if (!powerOf2(participantes.size())) {
			throw new TorneoException();
		}
		this.jugarRecursivo();
		return participantes.get(0);
	}

	/**
	 * Introduce equipos en el torneo
	 * 
	 * @param equipo
	 *            equipo a introducir
	 */
	public void insertar(Equipo equipo) {
		participantes.add(equipo);

	}

	/**
	 * Mientras haya participantes juega los partidos
	 * 
	 */
	private void jugarRecursivo() {
		Partido partido;
		List<Equipo> ganan = new LinkedList<Equipo>();

		while (participantes.size() > 2) {

			partido = new Partido(participantes.get(0),
					participantes.get(participantes.size() - 1));
			partido.jugar();
			ganan.add(partido.ganador());

			participantes.remove(0);
			participantes.remove(participantes.size() - 1);

		}
		participantes = ganan;
		if (participantes.size() > 1) {
			Collections.sort(participantes);
			jugarRecursivo();
		}

	}

	/**
	 * Comprueba si un numero es potencia de 2
	 * 
	 * @param number
	 *            Numero a comparar
	 * @return
	 */
	private boolean powerOf2(int number) {
		return (number > 0) && ((number & (number - 1)) == 0);
	}
}
