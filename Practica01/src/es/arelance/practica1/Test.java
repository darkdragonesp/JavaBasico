package es.arelance.practica1;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String escribirZ = null;

		System.out.println("HOLA");

		int x = 1;
		int y = 9;
		int z;

		/*
		 * Si x<y imprimir por pantalla MENOR, si x=y imprimir IGUAL, en otro caso
		 * imprimir MAYOR Utilizar el valor de la variable mayor para inicializar la
		 * variable z Imprimir los valores numéricos que hay de diferencia entre la
		 * variable menor y la variable mayor
		 */
		if (x < y) {
			System.out.println("MENOR");
			z = y;
			for (int i = x + 1; i < y; i++) {
				System.out.print(i + ",");
			}
		} else if (x == y) {
			System.out.println("IGUAL");
			z = x;
		} else {
			System.out.println("MAYOR");
			z = x;
			for (int i = y + 1; i < x; i++) {
				System.out.print(i + ",");
			}

		}
		System.out.println();

		/*
		 * Imprimir la cadena que corresponda al número en español en función del valor
		 * de z
		 */
		switch (z) {
		case 0:
			escribirZ = "Cero";
			break;
		case 1:
			escribirZ = "Uno";
			break;
		case 2:
			escribirZ = "Dos";
			break;
		case 3:
			escribirZ = "Tres";
			break;
		case 4:
			escribirZ = "Cuatro";
			break;
		case 5:
			escribirZ = "Cinco";
			break;
		case 6:
			escribirZ = "Seis";
			break;
		case 7:
			escribirZ = "Siete";
			break;
		case 8:
			escribirZ = "Ocho";
			break;
		case 9:
			escribirZ = "Nueve";
			break;
		case 10:
			escribirZ = "Diez";
			break;
		default:
			break;
		}
		System.out.println("Z es " + escribirZ);

	}

}
