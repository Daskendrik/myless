package dahka;

public class SumsumPer {
    public static void main (String[] args) {

        int a = 1;
        int b = 2;
        int c, d, r;
        c = ++b; // мы присвоили с увеличенное значение b, при этом значение b мы тоже увеличили
        d = a++; // мы присвоили d значение a, при этом значение a мы тоже увеличили
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        r = a+1; // при такой записи, мы присвоим значение r увеличенное значение а, но при этом значение а мы не меняем.
        System.out.println("a = " + a);
        System.out.println("r = " + r);


    }
}
