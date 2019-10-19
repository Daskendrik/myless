package chapter6.myexp;
//тут будет расчет стоимости квартиры в зависимости от количества комнат, ширины и длины.
public class SomeRoom {
    double width;
    double depth;
    int costForPM;
    SomeRoom() {
        width = 20;
        depth = 10;
        costForPM = 26000;
    }
     void take (double w, double d, int c){
        width = w;
        depth = d;
        costForPM = c;
    }

     void calc () {
        System.out.println("Такая комната будет стоить " + width * depth * costForPM);
    }
}
class check {
    public static void main (String [] args) {
        SomeRoom room1 = new SomeRoom();
        room1.calc();
        room1.take(5,10,26000);
        room1.calc();
    }

}
