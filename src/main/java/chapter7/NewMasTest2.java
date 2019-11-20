package chapter7;

public class NewMasTest2 {
    static void vaTest2(String msg, int ... v) {
        System.out.print(msg + " Количество аргументов: " + v.length + " Содержимое: ");
        for (int x:v){
            System.out.print(x +" ");
        }
        System.out.println();
    }
    public static void main (String[] args) {
        vaTest2("Первый массив",10);
        vaTest2("Second массив", 5,9,78,2);
        vaTest2("3d массив");
    }
}
