package chapter7;

public class PassMass {
    static void MasTest(int[] v) {
        System.out.print("Количество агрументов " + v.length + " Содержимое: ");
        for (int x:v) {
            System.out.print(x + " ");
        }
            System.out.println();
    }
    public static void main (String[] args) {
        int[] n1 = {10};
        int[] n2 = {1, 3 ,87};
        int[] n3 = {};
        MasTest(n1);
        MasTest(n2);
        MasTest(n3);
    }
}
