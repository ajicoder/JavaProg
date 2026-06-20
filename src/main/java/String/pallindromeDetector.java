package String;

public class pallindromeDetector {
    public static void main (String [] args) {
        String v;
        v = "Hello";
        boolean t = true;
        int l = v.length();
        for (int i = 0;i<Math.floor(v.length()/2);i++) {
            String L,r;
            L = v.substring(i,i+1);
            r = v.substring(l-i-1,l-i);
            if (!L.equalsIgnoreCase(r)) {
                t = false;
            }
        }
        if (t) {
            System.out.println("Your value is a Palindrome.");
        } else {
            System.out.println("Your value is NOT a Palindrome.");
        }

    }
}
