package chapter8;

public class S {
    void callme(){
        System.out.println("В методе из класса S");
    }
}
class D extends S{
    void callme(){
        System.out.println("В методе из класса D");
    }
}
class F extends S {
    void callme() {
        System.out.println("В методе из класса F");
    }
}

class G{
    public static void main (String[] args){
        S s = new S();
        D d = new D();
        F f = new F();

        S r; //ссылка на объект типа S

        r = s; //переменная ссылкается на обект типа S
        r.callme();

        r = d; //переменная ссылкается на обект типа D
        r.callme();

        r = f; //переменная ссылкается на обект типа F
        r.callme();
    }
}