package es.arelance.ficheros;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
/**
 * Lee un fichero binario y lo copia a otro fichero binario
 * @author Francisco Molina Sanchez
 *
 */
public class CopiaBinaria {
	private static String ficheroOrigen = "C:\\vehiculo.txt";
	private static String ficheroDestino = "C:\\archivo_copia2.txt";
	
	public static void main(String[] args) {
		copia(ficheroOrigen, ficheroDestino);
	}

	public static void copia(String ficheroOriginal, String ficheroCopia) {
		try {
			// Se abre el fichero original para lectura
			FileInputStream fileInput = new FileInputStream(ficheroOriginal);
			BufferedInputStream bufferedInput = new BufferedInputStream(fileInput);

			// Se abre el fichero donde se hará la copia
			FileOutputStream fileOutput = new FileOutputStream(ficheroCopia);
			BufferedOutputStream bufferedOutput = new BufferedOutputStream(fileOutput);

			// Bucle para leer de un fichero y escribir en el otro.
			byte[] array = new byte[1000];
			int leidos = bufferedInput.read(array);
			while (leidos > 0) {
				bufferedOutput.write(array, 0, leidos);
				leidos = bufferedInput.read(array);
			}

			// Cierre de los ficheros
			bufferedInput.close();
			bufferedOutput.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
