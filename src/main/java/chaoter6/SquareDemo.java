package chaoter6;

public class SquareDemo {

    static int squareD(int i){ //i  это параметр
        return i * i;
    }
    public static void main (String [] args) {
        int  y;
        for (int x = 1; x < 10; x++) {
            y = squareD(x); //x  это аргумент
            System.out.println("Кважат числа " + x + " равен " + y);
        }
    }
}
