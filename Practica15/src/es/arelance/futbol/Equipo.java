package es.arelance.futbol;

/**
 * Clase que representa un equipo
 * 
 * @author Francisco Molina Sanchez
 *
 */
public class Equipo implements Comparable<Equipo> {
	// Construir una clase Equipo con un nombre, ciudad, a�o de fundaci�n y
	// n�mero de t�tulos. Esta clase deber� disponer de definiciones
	// adecuadas de los m�todos equals en funci�n de los nombres y
	// compareTo en funci�n del n�mero de t�tulos y en caso de igualdad en
	// funci�n del a�o de fundaci�n.
	private String nombre;
	private String ciudad;
	private int anyoFundacion;
	private int numeroTitulos;

	/**
	 * Constructor del equipo
	 * 
	 * @param nombre
	 *            nombre del equipo
	 * @param ciudad
	 *            ciudad del equipo
	 * @param anyoFundacion
	 *            a�o de fundacion del equipo
	 * @param numeroTitulos
	 *            cantidad de titulos que tiene el equipo
	 */
	public Equipo(String nombre, String ciudad, int anyoFundacion, int numeroTitulos) {
		this.nombre = nombre;
		this.ciudad = ciudad;
		this.anyoFundacion = anyoFundacion;
		this.numeroTitulos = numeroTitulos;
	}

	@Override
	public int compareTo(Equipo o) {
		int res= -this.numeroTitulos + (o.numeroTitulos);
		if(res==0) {
			res=Integer.valueOf(anyoFundacion).compareTo(o.anyoFundacion);
		}
		return res;
	}
//TODO equals y hashcode con coleccion
	public int getNumeroTitulos() {
		return numeroTitulos;
	}

	@Override
	public String toString() {
		return "Equipo [nombre=" + nombre + ", ciudad=" + ciudad + ", anyoFundacion="
				+ anyoFundacion + ", numeroTitulos=" + numeroTitulos + "]";
	}

}
