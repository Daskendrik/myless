package mygame.bullAndCows;
// Игры быки и коровы, была реализована в С++, ща пробую в Java
public class bullANDcows {
    public static void main (String[] args)
            throws java.io.IOException{

       // int cow, bulls; // коровы это значит, цифра есть в числе, бык значит, что цифра есть и она на своем месте
        int fullNumber; // число которое введут и надо угадать
        int num1, num2, num3, num4; // цифры, которые надо угадать
        //int tryNum1, tryNum2, tryNum3, tryNum4; // цифры, которые будет вводить пользователь
        boolean a,b; // Для проверки введенного числа

        System.out.println("Введите загаданное число");

        do {
            fullNumber = (char) System.in.read();

            if (fullNumber < 999 || fullNumber >10000) {
                System.out.println(fullNumber + " не 4х значное!");
                a = false;
            } else {
                a = true;
            }
            num4 = fullNumber%10;
            num3 = fullNumber/10%10;
            num2 = fullNumber/100%10;
            num1 = fullNumber/1000;
            System.out.println("1 число " + num1 + "\n2 число "+ num2 + "\n3 число " + num3 + "\n1 число " + num4); //Проверяем, что места цифр определены правильно
            if (num1==num2 || num1==num3 || num1==num4 || num2==num3 || num2==num4 || num3==num4) {
                System.out.println("Введенное число содержит повторяющиеся цифры!");
                b = false;
            } else {
                b = true;
            }

        } while (a == false || b == false);

        System.out.println("Надо угадать число " + fullNumber);
    }
}
