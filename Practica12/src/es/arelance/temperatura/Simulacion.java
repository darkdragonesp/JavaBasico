package es.arelance.temperatura;

import java.util.concurrent.TimeUnit;

/**
 * Clase simulacion que pone en funcionamiento el sistema sala-controlador
 * 
 * @author Francisco Molina Sanchez
 */
public class Simulacion {

	/** Veces que puede saltar la alarma por calor */
	private static final int LIM_CALOR = 5;

	/** Veces que puede saltar la alarma por frio */
	private static final int LIM_FRIO = 5;

	public static void main(String[] args) {
		// • Clase Simulacion: clase ejecutable que contendrá un bucle donde se irá
		// controlando la temperatura. El bucle debe tener una parada para cada
		// iteración de duración 1 segundo. El programa finalizará cuando salten un
		// número de 5 alertas por demasiado frío o 15 alertas por demasiado calor.
		Controlador controlador = new ControladorMemoria();
		boolean fin = false;
		int contFrio = 0;
		int contCalor = 0;

		while (!fin) {
			try {
				controlador.controlar();
			} catch (DemasiadoFrioException e) {
				// System.out.println(e.getMessage());
				System.out.println("Mensaje a interfaz o usuario: Demasiado frio");
				contFrio++;
				// e.printStackTrace();
			} catch (DemasiadoCalorException e) {
				// System.out.println(e.getMessage());
				System.out.println("Mensaje a interfaz o usuario: Demasiado calor");
				contCalor++;
				// e.printStackTrace();
			} finally {
				fin = contFrio >= LIM_FRIO || contCalor >= LIM_CALOR;
				try {
					TimeUnit.SECONDS.sleep(1);
				} catch (InterruptedException e) {
					;
				}
				// Thread.sleep(1000);
				System.out.println("MEMORIA " + ((ControladorMemoria)controlador).getMemoria());
			}
		}

		if (contFrio >= 5) {
			System.out.println("Salida por frio...");
		} else {
			System.out.println("Salida por calor...");
		}
	}

}
