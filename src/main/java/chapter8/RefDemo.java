package chapter8;

public class RefDemo {
    public static void main (String[] args) {
        BoxWeight weightbox = new BoxWeight(3,5, 7, 8.37);
        Box plainbox = new Box();
        double vol;
        vol = weightbox.volume();
        System.out.println("объем равен " + vol);
        System.out.println("Вес равен " + weightbox.weight);
        System.out.println();

        //присвоить ссылке на обект BoxWeight ссылки на объект Box
        plainbox = weightbox;
        vol = plainbox.volume(); //это сойдет, так как метод определен в классе Box
        System.out.println("Объем второго равен " + vol);
        //Не выйдет, так как член plainbox  не определяет член weight
        //System.out.println("Вес равен " + plainbox.weight);
    }
}
