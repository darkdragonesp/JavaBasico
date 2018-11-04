package es.arelance.calendario;

//import java.util.Calendar;
//import java.util.GregorianCalendar;

/**
 * Clase que representa una fecha
 * 
 * @author Francisco Molina Sanchez
 *
 */
public class Fecha {
//	private static final int MAX_VALID_YR = 999999;
//	private static final int MIN_VALID_YR = 0;
//	private Calendar fecha;
//
//	/**
//	 * Constructor dado los datos
//	 * 
//	 * @param dia
//	 *            dia
//	 * @param mes
//	 *            mes
//	 * @param anyo
//	 *            año
//	 */
//	public Fecha(int dia, int mes, int anyo) {
//		this.fecha=new GregorianCalendar(anyo,mes,dia);
//	}
//
//	public int getDia() {
//		return fecha.get(Calendar.DAY_OF_MONTH);
//	}
//
//	public int getMes() {
//		return fecha.get(Calendar.MONTH);
//	}
//
//	public int getAnyo() {
//		return fecha.get(Calendar.YEAR);
//	}
//
//	@Override
//	public String toString() {
//		return fecha.toString();
//	}
//
//	/**
//	 * Calcula si un año es bisiesto
//	 * 
//	 * @param a
//	 *            año
//	 * @return true si es bisiesto, si no false
//	 */
//	public static boolean esBisiesto(int a) {
//		return new GregorianCalendar().isLeapYear(a);
//	}
//
//	/**
//	 * Calcula el numero de dias de un año si es bisiesto o no
//	 * 
//	 * @param a
//	 *            año
//	 * @return numero de dias
//	 */
//	public static int numeroDeDias(int a) {
////		return esBisiesto(a) ? 366 : 365;
//		return new GregorianCalendar().getActualMaximum(Calendar.DAY_OF_YEAR);
//	}
//
//	/**
//	 * Calcula el numero de dias de un mes dado el año
//	 * 
//	 * @param m
//	 *            mes
//	 * @param a
//	 *            año
//	 * @return numero de dias del mes
//	 */
//	public static int numeroDeDias(int m, int a) {
//		int res = 31;
//		switch (m) {
//		case 4:
//		case 6:
//		case 9:
//		case 11:
//			res = 30;
//			break;
//		case 2:
//			res = esBisiesto(a) ? 29 : 28;
//			break;
//		}
//		return res;
//	}
//
//	/**
//	 * Calcula el numero de dias transcurrido del año dado hasta el dia dado
//	 * 
//	 * @return numero de dias transcurrido
//	 */
//	public int diasTranscurridosDelAnyo() {
//		int res = this.dia;
//		for (int i = 1; i < this.mes; i++) {
//			res += numeroDeDias(i, this.anyo);
//		}
//		return res;
//	}
//
//	/**
//	 * Calcula el numero de dias restante desde el dia dado hasta final de año
//	 * 
//	 * @return numero de dias restante
//	 */
//	public int diasRestantesDelAnyo() {
//		int res = numeroDeDias(this.mes, this.anyo) - this.dia;
//		for (int i = this.mes + 1; i < 13; i++) {
//			res += numeroDeDias(i, this.anyo);
//		}
//		return res;
//	}
//
//	/**
//	 * Calcula la diferencia de dias entre dos fechas
//	 * 
//	 * @param f
//	 *            segunda fecha
//	 * @return numero de dias de diferencia
//	 */
//	// se puede hacer mas facil con dia siguietne y dia anterior comparando la fecha
//	// a la que hay que llegar
//	public int diferenciaDeDiasCon(Fecha f) {
//		int res = 0;
//		if (this.getAnyo() == f.getAnyo() && this.getMes() == f.getMes()) {
//			res = Math.abs(this.getDia() - f.getDia());
//		} else if (this.getAnyo() == f.getAnyo()) {
//			res = this.diasRestantesDiferenteMes(f);
//		} else {// diferente año
//			res = this.diasRestantesDiferenteAnyo(f);
//
//		}
//		return res;
//	}
//
//	/**
//	 * Cambia la fecha actual al dia siguiente
//	 */
//	public void diaSiguiente() {
//		int diasDelmes = numeroDeDias(this.mes, this.anyo);
//		if (diasDelmes == this.dia) {
//			this.dia = 1;
//			if (this.mes == 12) {
//				this.mes = 1;
//				this.anyo++;
//			} else {
//				this.mes++;
//			}
//		} else {
//			this.dia++;
//		}
//	}
//
//	/**
//	 * Cambia la fecha actual al dia anterior
//	 */
//	public void diaAnterior() {
//		if (this.dia == 1) {
//			if (this.mes == 1) {
//				this.dia = numeroDeDias(12, this.anyo - 1);
//				this.mes = 12;
//				this.anyo--;
//			} else {
//				this.dia = numeroDeDias(this.mes - 1, this.anyo);
//				this.mes--;
//			}
//		} else {
//			this.dia--;
//		}
//
//	}
//
//	/**
//	 * Traslada la fecha actual ndias
//	 * 
//	 * @param ndias
//	 *            dias que se traslada la fecha
//	 */
//	public void trasladar(int ndias) {
//		if (ndias < 0) {
//			for (int i = 0; i < Math.abs(ndias); i++) {
//				this.diaAnterior();
//			}
//		} else {
//			for (int i = 0; i < ndias; i++) {
//				this.diaSiguiente();
//			}
//		}
//
//	}
//
//	/**
//	 * Calcula los dias restantes para terminar o los dias que han trasncurrido para
//	 * 2 fechas segun su orden
//	 * 
//	 * @param f
//	 *            segunda fecha
//	 * @return suma de los dias restantes y transcurridos
//	 */
//	private int diasRestantesDiferenteAnyo(Fecha f) {
//		int res = 0;
//		if (this.getAnyo() < f.getAnyo()) {
//			res += this.diasRestantesDelAnyo();
//			res += f.diasTranscurridosDelAnyo();
//		} else {
//			res += f.diasRestantesDelAnyo();
//			res += this.diasTranscurridosDelAnyo();
//		}
//		// sumar años de diferencia
//		int anyoMenor = (this.getAnyo() < f.getAnyo()) ? this.getAnyo() : f.getAnyo();
//		int anyoMayor = (this.getAnyo() > f.getAnyo()) ? this.getAnyo() : f.getAnyo();
//		for (int i = anyoMenor + 1; i < anyoMayor; i++) {
//			res += Fecha.numeroDeDias(i);
//		}
//		return res;
//	}
//
//	/**
//	 * Devuelve true si una fecha es valida;en otro caso false
//	 * 
//	 * @param d
//	 *            dia
//	 * @param m
//	 *            mes
//	 * @param y
//	 *            año
//	 * @return true si es valida la fecha;en otro caso false
//	 */
//	private static boolean isValidDate(int d, int m, int y) {
//		// If year, month and day
//		// are not in given range
//		if (y > MAX_VALID_YR || y < MIN_VALID_YR)
//			return false;
//		if (m < 1 || m > 12)
//			return false;
//		if (d < 1 || d > 31)
//			return false;
//
//		// Handle February month
//		// with leap year
//		if (m == 2) {
//			if (esBisiesto(y))
//				return (d <= 29);
//			else
//				return (d <= 28);
//		}
//
//		// Months of April, June,
//		// Sept and Nov must have
//		// number of days less than
//		// or equal to 30.
//		if (m == 4 || m == 6 || m == 9 || m == 11)
//			return (d <= 30);
//
//		return true;
//	}
//
//	/**
//	 * Calcula los dias restantes y transcurridos del mes para dos fechas
//	 * 
//	 * @param f
//	 *            otra fecha
//	 * @return la suma de los dias restantes
//	 */
//	private int diasRestantesDiferenteMes(Fecha f) {
//		int res = 0;
//		if (this.getMes() < f.getMes()) {
//			// dias restante del mes actual
//			res += numeroDeDias(mes, anyo) - this.dia;
//			// dias que faltan del mes f
//			res += f.getDia();
//		} else {
//			// dias restante del mes actual
//			res += numeroDeDias(f.getMes(), f.getAnyo()) - f.getDia();
//			// dias que faltan del mes f
//			res += this.dia;
//		}
//		// sumar meses de diferencia
//		int mesMenor = (this.getMes() < f.getMes()) ? this.getMes() : f.getMes();
//		int mesMayor = (this.getMes() > f.getMes()) ? this.getMes() : f.getMes();
//		for (int i = mesMenor + 1; i < mesMayor; i++) {
//			res += Fecha.numeroDeDias(i, this.getAnyo());
//		}
//		return res;
//	}
}
