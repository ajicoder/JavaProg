public class commonNumbers {
    public static void main (String[] args) {
        int a1 [] = {1,2,3,4,5};
        int a2 [] = {9,6,1,10,3};
        int a1n,a2n;

        for (int i = 0;i < a1.length;i++) {
            a1n = a1[i];
            for (int o = 0;o<a2.length;o++) {
                a2n = a2[o];
                if (a1n == a2n) {
                    System.out.print(a2n + ", ");
                }
            }
        }
    }
}
