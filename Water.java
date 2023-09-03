/**
 * Represents a program that represents a Water type.
 *
 * @author prumyantseva3
 * @version 13.31
 */
public class Water implements PokemonType {
    @Override
    public String type() {
        return "Water";
    }

    @Override
    public int compareTo(PokemonType p) {
        if (p instanceof Fire) {
            return 1;
        } else if (p instanceof Grass) {
            return 1;
        } else {
            return 0;
        }
    }
}
