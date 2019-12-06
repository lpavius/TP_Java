package fr.formation;

public class Application {

    public static void main(String[] args) {
    	
    	Cowboy luckyLuke = createLuckyLuke();
    	Cowboy joeDalton = createJoeDalton();

    	System.out.println("Before shooting:");
    	
    	print(luckyLuke, joeDalton);
    	shootUntilDeath(luckyLuke, joeDalton);
    	
    	System.out.println("After shooting:");
    	print(luckyLuke, joeDalton);
    }

    /**
     * Les cowboys en paramètres se tirent dessus aléatoirement jusqu'à la mort
     * de l'un des deux.
     * <p>
     * Note: plusieurs solutions possibles pour implémenter un tire aléatoire,
     * aller au plus simple.
     */
    
    private static void shootUntilDeath(Cowboy luckyLuke, Cowboy joeDalton) {
	// To be implemented
    	while (luckyLuke.isDead() == false && joeDalton.isDead() == false){
        	luckyLuke.shoot(joeDalton);
        	joeDalton.shoot(luckyLuke);
    	}
    }

    private static Cowboy createLuckyLuke() {
	// To be implemented
    	Weapon weapon = new Weapon("Revolver Colt", 5, 2);
    	Cowboy cowboy = new Cowboy("Lucky Luke", 5, weapon);
    	
    	return cowboy;
    }

    private static Cowboy createJoeDalton() {
	// To be implemented
    	Weapon weapon = new Weapon("Fusil Winchester", 10, 1);
    	Cowboy cowboy = new Cowboy("Joe Dalton", 5, weapon);
    	
    	return cowboy;
    }

    private static void print(Cowboy luckyLuke, Cowboy joeDalton) {
    	
    	System.out.println(luckyLuke);
    	System.out.println(joeDalton);
    	System.out.println();
    }
}
