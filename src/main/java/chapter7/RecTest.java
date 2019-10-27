package chapter7;

public class RecTest {
    int valumes[];

    RecTest(int i) {
        valumes = new int[i];
    }

    //выводим рекрсивно элементы массива
    void printArray (int i) {
        if (i == 0) return;
        else  printArray(i-1);
        System.out.println("[" + (i - 1) + "]" + valumes[i-1]);
    }
}

class Recursion2 {
    public static void main (String[] args) {
        RecTest ob = new RecTest(10);
        int i;

        for (i=0; i<8; i++) ob.valumes[i] = i; //тут мы проходу устанавливаем знаечния для массива
        ob.printArray(8); // а тут выводим их?
    }
}
