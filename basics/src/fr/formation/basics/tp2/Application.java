package fr.formation.basics.tp2;

public class Application {

	static int countChars(String src, char value) {
		int i = 0;
		int nbOccurence = 0; // nb de fois que la lettre apparaitra
		
		//  charArt(i) retourne le caractère de la chaîne correspondant
		// à la position indiquée en paramètre
		while (i < src.length()) {
			if (src.charAt(i) == value) {
				nbOccurence++;
			}
			i++;
		}
		return nbOccurence;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Java";
		
		System.out.println(countChars(str, 'J'));
		System.out.println(countChars(str, 'a'));
		System.out.println(countChars(str, 'v'));
		System.out.println(countChars(str, 'x'));
	}
}