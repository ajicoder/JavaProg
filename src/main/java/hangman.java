import java.util.Random;
import java.util.Scanner;

public class hangman {
    public static void main(String[] args) {
        String[] words = {
                "apple", "banana", "grapes", "orange",
                "computer", "keyboard", "monitor", "java",
                "puzzle", "science"
        };

        Random rand = new Random();
        String word = words[rand.nextInt(words.length)];

        String w = "hello";
        String b = word.replaceAll(".","_");
        char[] ar = word.toCharArray();
        char[] ar2 = b.toCharArray();
        Scanner input = new Scanner(System.in);
        boolean t = true;
        int c = 0;
        char n = ' ';
        for (int o = 0; 0 < word.length();o++) {
            c = 0;
            System.out.println("Enter a letter to guess: ");
            String le = input.nextLine();
            for (int i = 0; i < word.length();i++) {
                if (le.equals(String.valueOf(ar[i]))) {
                    ar2[i] = ar[i];
                    n = ar2[i];
                    c = c + 1;
                }
            }
            String sc = String.valueOf(c);
            String sn = String.valueOf(n);
            System.out.println(le + ": " + c);

            System.out.println(ar2);

            for (int q = 0; q < word.length(); q++) {
                if (ar2[q] == '_') {
                    t = false;
                    break;
                } else  {
                    t = true;
                }

            }
            if (t) {
                System.out.println("You guessed the word! " + word);
                break;
            }
        }








    }
}
