package no.hib.dat102.klient;
import no.hib.dat102.TabellStabel;

public class StabelKlient {
	public static void main(String[] args){
		
		String str = "netsket re etteD";
		int lengde = str.length();
		TabellStabel<Character>tegnStabel = new TabellStabel<Character>();
		for(int i = 0; i < lengde; i++){
			tegnStabel.push(new Character(str.charAt(i)));
		}
		System.out.println(str);
		while(!tegnStabel.erTom()){
			Character tegn = tegnStabel.pop();
			System.out.print(tegn);
		}
		System.out.println();		
	}


}// class
