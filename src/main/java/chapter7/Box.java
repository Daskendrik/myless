package chapter7;

public class Box {
    double width;
    double height;
    double depth;

    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    Box(){
        width = -1;
        height = -1;
        depth = -1;
    }

    Box(double len){
        width = height = depth = len;
    }

    double volume() {
        return width * height * depth;
    }
}

class BoxDemo {
    public static void main (String [] args){
        Box mybox1 = new Box(10, 20, 15);
        Box mybox2 = new Box();
        Box mybox3 = new Box(7); //куб

        double vol;

        vol = mybox1.volume();
        System.out.println("Объем равен " + vol);
        vol = mybox2.volume();
        System.out.println("Объем равен " + vol);
        vol = mybox3.volume();
        System.out.println("Объем равен " + vol);
    }
}
