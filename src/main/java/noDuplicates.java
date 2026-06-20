public class noDuplicates {
    public static void main (String[] args) {
        int a [] = {-1,-5,2,5,5,100,3};
        int a1,r2,x;
        int r [] = new int[a.length];
        boolean c;
        x = 0;

        for (int i = 0; i < a.length;i++) {
            c = false;
            a1 = a[i];
            for (int o = 0; o <= x; o++) {
                if (a1 == r[o]) {
                    c = true;
                    break;
                } else {
                    c = false;
                }
            }
            if (c == false) {
                r[x] = a1;
                x = x + 1;
            }
        }

        for (int b = 0;b < x;b++) {
            System.out.print(r[b] + ", ");
        }
    }
}
