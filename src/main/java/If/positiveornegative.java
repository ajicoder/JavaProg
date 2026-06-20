package If;

public class positiveornegative {
    public static void main (String [] args) {
        int n;
        n = 0;

        if (n < 0) {
            System.out.println("Negative");
        } else {
            if (n > 0) {
                System.out.println("Positive");
            }
        }
        if (n == 0) {
            System.out.println("Your number is zero; neutral.");

        }
    }
}
