package chapter8;
//новый класс
class BigBox {
    private double width;
    private double height;
    private double depth;

    //клон объекта
    BigBox(BigBox ob){ //Передать объект конструктору
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    //конструктор при указании всех размеров
    BigBox(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    //контруктор без размеров
    BigBox(){
        width = -1;
        height = -1;
        depth = -1;
    }

    //куб
    BigBox(double len) {
        width = depth = height = len;
    }

    //расчет и возврат объема
    double volume() {
        return width*height*depth;
    }
}

//Добавляем класс с весом
class BigBoxW extends  BigBox {
    double weight;//вес

    //сконструировать клон
    BigBoxW(BigBoxW ob){
        super(ob);
        weight = ob.weight;
    }

    //указаны все параметры
    BigBoxW(double w, double h, double d, double m){
        super(w, h, d);
        weight = m;
    }

    //ничего не указано
    BigBoxW(){
        super();
        weight = -1;
    }

    //куб
    BigBoxW(double len, double m){
        super(len);
        weight = m;
    }
}

//Добавляем стоимость доставки
class Shipment extends BigBoxW {
    double cost;//цена

    //сконструировать клон
    Shipment(Shipment ob){
        super(ob);
        cost = ob.cost;
    }

    //указаны все параметры
    Shipment(double w, double h, double d, double m, double c){
        super(w, h, d, m);
        cost = c;
    }

    //ничего не указано
    Shipment(){
        super();
        cost = -1;
    }

    //куб
    Shipment(double len, double m, double c){
        super(len, m);
        cost = c;
    }
}

class DemoShipment {
    public static void main (String[] args) {
        Shipment shipment1 = new Shipment(10, 20, 15, 10, 3.41);
        Shipment shipment2 = new Shipment(2, 3, 4, 0.76, 1.28);
        double vol;

        vol = shipment1.volume();
        System.out.println("Объем Shipment1 равен " + vol);
        System.out.println("Вес Shipment1 равен " + shipment1.weight);
        System.out.println("Стоимость доставки Shipment1 равна $" + shipment1.cost);
        System.out.println();

        vol = shipment2.volume();
        System.out.println("Объем Shipment2 равен " + vol);
        System.out.println("Вес Shipment2 равен " + shipment2.weight);
        System.out.println("Стоимость доставки Shipment2 равна $" + shipment2.cost);
        System.out.println();
    }
}
