package es.arelance.criaturas;

import java.util.Random;

/**
 * Clase que representa a una criatura
 * 
 * @author Francisco Molina Sanchez
 *
 */
public abstract class Criatura {
	private int vidaMaxima;
	private int vidaActual;
	private int fuerza;
	private String nombre;
	private Random r;

	/**
	 * Constructor para criatura
	 * 
	 * @param nombre
	 *            nombre de la criatura
	 * @param vida
	 *            vida maxima de la criatura
	 * @param fuerza
	 *            fuerza maxima dela criatura
	 */
	public Criatura(String nombre, int vida, int fuerza) {
		this.nombre = nombre;
		this.vidaMaxima = vida;
		this.vidaActual = vida;
		this.fuerza = fuerza;
		r = new Random();
	}

	public int getFuerza() {
		return fuerza;
	}

	public int getVidaActual() {
		return this.vidaActual;
	}

	public void setVidaActual(int vidaActual) {
		this.vidaActual = vidaActual;
	}

	/**
	 * Cura a una criatura una cantidad aleatoria
	 */
	public void recuperar() {
		int vidaRecuperable = this.vidaMaxima - this.vidaActual;
		if (vidaRecuperable >= 1) {
			this.vidaActual += r.nextInt(vidaRecuperable + 1) + 1;
		}
	}

	/**
	 * Devueve la vida actual de la criatura a su maximo posible, la vida maxima
	 */
	public void descansar() {
		this.vidaActual = this.vidaMaxima;
	}

	/**
	 * Hace luchar a 2 criaturas hasta que una muera
	 * 
	 * @param c
	 *            segunda criatura
	 */
	public void luchar(Criatura c) {
		// Sobre el método luchar, cosas a tener en cuenta.
		// o La criatura sobre la que se lanza el mensaje inicia el duelo.
		// o Una criatura muerta no puede golpear.
		// o Una criatura no golpea sobre una criatura muerta.
		// o Una criatura se considera muerta si su vida es menor que 0.
		while (this.vidaActual > 0 && c.vidaActual > 0) {
			c.vidaActual -= this.fuerza;
			if (c.vidaActual > 0) {
				this.vidaActual -= c.fuerza;
			}
			if (c.vidaActual < 0) {
				c.vidaActual = 0;
			}
			if (this.vidaActual < 0) {
				this.vidaActual = 0;
			}
		}
	}

	@Override
	public String toString() {
		return "Criatura [vidaMaxima=" + vidaMaxima + ", vidaActual=" + vidaActual + ", fuerza="
				+ fuerza + ", nombre=" + nombre + "]";
	}

}
