/**
 * Represents a program that searches and sorts Pokemon objects.
 *
 * @author prumyantseva3
 * @version 13.31
 */

public class PokemonDB {
    /**
     * Creates a method compareSort() which sorts the Pokemon array in ascending order.
     *
     * @param arr an array of Pokemons
     */
    public static void compareSort(Pokemon[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j].compareTo(arr[min]) == -1) {
                    min = j;
                }
            }
            Pokemon temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }

    /**
     * Creates a method findPokemon() which finds the
     * Pokemon with the specific health in the sorted
     * array by using binary search.
     *
     * @param health an array of Pokemons
     * @param list   a list of Pokemon objects
     * @return returns a Pokemon with the given health
     */
    public static Pokemon findPokemon(int health, Pokemon[] list) {
        compareSort(list);
        int min = 0;
        int max = list.length;
        boolean found = false;
        int i = 0;
        while (!found && max > min) {
            int mid = (min + max) / 2;
            if (list[mid].getHealth() == health) {
                found = true;
                i = mid;
                //break;

            } else {
                if (health < list[mid].getHealth()) {
                    max = mid - 1;
                } else {
                    min = mid + 1;
                }
            }
        }
        if (found) {
            return list[i];
        } else {
            return null;
        }

    }

    /**
     * Creates a PokemonDB method that calls the arguments created in the different classes in this package.
     *
     * @param args the command line arguments.
     */

    public static void main(String[] args) {
        Fire f = new Fire();
        Water w = new Water();
        Grass g = new Grass();


        Pokemon p2 = new Pokemon(null, 100, w, 50);
        Pokemon p1 = new Pokemon("Pikachu", 50, w, 50);
        Pokemon p3 = new Pokemon("Snorlax", 33, g, 50);
        Pokemon p4 = new Pokemon("", 1, g, 50);
        Pokemon p5 = new Pokemon("Coop", g);
        //System.out.println(p4.getType());
        //System.out.println(p5);
        /*System.out.println(p2.compareTo(p1));

        System.out.println(copyp);
        p3.setType(f);
        System.out.println(p3);
        System.out.println(copyp);

         */
        /*Pokemon copyp = new Pokemon(p3);
        System.out.println(copyp);
        p3.setType(f);
        System.out.println(p3);
        System.out.println(copyp);
        */
        Pokemon[] arr = new Pokemon[4];
        arr[0] = p1;
        arr[1] = p2;
        arr[2] = p3;
        arr[3] = p4;
        System.out.println(findPokemon(1, arr));
        compareSort(arr);
        for (Pokemon e : arr) {
            System.out.println(e);
        }
    }
}
