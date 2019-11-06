package chapter7;

public class UseStatic {
    static int a =3;
    static int b;

    static void meth(int x) {
        System.out.println("x = " + x);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    static {
        System.out.println("Статистический блок инициализоирован");
        b = a * 4;
    }

    public static void main (String[] args) {
        meth(42);
        UseStatic.a = 10;
    }
}

class UseSt {
    public static void main(String[] args) {
        UseStatic.meth(42);
        UseStatic.a = 10;
        UseStatic.meth(42);
    }
}
