public class checkPrime {
    public static void main (String [] args) {
        int inputNo,m;
        boolean p;
        inputNo = 190;
        p = true;
        for (int x=2;x<=inputNo-1;x++) {
            m = inputNo%x;
            if (m==0) {
                p = false;
                break;
            }
        }
        if (p) {
            System.out.println("Your number "+inputNo+" is prime.");
        } else {
            System.out.println("Your number "+inputNo+" is not prime.");
        }
    }
}
