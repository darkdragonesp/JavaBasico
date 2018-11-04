package es.arelance.test;

import java.util.Scanner;

import es.arelance.concesionario.Coche;
import es.arelance.concesionario.ColorVehiculo;
import es.arelance.concesionario.Concesionario;
import es.arelance.concesionario.Moto;
import es.arelance.concesionario.Vehiculo;

/**
 * Menu interactivo para el concesionario
 * 
 * @author Francisco molina Sanchez
 *
 */
public class Menu {
	private static Concesionario concesionario;
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		concesionario = new Concesionario("Concesionario 1",
				"Calle arelance", "9999999");
		// Vehiculo vehiculo1 = new Coche("vw1", ColorVehiculo.BLANCO, false, 2, 0,
		// false);
		// Vehiculo vehiculo2 = new Coche("vw2", ColorVehiculo.BLANCO, false, 2, 0,
		// false);
		// Vehiculo vehiculo3 = new Coche("vw3", ColorVehiculo.BLANCO, false, 2, 0,
		// false);
		// Vehiculo vehiculo4 = new Moto("honda1", ColorVehiculo.BLANCO, false, 2, 0);
		// Vehiculo vehiculo5 = new Moto("honda2", ColorVehiculo.VERDE, false, 2, 0);
		//
		// concesionario.introducirVehiculo(vehiculo1);
		// concesionario.introducirVehiculo(vehiculo2);
		// concesionario.introducirVehiculo(vehiculo3);
		// concesionario.introducirVehiculo(vehiculo4);
		// concesionario.introducirVehiculo(vehiculo5);
		controladormenu();
	}

	/**
	 * Muestra el menu principal
	 */
	private static void mostrarMenu() {
		System.out.println(
				"\n\n*+*+*+*+*+*+*+*+*+*+*\n1. Introducir coche \n"
						+ "2. Introducir moto \n" + "3. Ver vehículos \n"
						+ "4. Reservar por matrícula \n"
						+ "5. Buscar por matrícula\n"
						+ "0. Salir\n*+*+*+*+*+*+*+*+*+*+*\n");
	}

	/*
	 * Controla el menu principal y llama a los submenus
	 */
	private static void controladormenu() {

		// delimitador es solo ENTER (no espacios)
		sc.useDelimiter(System.lineSeparator());
		String opcion;
		do {
			mostrarMenu();
			opcion = sc.next();
			switch (opcion.trim()) {// quitar enter del string
			case "1":
				introducirCoche();
				break;
			case "2":
				introducirMoto();
				break;
			case "3":
				verVehiculos();
				break;
			case "4":
				reservarPorMatricula();
				break;
			case "5":
				buscarPorMatricula();
				break;
			default:
				break;
			}

		} while (!opcion.equals("0"));

		sc.close();
	}

	/*
	 * Pide los datos necesarios para buscar por matricula e imprime el vehiculo si
	 * lo encuentra
	 */
	private static void buscarPorMatricula() {

		System.out.println("Introduzca la matricula:");
		String matricula = sc.next();

		Vehiculo vehiculo = concesionario.buscar(matricula);
		if (vehiculo != null) {
			System.out.println(vehiculo);
		} else {
			System.out.println("No encontrado.");
		}

	}

	/**
	 * Reserva un vehiculo y lo muestra si existe
	 */
	private static void reservarPorMatricula() {

		System.out.println("Introduzca la matricula:");
		String matricula = sc.next();

		Vehiculo vehiculo = concesionario.reservar(matricula);
		if (vehiculo != null) {
			System.out
					.println("Vehiculo reservado con exito.\n" + vehiculo);
		} else {
			System.out.println("Vehiculo no encontrado");
		}

	}

	/**
	 * Permite ver los vehiculos en el concesionario, ademas de filtrar por
	 * matricula, color y precio
	 */
	private static void verVehiculos() {

		String filtroMatriculaCadena = null;
		boolean filtroMatricula;
		ColorVehiculo colorEnum = null;
		boolean color;
		int precioMinimo = -1;
		int precioMaximo = -1;
		boolean precio;

		System.out.println(concesionario.verVehiculos());

		System.out.println("¿Filtrar por matricula?(S/N)");
		filtroMatricula = sc.next().equalsIgnoreCase("S") ? true : false;
		if (filtroMatricula) {
			System.out.println("Introduzca matricula:");
			filtroMatriculaCadena = sc.next();
		}
		System.out.println("¿Filtrar por color?(S/N)");
		color = sc.next().equalsIgnoreCase("S") ? true : false;
		if (color) {
			System.out.println("Introduzca el color");
			String colorCadena = sc.next().toUpperCase();
			colorEnum = ColorVehiculo.valueOf(colorCadena);
		}
		System.out.println("¿Filtrar por precio?(S/N)");
		precio = sc.next().equalsIgnoreCase("S") ? true : false;
		if (precio) {
			System.out.println("Introduzca precio minimo:");
			precioMinimo = sc.nextInt();
			System.out.println("Introduzca precio maximo:");
			precioMaximo = sc.nextInt();
		}
		if (filtroMatricula || color || precio) {

			System.out.println(
					concesionario.filtrarPrecio(filtroMatriculaCadena,
							colorEnum, precioMinimo, precioMaximo));
		}

	}

	/**
	 * Permite introducir motos a traves del menu interactivo
	 */
	private static void introducirMoto() {
		try {
			Vehiculo moto;

			System.out.println("Introduzca la matricula:");
			String matricula = sc.next();
			System.out.println("Introduzca el color");
			String color = sc.next().toUpperCase();
			ColorVehiculo colorEnum = ColorVehiculo.valueOf(color);
			System.out.println("Introduzca si esta reservado (S/N)");
			boolean reservado = sc.next().equalsIgnoreCase("S") ? true
					: false;
			System.out.println("Introduzca el precio");
			double precio = sc.nextDouble();
			System.out.println("Introduzca la cilindrada");
			int cilindrada = sc.nextInt();

			moto = new Moto(matricula, colorEnum, reservado, precio,
					cilindrada);
			concesionario.introducirVehiculo(moto);
			System.out.println("Moto introducida correctamente:\n" + moto);
		} catch (NumberFormatException e) {
			System.out.println("Introduzca un numero valido");
		} catch (IllegalArgumentException e) {
			System.out.println("Introduzca un color valido");
		} catch (Exception e) {
			System.out.println("Dato erroneo. Intentelo otra vez");
		}
	}

	/**
	 * Permite introducir coches a traves del menu interactivo
	 */
	private static void introducirCoche() {

		try {
			Vehiculo coche;

			System.out.println("Introduzca la matricula:");
			String matricula = sc.next();
			System.out.println("Introduzca el color");
			String color = sc.next().toUpperCase();
			ColorVehiculo colorEnum = ColorVehiculo.valueOf(color);
			System.out.println("Introduzca si esta reservado (S/N)");
			boolean reservado = sc.next().equalsIgnoreCase("S") ? true
					: false;
			System.out.println("Introduzca el precio");
			double precio = sc.nextDouble();
			System.out.println("Introduzca el numero de plazas");
			int plazas = sc.nextInt();
			System.out.println("Introduzca si contiene extras(S/N)");
			boolean extras = sc.next().equalsIgnoreCase("S") ? true
					: false;

			coche = new Coche(matricula, colorEnum, reservado, precio,
					plazas, extras);
			concesionario.introducirVehiculo(coche);
			System.out
					.println("Coche introducido correctamente:\n" + coche);
		} catch (NumberFormatException e) {
			System.out.println("Introduzca un numero valido");
		} catch (IllegalArgumentException e) {
			System.out.println("Introduzca un color valido");
		} catch (Exception e) {
			System.out.println("Dato erroneo. Intentelo otra vez");
		}
	}
}
