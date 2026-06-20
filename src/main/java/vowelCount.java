public class vowelCount {
    public static void main (String [] args) {
        String s,ss;
        int c;
        c = 0;
        s = "supercalifragilisticexpialidocious";
        int len = s.length();
        for (int x = 0;x<len;x++) {
            ss = s.substring(x,1+x);
            if (ss.equalsIgnoreCase("a") ||
                    ss.equalsIgnoreCase("e") ||
                    ss.equalsIgnoreCase("i") ||
                    ss.equalsIgnoreCase("o") ||
                    ss.equalsIgnoreCase("u") ) {
                c = c + 1;
            }
        }
        System.out.println(c);


    }
}
