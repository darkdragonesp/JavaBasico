package es.arelance.criaturas;
/**
 * Clase de prueba que crea criaturas y hace que luchen.
 * @author Francisco Molina Sanchez
 *
 */
public class Test {
	public static void main(String[] args) {
		Criatura enano = new Enano("Enano");
		Criatura elfo = new Elfo("Elfo");
		
		System.out.println(enano+"    vs.   \n"+elfo+"\n--------");
		
		enano.luchar(elfo);
		System.out.println("Ronda 1: \n"+enano+" vs. \n"+elfo);
		
		elfo.recuperar();
		System.out.println("El perdedor recupera vida.");
		enano.luchar(elfo);
		System.out.println("Ronda 2: \n"+enano+" vs. \n"+elfo);
	}
}
