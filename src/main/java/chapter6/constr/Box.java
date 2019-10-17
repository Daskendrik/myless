package chapter6.constr;

class Box {
    double width;
    double height;
    double depth;

    // а вот и конструктор класса Box
    Box (double width, double height, double depth) {
        System.out.println("Конструирование объекта Box");
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    // расчитать и вернуть объем
    double volume2() {
        return width * height * depth;
    }
}

class BoxDemo6 {
    public  static  void main (String [] args) {
        Box mybox1 = new Box(5,5,10);
        double vol;
        vol = mybox1.volume2();
        System.out.println("Объем равен " + vol);
    }
}
