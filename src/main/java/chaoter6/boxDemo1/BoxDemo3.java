package chaoter6.boxDemo1;

public class BoxDemo3 {
    public static void main (String [] args) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();

        mybox1.height = 10;
        mybox1.depth = 20;
        mybox1.width = 15;

        mybox2.height = 3;
        mybox2.depth = 6;
        mybox2.width = 9;
        // Выводим объемы параллепипедов
        mybox1.volume();
        mybox2.volume();
    }
}
