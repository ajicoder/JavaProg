package ForLoop;

public class saddlePoint {
    public static void main (String[] args) {
        int a [][] = new int[][] {
                {9,1,2},
                {8,5,7},
                {3,4,6}
        };
        int g,h,b,c,bc1,bc2;
        bc1 = 0;
        bc2 = 0;
        b = -1;
        g = a[0][0];
        boolean t = true;
        for (int u = 0; u<=2;u++) {
            b = -1;
            g = a[u][0];
            for (int i = 0;i<=2;i++) {
                h = a[u][i];
                if (b >= 0) {
                    if (b > h) {
                        b = h;
                    } else {
                        if (h > b) {
                            b = b;
                        }
                    }
                } else {
                    if (g > h) {
                        b = h;
                    } else {
                        if (h > g) {
                            b = g;
                        }
                    }
                }
            }
            for (int q = 0; q<=2;q++) {
                c = a[u][q];
                if (c == b) {
                    bc1 = u;
                    bc2 = q;
                    break;
                }
            }
            for (int o = 0; o <=2;o++) {
                h = a[o][bc2];
                if (b > h) {
                    t = true;
                } else {
                    if (h > b) {
                        t = false;
                        break;
                    }
                }
            }
            if (t) {
                System.out.println(b + " is the saddle point.");
            } else {

            }
        }
    }
}
