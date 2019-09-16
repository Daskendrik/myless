package сhapter5.oprFor;

public class ForBet {
    public static void main (String[] args) {

        int [] num = {6,8,77,5,6,7};
        int val = 5;
        boolean found = false;
        int i = 0;
        // используем цикл фор в стиле вор ич для поиска значения переменной вал в массиве нам
        for (int x:num) {
            if (x == val) {
                found = true;
                break;
            }
            System.out.println(x + " is not our value");
            i++;
        }
        if (found)
            System.out.println(" We find our value, its in " + i + " for program, but for us it is " + (i+1) + " in mass" );

    }
}
