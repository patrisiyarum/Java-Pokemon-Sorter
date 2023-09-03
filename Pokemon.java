/**
 * Represents a program that represents a Pokemon.
 *
 * @author prumyantseva3
 * @version 13.31
 */
public class Pokemon {
    /**
     * @return this Pokemon's name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the Pokemon.
     *
     * @param name the name of the Pokemon
     */
    public void setName(String name) {
        if (name == null || name.equals("")) {
            this.name = "Pikachu";
        } else {
            this.name = name;
        }
    }

    private String name;

    /**
     * @return this Pokemon's health
     */
    public int getHealth() {
        return health;
    }

    /**
     * Sets the health of the Pokemon.
     *
     * @param health the health of the Pokemon
     */
    public void setHealth(int health) {
        if (health >= 1 && health <= 100) {
            this.health = health;
        } else {
            this.health = 50;
        }

    }

    private int health;

    /**
     * @return this Pokemon's strength
     */
    public int getStrength() {
        return strength;
    }

    /**
     * Sets the strength of the Pokemon.
     *
     * @param strength the strength of the Pokemon
     */
    public void setStrength(int strength) {
        if (strength >= 1 && strength <= 100) {
            this.strength = strength;
        } else {
            this.strength = 50;
        }
    }

    private int strength;

    /**
     * @return this Pokemon's type
     */
    public PokemonType getType() {
        return type;
    }

    /**
     * Sets the type of the Pokemon.
     *
     * @param type the type of the Pokemon
     */
    public void setType(PokemonType type) {
        if (type instanceof Grass || type instanceof Water || type instanceof Fire) {
            this.type = type;
        } else {
            this.type = new Fire();
        }
    }

    private PokemonType type;

    /**
     * Creates a Pokemon with all required parameters.
     *
     * @param name     the name of the Pokemon
     * @param health   the health of the Pokemon
     * @param type     the type of the Pokemon
     * @param strength the strength of the Pokemon
     */

    public Pokemon(String name, int health, PokemonType type, int strength) {
        this.setName(name);
        this.setHealth(health);
        this.setType(type);
        this.setStrength(strength);
    }

    /**
     * Creates a Pokemon with all required parameters.Adjusts the health
     * based on the type. Also, it adjusts the strength based on the random number.
     *
     * @param name the name of the Pokemon
     * @param type the type of the Pokemon
     */
    public Pokemon(String name, PokemonType type) {
        this.name = name;
        this.type = type;
        if (type instanceof Grass) {
            this.health = 65;
        } else if (type instanceof Water) {
            this.health = 80;
        } else {
            this.health = 50;
        }
        int ran = (int) (Math.random() * 100) + 1;
        this.strength = ran;
    }

    /**
     * Creates a deep copy of the Pokemon number.
     *
     * @param p the Pokemon
     */
    public Pokemon(Pokemon p) {
        this.name = new String(p.name);
        this.health = p.health;
        this.type = p.type;
        this.strength = p.strength;
    }

    @Override
    public String toString() {
        return this.name
                + " is a "
                + this.type.type() + " type with health "
                + this.health + " and strength "
                + this.strength + ".";
    }

    /**
     * Creates a Pokemon compareTo method that compares two different Pokemons.
     *
     * @param p1 a Pokemon object
     * @return returns an integer representing if two Pokemons are equal or not
     */
    public int compareTo(Pokemon p1) {
        if (this.health != p1.health) {
            if (this.health < p1.health) {
                return -1;
            } else {
                return 1;
            }
        } else if (this.strength != p1.strength) {
            if (this.strength < p1.strength) {
                return -1;
            } else {
                return 1;
            }
        } else if (this.type != p1.type) {
            return this.type.compareTo(p1.type);
        }
        return 0;
    }

}
