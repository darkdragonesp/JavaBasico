package es.arelance.ficheros;

import java.io.*;
/**
 * Lee un fichero de texto y lo copia a otro fichero de texto
 * @author Francisco Molina Sanchez
 *
 */


class CopiaTexto {
	private static String ficheroOrigen = "C:\\vehiculo.txt";
	private static String ficheroDestino = "C:\\archivo_copia.txt";
	
	public static void main(String[] arg) {
		File archivo = null;
		FileReader fr = null;
		BufferedReader br = null;

		FileWriter fichero = null;
		PrintWriter pw = null;

		try {
			// Apertura del fichero y creacion de BufferedReader para poder
			// hacer una lectura comoda (disponer del metodo readLine()).
			archivo = new File(ficheroOrigen);
			fr = new FileReader(archivo);
			br = new BufferedReader(fr);

			fichero = new FileWriter(ficheroDestino);
			pw = new PrintWriter(fichero);

			// Lectura del fichero
			String linea;
			while ((linea = br.readLine()) != null)
				pw.println(linea);
			// System.out.println(linea);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// En el finally cerramos el fichero, para asegurarnos
			// que se cierra tanto si todo va bien como si salta
			// una excepcion.
			try {
				if (null != fr) {
					fr.close();
				}
				if (null != fichero)
					fichero.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
}