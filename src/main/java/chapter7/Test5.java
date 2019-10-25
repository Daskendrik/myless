package chapter7;

class Test5 {
    int a,b;

    Test5(int i, int j){
        a = i;
        b = j;
    }

    void meth2 (Test5 o){
        o.a *= 2;
        o.b /= 2;
    }
}
class PassObRe {
    public static void main (String [] args) {
        Test5 ob = new Test5(15,20);
        System.out.println("ob.a ob.b до вызова " + ob.a + " " + ob.b);
        ob.meth2(ob);

        System.out.println("ob.a ob.b после вызова " + ob.a + " " + ob.b);
    }
}
