public class rotate {
    public static void main (String[] args) {
        String w;
        w = "clockwise";
        int a [][] = new int[][] {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int a2 [][] = new int[][] {
                {0,0,0},
                {0,0,0},
                {0,0,0}
        };
        int l = a[0].length-1;

        for (int o = l; o >= 0;o--) {
            for (int i = 0; i <= l;i++) {
                a2[i][l-o] = a[o][i];
            }
        }
        System.out.println("Before:");

        for (int aa = 0; aa<=2;aa++) {
            System.out.println();
            for (int b = 0; b<=2;b++) {
                System.out.print(a[aa][b] + ", ");
            }
        }
        System.out.println();
        System.out.println();

        System.out.println("After:");

        for (int aa = 0; aa<=2;aa++) {
            System.out.println();
            for (int b = 0; b<=2;b++) {
                System.out.print(a2[aa][b] + ", ");
            }
        }









    }
}
