package chapter7;

public class Test01 {
    int a; //Доступ по умолчанию
    public int b; // открытй доступ
    private int c; //закрытый доступ

    //методы доступа к закрытому С данного класса
    void setC (int i){ //установить значение члена С данного класса
        c = i;
    }

    int getc() {//получаем значение члена С данного класса
        return c;
    }
}
class AccessTest {
    public static void main (String[] args){
        Test01 ob = new Test01();

        //эти операторы открыты, поэтому члены a и b доступны для редактирования
        ob.a = 10;
        ob.b = 20;

        //ob.c будет недоступен, так как С приватный

        //Доступ к С осуществляется только с помощью метода класса
        ob.setC(100);
        System.out.println(ob.a + " " + ob.b + " " + ob.getc() );
    }
}