package chaoter6.boxDemo1;

public class BoxDemo5 {
    public static void main (String [] args) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();
        double vol;

        //инициализируем экземпляры
        mybox1.setDim(10,20,15);
        mybox2.setDim(3, 6, 9);

        //получаем объемы
        vol = mybox1.volume2();
        System.out.println("Объем первого объекта равен " + vol);

        vol = mybox2.volume2();
        System.out.println("Объем второго объекта равен " + vol);

    }
}
