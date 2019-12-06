package fr.formation.basics.tp1;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] myFirstName = {"L", "U", "C", "Y"};
		
		System.out.println("Il y a " + myFirstName.length + " lettres dans mon prénom");
		
		for (String i : myFirstName) {
			System.out.println(i);
		}
		
	}
}
