package es.arelance.temperatura;

import java.util.Random;
/**
 * La clase Sala.
 * 
 * @author Francisco Molina Sanchez
 * 
 */
public class Sala {

	// Maximo posible de temperatura
	private static final int LIMITE_TEMPERATURA_MAXIMO = 90;
	// Minimo posible de temperatura
//	private static final int LIMITE_TEMPERATURA_MINIMO = 0;
	
	private Random temperatura;

	/**
	 * Crea una sala e inicializa la temperatura
	 */
	public Sala() {
		temperatura = new Random();
	}

	/**
	 * Obtiene la temperatura actual.
	 *
	 * @return la temperatura
	 */
	public int getTemperatura() {
		return this.temperatura.nextInt(Sala.LIMITE_TEMPERATURA_MAXIMO + 1);
	}
}
