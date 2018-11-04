package es.arelance.futbol;

import java.util.Random;

/**
 * Clase que simula un partido
 * 
 * @author Francisco Molina Sanchez
 *
 */
public class Partido {
	// Construir una clase Partido, que contendrá referencias a los dos
	// equipos participantes. Tendrá un método jugar, que haga que el partido
	// se juegue generando el ganador de forma aleatoria, dándole a un
	// equipo con número de títulos p1 una probabilidad p1/(p1+p2) de ganar
	// frente a un equipo con p2, y métodos para consultar ganador y
	// perdedor.
	private Equipo local;
	private Equipo visitante;
	private int ganador;
	private Random r;

	/*
	 * Constructor del partido, se juega el aprtido y decide el ganador
	 */
	public Partido(Equipo local, Equipo visitante) {
		this.local = local;
		this.visitante = visitante;
		this.ganador = 0;
		this.r = new Random();
		ganador = this.jugar();
	}

	/**
	 * Calcula el ganador del partido
	 * 
	 * @return 0 para equipo local, 1 para equipo visitante
	 */
	public int jugar() {
		return r.nextInt(2);
	}

	/**
	 * Devuelve el equipo ganador
	 * 
	 * @return Equipo ganador
	 */
	public Equipo ganador() {
		return (ganador == 0) ? local : visitante;
	}

	/**
	 * Devuelve el equipo perdedor
	 * 
	 * @return Equipo perdedor
	 */
	public Equipo perdedor() {
		return (ganador == 1) ? local : visitante;
	}
}
