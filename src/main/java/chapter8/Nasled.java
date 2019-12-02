package chapter8;

public class Nasled {
    int i, j;
    void showij (){
        System.out.println(i + " " + j);
    }
}

class B extends Nasled {
    int k;
    void showk() {
        System.out.println(k);
    }
    void sumall() {
        System.out.println(k+i+j);
    }
}

class TestNasl {
    public static void main (String[] args) {
        Nasled superO = new Nasled();
        B subO = new B();

        superO.i = 10;
        superO.j = 20;
        System.out.println("Содержимое первого объекта");
        superO.showij();
        subO.showij();
        System.out.println();
        subO.i = 10;
        subO.j = 20;
        subO.k = 30;
        subO.showk();
        System.out.println();
        System.out.println("Сумма всего");
        subO.sumall();
    }
}