package mygame.bullAndCows;

public class validationFullNumber {
    public static boolean[] checkNumber(int [] checkNumber){
        boolean b;
        boolean a;
        if (checkNumber[0] < 999 || checkNumber[0] >10000) {
            System.out.println(checkNumber[0] + " не 4х значное!");
            a = false;
        } else {
            a = true;
        }
        System.out.println("1 число " + checkNumber[1] + "\n2 число "+ checkNumber[2] + "\n3 число " + checkNumber[3] + "\n4 число " + checkNumber[4]); //Проверяем, что места цифр определены правильно
        if (checkNumber[1]==checkNumber[2] || checkNumber[1]==checkNumber[3] || checkNumber[1]==checkNumber[4] || checkNumber[2]==checkNumber[3] || checkNumber[2]==checkNumber[4] || checkNumber[3]==checkNumber[4]) {
            System.out.println("Введенное число содержит повторяющиеся цифры!");
            b = false;
        } else {
            b = true;
        }
        boolean[] result = {a, b};
        return result;
    }
}
