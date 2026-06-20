public class oddSum {
    public static void main (String [] args) {
        int max, r,n;
        //n means number and r is result
        n = 1;
        r = 0;
        max = 10;
        while (n<=max) {
            r = r + n;
            n = n + 2;
        }
        System.out.println(r);
    }
}
