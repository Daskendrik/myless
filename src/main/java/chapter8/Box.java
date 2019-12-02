package chapter8;

public class Box {
    double width;
    double height;
    double depth;

    //Клон объекта
    Box (Box ob) {
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    //при объявлении указываем все разммеры
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    //Когда размеры не задаются
    Box(){
        width = -1;
        height = -1;
        depth = -1;
    }

    //Куб
    Box(double len) {
        width = height = depth = len;
    }

    // расчитать и возвратить объем
    double volume(){
        return width * height * depth;
    }
}

//Расширяем класс, добавляем в него поле веса
class BoxWeight extends Box {
    double weight;//вес параллелепипеда

    //конструтор
    BoxWeight (double w, double h, double d, double m) {
        width = w;
        height = h;
        depth = d;
        weight = m;
    }
}

class Demo_1{
    public static void main (String[] args){
        BoxWeight mybox1 = new BoxWeight(10, 20, 15, 34.3);
        BoxWeight mybox2 = new BoxWeight(2,3,4,0.076);
        double vol;

        vol = mybox1.volume();
        System.out.println("Объем первого равен " + vol);
        System.out.println("Вес его равен " + mybox1.weight);
        System.out.println();

        vol = mybox2.volume();
        System.out.println("Объем второго равен " + vol);
        System.out.println("Вес его равен " + mybox2.weight);
        System.out.println();
    }
}