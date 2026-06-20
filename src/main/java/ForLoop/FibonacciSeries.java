package ForLoop;

public class FibonacciSeries {
    public static void main (String[] args) {
        int n1,n2,r;
        n1 = 0;
        n2 = 1;
        int result [] = new int[100];
        result[0] = n1;
        result[1] = n2;
        for (int i = 2;i<10;i++) {
            r = n1 + n2;
            result[i] = r;
            n1 = n2;
            n2 = r;

        }
        r = n1 + n2;
        result[10] = r;

        for (int o = 0;o<=10;o++) {
            System.out.print(result[o] + ", ");
        }
    }
}
