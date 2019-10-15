package chapter6.constr;

class Box {
    double width;
    double height;
    double depth;

    // а вот и конструктор класса Box
    Box () {
        System.out.println("Конструирование объекта Box");
        width = 10;
        height = 10;
        depth = 10;
    }

    // расчитать и вернуть объем
    double volume2() {
        return width * height * depth;
    }
}

class BoxDemo6 {
    public  static  void main (String [] args) {
        Box mybox1 = new Box();
        double vol;
        vol = mybox1.volume2();
        System.out.println("Объем равен " + vol);
    }
}
