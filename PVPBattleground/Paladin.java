import java.util.Random;

public class Paladin extends PlayerCharacter{

    private int wisdome;
    private int constitution;

    public Paladin(String newName) {
        name = newName;
        System.out.println("A Paladin named " + name + " has been created!");

        Random rand = new Random();

        strength = 10 + (rand.nextInt(6) + 1);
        intalligence = 15 + (rand.nextInt(6) + 1);
        agility = 5 + (rand.nextInt(6) + 1);
        wisdome = 10 + (rand.nextInt(6) + 1);
        constitution = 10 + (rand.nextInt(6) + 1);

        mp = mpmax = intalligence + (2 * wisdome);
        hp = hpmax = (strength) + (2 * constitution);


    }

    public void showStats() {
        System.out.printf("%s, a Paladin:\n", name);
        System.out.printf("STR: %3d INT: %3d AGI: %3d WIS: %3d CON: %3d\n", strength, intalligence, agility, wisdome, constitution);
        System.out.printf(" HP: %3d/%3d\n", hp, hpmax);
        System.out.printf(" MP: %3d/%3d\n", mp, mpmax);

    }
}