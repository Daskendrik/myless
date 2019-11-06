package chapter7;


import java.util.Stack;

public class NewStack2 {
    private int [] stck;
    private  int tos;

    //выделяем память под стек и инициализируем его
    NewStack2(int size) {
        stck = new int[size];
        tos = -1;
    }

    //разметить элемент в стеке
    void push (int item) {
        if (tos == stck.length-1) System.out.println("Стэк заполнен");//использовать член длины массива
        else stck[++tos] = item;
    }

    //извлекаем элемент из стека
    int pop() {
        if (tos < 0) {
            System.out.println("Стек не загружен");
            return 0;
        }
        else
            return stck[tos--];
    }
}

class TestStack2 {
    public static void main (String[] args) {
        NewStack2 myst1 = new NewStack2(5);
        NewStack2 myst2 = new NewStack2(8);

        //размещаем числа в стеке
        for (int i=0; i<5; i++) myst1.push(i);
        for (int i=0; i<8; i++) myst2.push(i);

        //извлекаем
        System.out.println("Стэк первого масива");
        for (int i=0; i<5; i++){
            System.out.println(myst1.pop());
        }
        System.out.println("Стэк второго масива");
        for (int i=0; i<8; i++){
            System.out.println(myst2.pop());
        }
    }
}
