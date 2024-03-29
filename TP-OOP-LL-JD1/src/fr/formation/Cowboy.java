package fr.formation;

import java.util.Objects;

public class Cowboy {

    private final String name;

    private int energy;

    private final Weapon weapon;

    /**
     * Construit une instance de {@code Cowboy} avec les valeurs sp�cifi�es.
     *
     * @param name
     *            le nom du cowboy
     * @param bullets
     *            la quantit� d'�nergie du cowboy (sa vie en d'autres termes)
     * @param weapon
     *            une arme
     * @throws NullPointerException
     *             si {@code name} ou {@code weapon} est {@code null}
     * @throws IllegalArgumentException
     *             si {@code energy} est {@code < 1} ou {@code > 100}
     */
    public Cowboy(String name, int energy, Weapon weapon) {
    	Objects.requireNonNull(name, "name cannot be null");
    	if (energy < 1 || energy > 100) {
    		throw new IllegalArgumentException(
    				"energy out of range [1-100]: " + energy);
    	}
    	Objects.requireNonNull(weapon, "weapon cannot be null");
    	this.name = name;
    	this.energy = energy;
    	this.weapon = weapon;
    }

    /**
     * Fait utiliser son arme par ce cowboy sur un autre cowboy sp�cifi� en
     * param�tre ({@code target}), si et seulement si la cible n'est pas d�j�
     * morte.
     * <p>
     * Si la cible n'est pas morte et qu'un coup part alors l'�nergie de la
     * cible est r�duite du nombre de d�g�ts caus� par l'arme. L'�nergie d'un
     * cowboy ne peut pas �tre n�gative. Autrement dit, s'il reste 2 points
     * d'�nergie � un cowboy et qu'il encaisse un tire dont la balle cause 3
     * points de d�g�t, son �nergie atteint 0 et non -1.
     *
     * @param target
     *            un cowboy cible sur lequel tirer
     * @see Weapon#fire()
     */
    public void shoot(Cowboy target) {
	// To be implemented
    	
    	if (this.isDead() != true && target.isDead() == false) {
    		//System.out.println(this.name + " tire sur " + target.name);
    		target.energy -= this.weapon.fire();
    		//System.out.println("balles: " + this.weapon.getBullets());
    		if (target.energy <= 0) {
    			target.energy = 0;
    			//System.out.println(target.name + " est mort.");
    		}
    		//System.out.println(target.name + " vie: " + target.energy);
    		//System.out.println(target.isDead());
    	}
    }

    /**
     * Indique si ce {@code cowboy} est mort ou non.
     *
     * @return {@code true} s'il est mort; {@code false} sinon
     */
    public boolean isDead() {
	// To be implemented
    	if (this.energy == 0) {
    		return true;
    	} else {
    		return false;
    	}
    }

    @Override
    public String toString() {
    	return "{name=" + name + ", energy=" + energy + ", weapon=" + weapon
    			+ ", dead=" + isDead() + "}";
    }
}
