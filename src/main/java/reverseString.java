public class reverseString {
    public static void main (String [] args) {
        String name,r;
        name = "Ajitesh";
        int l;
        l = name.length();
        for (int i = name.length();i > 0; i--) {
            r = name.substring(i-1, i);
            System.out.print(r);
        }
    }
}
