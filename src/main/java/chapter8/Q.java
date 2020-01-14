package chapter8;

public class Q {
    int i,j;
    Q (int a, int b ) {
        i = a;
        j = b;
    }
    //вызываем содержимое
    void show() {
        System.out.println("i and j in Q: " + i + j);
    }
}

class W extends Q{
    int k;
    W(int a, int b, int c) {
        super(a, b);
        k = c;
    }
    //вызовем содержимое переменной к, с помощью метода, переопределяющего метода show из класса Q
    void show() {
        System.out.println("k: " + k );
    }
}
class DemoQW{
    public static void main(String[] args) {
        W w = new W(1, 2, 3);
        w.show(); //вызываеи show из класса W
    }
}
