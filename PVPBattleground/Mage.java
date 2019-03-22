import java.util.Random;

public class Mage extends PlayerCharacter {

    private int wisdome;

    public Mage(String newName){
        name = newName;
        System.out.println("A Mage named " + name +  " has been created!");

        Random rand = new Random();

        strength = 7 + (rand.nextInt(6) + 1);
        intalligence = 15 + (rand.nextInt(6) + 1);
        agility = 8 + (rand.nextInt(6) + 1);
        wisdome = 10 +(rand.nextInt(6) + 1);

        mp = mpmax = intalligence + (2 * wisdome);
        hp = hpmax = (strength);


    }

    public void showStats(){
        System.out.printf("%s, a Mage:\n", name);
        System.out.printf("STR: %3d INT: %3d AGI: %3d WIS: %3d\n", strength, intalligence, agility, wisdome);
        System.out.printf(" HP: %3d/%3d\n", hp, hpmax);
        System.out.printf(" MP: %3d/%3d\n", mp, mpmax);
    }

}


