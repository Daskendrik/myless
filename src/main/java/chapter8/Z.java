package chapter8;

public class Z {
    Z() {
        System.out.println("Опа конструктор класса Z");
    }
}

class X extends Z{
    X(){
        System.out.println("Опа конструктор класса X");
    }
}
class V extends X{
    V(){
        System.out.println("Опа конструктор класса C");
    }
}

class DemoZXC{
    public static void main (String[] args){
        V c = new V();
    }
}
