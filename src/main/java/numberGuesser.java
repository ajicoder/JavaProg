import java.util.Random;
import java.util.Scanner;

public class numberGuesser {
    public static void main (String[] args) {
        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        int num = rand.nextInt(100);
        boolean n = true;
        int c;
        System.out.print("Enter a number: ");
        while (n) {

            if(input.hasNextInt()) {
                c = input.nextInt();

                if (c == num) {
                    n = false;
                    System.out.println("You guessed the number right;" + num);
                    break;
                } else {
                    if (Math.abs(c-num) == 1) {
                        System.out.println("YOUR REALLY CLOSE!!");
                    }
                    if (Math.abs(c-num) >= 2 && Math.abs(c-num) <= 15) {
                        System.out.println("Somewhat close...");
                    }
                    if (Math.abs(c-num) >= 16) {
                        System.out.println("You need to get better at guessing 😑.");
                    }

                    System.out.print("Enter a number: ");

                }
            } else {
                    System.out.print("Enter a NUMBER: ");
                    input.next();

            }

        }

    }
}
