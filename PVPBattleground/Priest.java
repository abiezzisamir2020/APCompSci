import java.util.Random;

public class Priest extends PlayerCharacter {

    private int carisma;


    public Priest(String newName) {
        name = newName;
        System.out.println("A Priest named " + name + " has been created!");

        Random rand = new Random();

        strength = 7 + (rand.nextInt(6) + 1);
        intalligence = 15 + (rand.nextInt(6) + 1);
        agility = 8 + (rand.nextInt(6) + 1);
        carisma = 10 + (rand.nextInt(6) + 1);

        mp = mpmax = intalligence + (2 * carisma);
        hp = hpmax = (strength);


    }

    public void showStats() {
        System.out.printf("%s, a Priest:\n", name);
        System.out.printf("STR: %3d INT: %3d AGI: %3d CAR: %3d\n", strength, intalligence, agility, carisma);
        System.out.printf(" HP: %3d/%3d\n", hp, hpmax);
        System.out.printf(" MP: %3d/%3d\n", mp, mpmax);

    }
}
