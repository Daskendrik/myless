package chaoter6;

class Box {
    double width;
    double height;
    double depth;
    void volume() {
        System.out.print("Объем равен ");
        System.out.println(width * height * depth);
    }
}

class BoxDemo {
    public static void main (String [] args) {
        Box mybox = new Box(); // тут мы объявляем новый объект по шаблону бокс
        double vol;
        mybox.depth = 15; // задаем  параметры
        mybox.height = 20;
        mybox.width = 10;
        vol = mybox.depth * mybox.height * mybox.width;
        System.out.println("Объем равен " + vol);
    }
}
