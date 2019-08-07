package dahka;

public class OperAndPrisv {
    public static void main (String[] args) {

        int a = 1;
        int b = 2;
        int c = 3;
        a += 5;
        b *= 4;
        c += a*b;
        System.out.println("a = 1, a += 5, a = " + a);
        System.out.println("b = 2, b *= 4, b = " + b);
        System.out.println("c = 3, c += a*b, c = "+ c);
        c %= 6;
        System.out.println("c %= 6, c = " + c);

    }
}
