package сhapter5;

public class exampleDoWhile {
    public static void main (String[] args) {

        int n = 10;
        do {
            System.out.println("Step " + n);
            n--;
        } while (n>0);

        do {
            System.out.println("Step " + n );
        } while (--n > -10 );
    }
}
