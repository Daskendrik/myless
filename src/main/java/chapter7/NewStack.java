package chapter7;

public class NewStack {
    //сделаем переменные stck и tos закрытыми. Они не могут быть случайно или намерено изменены, чтобы нарушить стек.
     private int[] stck = new int[10];
     private int tos;

     //вершина стека
    NewStack() {
        tos = -1;
    }

    //разместим элементы в стеке
    void push(int item) {
        if (tos==9)
            System.out.println("Стек заполнен");
        else
            stck[++tos] = item;
    }
    //извлечь элемент из стека
    int pop() {
        if (tos<0) {
            System.out.println("Стек не загружен");
            return 0;
        }
        else
            return stck[tos--];
    }
}

class TestNewTest{
    public static void main (String[] args) {
        NewStack myst1 = new NewStack();
        NewStack myst2 = new NewStack();

        //размещаем числа в стеке
        for(int i = 0; i<10; i++) myst1.push(i);
        for(int i = 10; i<20; i++) myst2.push(i);

        //извлекаем числа из стека
        System.out.println("Стек в myst1:");
        for (int i = 0; i<10; i++)
            System.out.println(myst1.pop());

        System.out.println("Стек в myst2:");
        for (int i = 0; i<10; i++)
            System.out.println(myst2.pop());
        //Это вот будет недоступно
        //myst1.tos = -2;
        //myst2.stck[3] = 100;
    }
}
