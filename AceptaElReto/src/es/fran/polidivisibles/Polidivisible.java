package es.fran.polidivisibles;

public class Polidivisible {
	private int numero;
	private int digitosTotal;
	private int digitosFaltantes;

	public Polidivisible(int numero, int digitosTotal) {
		super();
		this.numero = numero;
		this.digitosTotal = digitosTotal;
		this.digitosFaltantes = digitosTotal - String.valueOf(numero).length();
	}

	private boolean esMultiplo(int numero, int multiplo) {
		return numero % multiplo == 0;
	}

	private boolean esPolidivisible(int numero) {
		boolean res = true;
		if (numero <= 0) {
			res = false;
		} else {
			int longitud = String.valueOf(numero).length();
			String numeroCadena = Integer.toString(numero);
			for (int i = 1; i < longitud; i++) {
				int numeroProbar = Integer.parseInt(numeroCadena.substring(0, i + 1));
				if (!esMultiplo(numeroProbar, i + 1)) {
					res = false;
				}
			}

		}
		return res;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String buscarPolidivisibles() {
		String res = "";

		if (esPolidivisible(numero)) {
			res += this.numero + "\n";
			
		}


//		for (int i = 0; i < 10; i++) {
//			int temporal = Integer.parseInt(Integer.toString(numero)+Integer.toString(i));
//			if (this.esPolidivisible(temporal)) {
//				res += temporal + "\n";
//			}
		
//		}
		
		
		int fin= (int) (Math.pow(10, this.digitosFaltantes)-1)*10;
		for (int j = 10; j <= fin; j++) {
			int temporal = Integer.parseInt(Integer.toString(numero)+Integer.toString(j).substring(1));
			
			if (this.esPolidivisible(temporal)) {
				res += temporal + "\n";
			}
			
			
		}

		res+= "---";
		return res;
	}
	// 2016
	// ---
	// 2016
	// 20160
	// 20165
	// ---
	// 2016
	// 20160
	// 201600
	// 201606
	// 20165
	// 201654
	// ---

	
}
