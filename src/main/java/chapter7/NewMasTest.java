package chapter7;

public class NewMasTest {
     static void vaTest(int ... v) {
         System.out.print("Количество аргументов: " + v.length + " Содержимое: ");
         for (int x:v){
             System.out.print(x +" ");
         }
         System.out.println();
     }
     public static void main (String[] args) {
         vaTest(10);
         vaTest(5,9,78,2);
         vaTest();
     }
}
