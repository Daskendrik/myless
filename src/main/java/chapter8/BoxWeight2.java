package chapter8;
//используем super для инициализации собственных свойст объекта типа Box
public class BoxWeight2 extends Box {
    double weight;

    BoxWeight2(double w, double h, double d, double m) {
        super(w, h, d); //вызвали конструктор суперкласса
        width = m;
    }
}
