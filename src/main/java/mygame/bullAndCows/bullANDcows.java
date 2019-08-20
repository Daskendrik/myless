package mygame.bullAndCows;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// Игры быки и коровы, была реализована в С++, ща пробую в Java
public class bullANDcows {
    public static void main (String[] args)
            throws java.io.IOException{

       // int cow, bulls; // коровы это значит, цифра есть в числе, бык значит, что цифра есть и она на своем месте
        BufferedReader fullNumber = new BufferedReader(new InputStreamReader(System.in)); // число которое введут и надо угадать
        int numberOne = 0;

        int num1, num2, num3, num4; // цифры, которые надо угадать
        //int tryNum1, tryNum2, tryNum3, tryNum4; // цифры, которые будет вводить пользователь


        boolean[] arrayResult;
        do {
            System.out.println("Введите загаданное число");
            try{ //тут начинается какая то дичь, надо сюда вернуться, когда дойду до главы соответствующей
                String s = fullNumber.readLine();
                numberOne = Integer.parseInt(s);
                System.out.println(numberOne);
            }catch (Exception ex){
                ex.printStackTrace();
            }
             num4 = numberOne%10; // определяем 4 цифру числа
             num3 = numberOne/10%10; // определяем 3 цифру числа
             num2 = numberOne/100%10; // определяем 2 цифру числа
             num1 = numberOne/1000;// определяем  цифру 1 числа
            int[] checkNumber = {numberOne, num1, num2, num3, num4 }; // Создаем массив из числа и цифр
             arrayResult = validationFullNumber.checkNumber(checkNumber); //отправляем на проверку число и цифры
            for(int i=0; i < 2; i++){
                System.out.println(arrayResult[i]);
            }
        } while ( arrayResult[0] == false ||  arrayResult[1] == false);

        System.out.println("Надо угадать число " + fullNumber);
    }
}
