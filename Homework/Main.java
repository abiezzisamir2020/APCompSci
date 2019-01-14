import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

//Words

        String drow = "";
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a word");
        String word = sc.nextLine();

        int length = word.length();

        for (int i = length - 1; i >= 0; i--)
             drow = drow + word.charAt(i);

        if (word.equalsIgnoreCase(drow))
            System.out.println("It is a palindrome. Gud Job!");
        else
            System.out.println("It isn't a palindrome. You no do gud");




// Sentences

        String ecnatnes = "";
        Scanner SC = new Scanner(System.in);

        System.out.println("Enter a phrase");
        String sentance = sc.nextLine();

        sentance = sentance.replaceAll("\\s","");
        sentance = sentance.replaceAll("[a-zA-Z]","");
        sentance = sentance.toUpperCase();

        int length2 = word.length();

        for (int i = length2 - 1; i >= 0; i--)
            ecnatnes = ecnatnes + sentance.charAt(i);

        if (sentance.equalsIgnoreCase(drow))
            System.out.println("It is a palindrome. Gud Job!");
        else
            System.out.println("It isn't a palindrome. You no do gud");




    }
}
