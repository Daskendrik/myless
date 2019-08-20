package mygame.bullAndCows;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// Игры быки и коровы, была реализована в С++, ща пробую в Java
public class BullANDcows {
    public static void main (String[] args) {

       // int cow, bulls; // коровы это значит, цифра есть в числе, бык значит, что цифра есть и она на своем месте
        BufferedReader fullNumber = new BufferedReader(new InputStreamReader(System.in)); // число которое введут и надо угадать
        int numberOne = 0; // Число, которое загадали
        int numberTwo = 0; // Число, которое вводят для отгадки
        int num1, num2, num3, num4; // цифры, которые надо угадать
        int tryNum1, tryNum2, tryNum3, tryNum4; // цифры, которые будет вводить пользователь, который угадывает
        boolean[] arrayResult; // проверка числа и цифр
        System.out.println("Ходит первый игрок");
        do { // Загадываем число
            System.out.println("Введите 4х значное число, без повторяющихся цифр");
            try{ //тут начинается какая то дичь, надо сюда вернуться, когда дойду до главы соответствующей
                String s = fullNumber.readLine();
                numberOne = Integer.parseInt(s);
                // System.out.println(numberOne); // Проверка введеного числа
            }catch (Exception ex){
                ex.printStackTrace();
            } // тут личь заканчивается
             num4 = numberOne%10; // определяем 4 цифру числа
             num3 = numberOne/10%10; // определяем 3 цифру числа
             num2 = numberOne/100%10; // определяем 2 цифру числа
             num1 = numberOne/1000;// определяем  цифру 1 числа
            int[] checkNumber = {numberOne, num1, num2, num3, num4 }; // Создаем массив из числа и цифр
             arrayResult = ValidationFullNumber.checkNumber(checkNumber); //отправляем на проверку число и цифры

            //если надо будет глянуть какие значения получаем на выходе
           /* for(int i=0; i < 2; i++){
                System.out.println(arrayResult[i]);
            } */
        } while (!arrayResult[0] || !arrayResult[1]);

        System.out.println("Надо угадать число " + numberOne);


        // УРОВЕНЬ 1, загадывает и угадывает человек, количество попыток бесконечно
        System.out.println("Игрок 2 угадывает");
        // Проверяем число, которое было введено ( эта проверка уже есть выше)
        do { // Загадываем число
            System.out.println("Введите 4х значное число, без повторяющихся цифр");
            try{ //тут начинается какая то дичь, надо сюда вернуться, когда дойду до главы соответствующей
                String s = fullNumber.readLine();
                numberTwo = Integer.parseInt(s);
                // System.out.println(numberOne); // Проверка введеного числа
            }catch (Exception ex){
                ex.printStackTrace();
            } // тут личь заканчивается
            tryNum4 = numberTwo%10; // определяем 4 цифру числа
            tryNum3 = numberTwo/10%10; // определяем 3 цифру числа
            tryNum2 = numberTwo/100%10; // определяем 2 цифру числа
            tryNum1 = numberTwo/1000;// определяем  цифру 1 числа
            int[] checkNumber = {numberTwo, tryNum1, tryNum2, tryNum3, tryNum4 }; // Создаем массив из числа и цифр
            arrayResult = ValidationFullNumber.checkNumber(checkNumber); //отправляем на проверку число и цифры

            //если надо будет глянуть какие значения получаем на выходе
           /* for(int i=0; i < 2; i++){
                System.out.println(arrayResult[i]);
            } */
        } while (!arrayResult[0] || !arrayResult[1]);
         // Проверяем, что у нас числа  и цифры правильно сохранились
        System.out.println("Мы загадали numberOne " + numberOne + "\nПервая цифра " + num1 + "\nВторая цифра " + num2 + "\nТретья цифра " + num3 + "\nЧетвертая цифра " + num4);
        System.out.println("Мы пытаемся догадаться numberOne " + numberTwo + "\nПервая цифра " + tryNum1 + "\nВторая цифра " + tryNum2 + "\nТретья цифра " + tryNum3 + "\nЧетвертая цифра " + tryNum4);


        // Проверяем быков
        
        // Провереям коров
    }

}
