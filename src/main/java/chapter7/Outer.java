package chapter7;

public class Outer {
    int outer_x = 100;
    void test() {
        for (int i = 0; i<5; i++) {
            Inner inner = new Inner();
            inner.display();
        }
    }
    //внутренний класс
    class Inner {
        int y =10;
        void display() {
            System.out.println("вывод: outer_x = " + outer_x);
        }
    }
    /*void showy() {
        System.out.println(y);
    }*/ //Y является не локальной тут, он только в классе Inner
}

class InnerClassDemo{
    public static void main (String[] args) {
        Outer outer = new Outer();
        outer.test();
    }
}
