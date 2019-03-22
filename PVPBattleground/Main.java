import java.util.ArrayList;
import java.util.Random;
public class Main {

    public static void main(String[] args) {
        int val = 5;
        Random num = new Random();

        ArrayList<PlayerCharacter> players = new ArrayList<PlayerCharacter>();
        players.add(new Fighter("soldier"));
        players.add(new Priest ("Zenyata"));
        players.add(new Paladin("Brigete"));
        players.add(new Mage("Storm"));

        for (PlayerCharacter x : players) {
            if (x instanceof Fighter) {
                x.showStats();

            }
        }
        for (PlayerCharacter x : players) {
            if (x instanceof Priest) {
                x.showStats();

            }
        }
        for (PlayerCharacter x : players) {
            if (x instanceof Paladin) {
                x.showStats();

            }
        }
        for (PlayerCharacter x : players) {
            if (x instanceof Mage) {
                x.showStats();

            }
        }
    }
}


