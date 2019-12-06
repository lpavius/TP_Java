package fr.formation.basics.tp2;

public class Application {

	static int countChars(String src, char value) {
		int i = 0;
		int nbOccurence = 0; // nb de fois que la lettre apparaitra
		
		//  charArt(i) retourne le caract�re de la cha�ne correspondant
		// � la position indiqu�e en param�tre
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