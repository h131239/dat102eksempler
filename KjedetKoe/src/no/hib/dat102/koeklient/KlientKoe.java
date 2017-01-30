package no.hib.dat102.koeklient;

import no.hib.dat102.KjedetKoe;

public class KlientKoe {
	public static void main(String[] args) {
		
		KjedetKoe<Character> tegnKoe = new KjedetKoe<Character>();

		String streng = " Denne køen er en kø av strengobjekter, FIFO-datastruktur";
		System.out.println(streng);
		
		int lengde = streng.length();

		for (int i = 0; i < lengde; i++) {
			tegnKoe.innKoe(new Character(streng.charAt(i)));
		}
		while (!tegnKoe.erTom()) {
			Character tegn_obj = tegnKoe.utKoe();
			System.out.print(tegn_obj);
		}

	}

}// class
