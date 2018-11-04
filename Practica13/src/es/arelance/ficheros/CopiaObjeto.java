package es.arelance.ficheros;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Escribe un objeto vehiculo en un fichero de texto y luego lo lee y lo escribe
 * por pantalla
 * 
 * @author Francisco Molina Sanchez
 *
 */
public class CopiaObjeto {
//	private static String ficheroOrigen = "C:\\vehiculo.txt";
	private static String ficheroDestino = "C:\\archivo_copia2.txt";
	private static DataOutputStream dataOutputStream;
	private static DataInputStream dataInputStream;

	public static void main(String[] args) {

		try {
			dataOutputStream = new DataOutputStream(new FileOutputStream(ficheroDestino));

			Vehiculo vehiculo = new Vehiculo("MA1923AU", "azul", true, 19000);
			dataOutputStream.writeUTF(vehiculo.getMatricula());
			dataOutputStream.writeUTF(vehiculo.getColor());
			dataOutputStream.writeBoolean(vehiculo.isReservado());
			dataOutputStream.writeDouble(vehiculo.getPrecio());

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {

			try {
				dataOutputStream.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		try {
			dataInputStream = new DataInputStream(new FileInputStream(ficheroDestino));

			String matricula = dataInputStream.readUTF();
			String color = dataInputStream.readUTF();
			Boolean reservado = dataInputStream.readBoolean();
			Double precio = dataInputStream.readDouble();

			dataInputStream.close();
			Vehiculo vehiculo2 = new Vehiculo(matricula, color, reservado, precio);
			System.out.println(vehiculo2);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
