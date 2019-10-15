package chaoter6.boxDemo1;

public class BoxDemo2 {
    public static void main (String [] args) {
        double vol;
        Box mybox1 = new Box();
        Box mybox2 = new Box();
        //Param of 1st object
        mybox1.width = 10;
        mybox1.height = 20;
        mybox1.depth = 15;

        //Param of 2st object
        mybox2.width = 3;
        mybox2.height = 6;
        mybox2.depth = 9;

        vol = mybox1.depth * mybox1.height * mybox1.width;
        System.out.println("Объем первого объекта равен " + vol);

        vol = mybox2.depth * mybox2.height * mybox2.width;
        System.out.println("Объем второго объекта равен " + vol);
    }
}
