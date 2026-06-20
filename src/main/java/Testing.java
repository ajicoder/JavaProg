public class Testing {

    public static void main () {
        int [][] a = new int[51][3];
// Comments 1
        for (int i = 0;i <=50;i++) {
            a[i][0] = 5;
            a[i][1] = i;
            a[i][2] = a[i][0] * a[i][1];
            System.out.println(a[i][0] + " x " + a[i][1] + " = " + a[i][2]);
        }
    }

}
