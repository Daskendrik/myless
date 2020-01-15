package chapter8;

public class Q {
    int i,j;
    Q (int a, int b ) {
        i = a;
        j = b;
    }
    //вызываем содержимое
    void show() {
        System.out.println("i and j in Q: " + i + " и " +j);
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
        System.out.println("Класс W, где полностью заменяется метод шоу");
        w.show(); //вызываеи show из класса W
        System.out.println(" ");
        System.out.println("Класс R, где шоу из суцперкласса + свой шоу");
        R r = new R(4,5,6);
        r.show();
    }
}

class R extends Q {
    int k;
    R(int a, int b, int c){
      super(a,b);
      k = c;
    }
    void show(){
        super.show(); //вызываем метод из супрекласса
        System.out.println("k: " + k);
    }
}
