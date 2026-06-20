public class average {
    public static void main (String[] args) {
        int num [] = {90,75,99,70,77,76,71};
        int t = 0;
        for (int i = 0;i<num.length;i++) {
            t = t + num[i];
        }
        int a = t/num.length;
        System.out.println(a + " Is the average");

        if (a >= 91 && a <=100) {
            System.out.println("The grade is an A");
        }
        if (a >= 81 && a <=90) {
            System.out.println("The grade is an B");
        }
        if (a >= 71 && a <=80) {
            System.out.println("The grade is an C");
        }
    }
}
