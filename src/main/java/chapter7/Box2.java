package chapter7;

public class Box2 {
    double width;
    double height;
    double depth;

    Box2 (Box2 ob) {
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    Box2(double w, double h, double d){
        width = w;
        height = h;
        depth = d;
    }

    Box2(){
        width = -1;
        height = -1;
        depth = -1;
    }

    Box2(double len) {
        width = height = depth = len;
    }

    double volume() {
        return width * height * depth;
    }
}
class OverloadCons2{
    public static void main (String[] args){
        Box2 mybox1 = new Box2(10, 20, 15);
        Box2 mybox2 = new Box2();
        Box2 mybox3 = new Box2(7);

        Box2 myclone = new Box2(mybox1);

        double vol;

        vol = mybox1.volume();
        System.out.println("mybox1 " + vol);

        vol = mybox2.volume();
        System.out.println("mybox2 " + vol);

        vol = mybox3.volume();
        System.out.println("mybox3 " + vol);

        vol = myclone.volume();
        System.out.println("myclone " + vol);
    }
}
