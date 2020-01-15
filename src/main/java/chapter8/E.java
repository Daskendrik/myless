package chapter8;

public class E {
    int i, j;
    E(int a, int b){
        i = a;
        j = b;
    }

    void show(){
        System.out.println("i и j: " + i +" " + j);
    }
}

class T extends E{
    int k;
    T(int q, int w, int x) {
        super(q, w);
        k = x;
    }

    void show(String msg){
        System.out.println(msg + k);
    }
}

class DemoET{
    public static void main (String[] args){
        T t = new T(1,2,3);
        t.show("Это k: ");  //Тут вызываем шоу из класса T, так как передали сообщение
        t.show();                 //Тут вызываем шоу из класса E, так как пусто
    }
}
