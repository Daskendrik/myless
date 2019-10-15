package chaoter6.boxDemo1;

public class BoxDemo4 {
    public static void main (String [] args) {

        Box mybox1 = new Box();
        Box mybox2 = new Box();
        double vol;

        mybox1.height = 10;
        mybox1.depth = 20;
        mybox1.width = 15;

        mybox2.height = 3;
        mybox2.depth = 6;
        mybox2.width = 9;
        // Получаем объемы
        vol = mybox1.volume2();
        System.out.println("Объем первого равен " + vol);
        //Немного другой способ вывода
        System.out.println("Объем второго равен " + mybox2.volume2());

    }
}
