import java.util.Random;

public class Fighter extends PlayerCharacter {

String name;


private int constitution;


    public Fighter(String newName){
        name = newName;
        System.out.println("A fighter named " + name +  " has been created!");

        Random rand = new Random();

        strength = 15 + (rand.nextInt(6) + 1);
        intalligence = 7 + (rand.nextInt(6) + 1);
        agility = 8 + (rand.nextInt(6) + 1);
        constitution = 10 +(rand.nextInt(6) + 1);

        mp = mpmax = 0;
        hp = hpmax = (strength * 2) + (constitution *2);


    }

    public void showStats(){
        System.out.printf("%s, a Fighter:\n", name);
        System.out.printf("STR: %3d INT: %3d AGI: %3d CON: %3d\n", strength, intalligence, agility, constitution);
        System.out.printf(" HP: %3d/%3d\n", hp, hpmax);
        System.out.printf(" MP: %3d/%3d\n", mp, mpmax);
    }

    }
