package chapter7;

public class Test2 {
    void meth (int i, int j) {
        i *= 2;
        j /= 2;
    }
}

class CallByValue {
    public static void main (String [] args) {
        Test2 ob = new Test2();
        int a = 15, b = 20;

        System.out.println("До вызова:" + a + b);

        ob.meth(a,b);
        System.out.println("После вызова:" + a + b);
    }
}
