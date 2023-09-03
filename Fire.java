/**
 * Represents a program that represents a Fire type.
 *
 * @author prumyantseva3
 * @version 13.31
 */
public class Fire implements PokemonType {
    @Override
    public String type() {
        return "Fire";
    }

    @Override
    public int compareTo(PokemonType p) {
        if (p instanceof Grass) {
            return 1;
        } else if (p instanceof Water) {
            return -1;
        } else {
            return 0;
        }
    }
}
