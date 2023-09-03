/**
 * Represents a program that represents a Grass type.
 *
 * @author prumyantseva3
 * @version 13.31
 */
public class Grass implements PokemonType {
    @Override
    public String type() {
        return "Grass";
    }

    @Override
    public int compareTo(PokemonType p) {
        if (p instanceof Fire) {
            return -1;
        } else if (p instanceof Water) {
            return -1;
        } else {
            return 0;
        }
    }
}
