package chapter8;
//используем super для инициализации собственных свойст объекта типа Box
public class BoxWeight2 extends Box {
    double weight;

    BoxWeight2(double w, double h, double d, double m) {
        super(w, h, d); //вызвали конструктор суперкласса
        weight = m;
    }

    BoxWeight2(BoxWeight2 ob) {
        super(ob);
        weight = ob.weight;
    }

    BoxWeight2(){
        super();
        weight = -1;
    }

    BoxWeight2 (double len, double m){
        super(len);
        weight = m;
    }
}

class DemoSuper {
    public static void main (String[] args) {
        BoxWeight2 mb1 = new BoxWeight2(10, 20, 15, 34.3);
        BoxWeight2 mb2 = new BoxWeight2(2, 3, 4, 0.076);
        BoxWeight2 mb3 = new BoxWeight2();
        BoxWeight2 mb4 = new BoxWeight2(3,2);
        BoxWeight2 clonmb = new BoxWeight2(mb1);
        double vol;

        vol = mb1.volume();
        System.out.println("Объем первого равен " + vol);
        System.out.println(" Вес его равен " + mb1.weight);
        System.out.println();

        vol = mb2.volume();
        System.out.println("Объем второго равен " + vol);
        System.out.println(" Вес его равен " + mb2.weight);
        System.out.println();

        vol = clonmb.volume();
        System.out.println("Объем клона первого " + vol);
        System.out.println(" Вес его равен " + clonmb.weight);
        System.out.println();

        vol = mb3.volume();
        System.out.println("Объем третьего равен " + vol);
        System.out.println(" Вес его равен " + mb3.weight);
        System.out.println();

        vol = mb4.volume();
        System.out.println("Объем четвертого равен " + vol);
        System.out.println(" Вес его равен " + mb4.weight);
        System.out.println();
    }
}
