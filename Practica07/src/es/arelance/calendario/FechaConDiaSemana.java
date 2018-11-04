package es.arelance.calendario;

/**
 * Clase que representa una fecha con dia de la semana
 * 
 * @author Francisco Molina Sanchez
 *
 */
public class FechaConDiaSemana extends Fecha {
	private final static Fecha LUNES = new Fecha(29, 10, 2018);
	private final static String[] DIASEMANA = { "Lunes", "Martes", "Miercoles", "Jueves",
			"Viernes", "Sabado", "Domingo" };

	private int nDiaSemana;

	/**
	 * Constructor para fecha con dia de la semana que calcula el dia de la semana
	 * 
	 * @param dia
	 *            dia
	 * @param mes
	 *            mes
	 * @param anyo
	 *            año
	 */
	public FechaConDiaSemana(int dia, int mes, int anyo) {
		super(dia, mes, anyo);
		nDiaSemana = this.calcularDiaSemana();
	}

	public int getnDiaSemana() {
		return nDiaSemana;
	}

	/**
	 * Calcula el dia de la semana
	 * 
	 * @return entero de 0 a 6 que representa el dia de la semana
	 */
	private int calcularDiaSemana() {
		int diferenciaDias = this.diferenciaDeDiasCon(LUNES);
		int res = 0;
		if (this.getAnyo() > LUNES.getAnyo() || this.getMes() > LUNES.getMes()
				|| this.getDia() >= LUNES.getDia()) {
			res = diferenciaDias % 7;
		} else {
			res = (-diferenciaDias) % 7 + 7;
		}
		return res;
	}

	@Override
	public void diaSiguiente() {
		super.diaSiguiente();
		nDiaSemana = this.calcularDiaSemana();
	}

	@Override
	public void diaAnterior() {
		super.diaAnterior();
		nDiaSemana = this.calcularDiaSemana();
	}

//	@Override
//	public void trasladar(int ndias) {
//		super.trasladar(ndias);
//		nDiaSemana = this.calcularDiaSemana();
//	} No es necesario ya que usa dia siguiente anterior del hijo

	@Override
	public String toString() {
		return super.toString() + " " + DIASEMANA[this.nDiaSemana];
	}
}
