package mygame.bullAndCows;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Игры быки и коровы, была реализована в С++, ща пробую в Java
public class BullANDcows {
    public static void main (String[] args) throws IOException {

        BufferedReader fullNumber = new BufferedReader(new InputStreamReader(System.in)); // число которое введут
        int numberOne; // Число, которое загадали
        int numberTwo; // Число, которое вводят для отгадки
        int num1, num2, num3, num4; // цифры, которые надо угадать
        int tryNum1, tryNum2, tryNum3, tryNum4; // цифры, которые будет вводить пользователь, который угадывает
        int countCows, countBulls; // подсчет коров и быков
        boolean[] arrayResult; // проверка числа и цифр
        int theTry; // количество попыток
        int level = 0; //уровень игры
        String play = "";

        do { // Это вся игра
            System.out.println("Выберите уровень игры");
            System.out.println("1. Загадывает человек, отгадывает человек, количество попыток - неограничено");
            System.out.println("2. Пока в работе");

            try { //тут начинается какая то дичь, надо сюда вернуться, когда дойду до главы соответствующей
                String l = fullNumber.readLine();
                level = Integer.parseInt(l);
                // System.out.println(numberOne); // Проверка введеного числа
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            switch (level) {
                case 1:
                     // УРОВЕНЬ 1, загадывает и угадывает человек, количество попыток бесконечно
                        numberOne = 0;

                        System.out.println("Ходит первый игрок");
                        do { // Загадываем число
                            System.out.println("Введите 4х значное число, без повторяющихся цифр");
                            try { //тут начинается какая то дичь, надо сюда вернуться, когда дойду до главы соответствующей
                                String s = fullNumber.readLine();
                                numberOne = Integer.parseInt(s);
                                // System.out.println(numberOne); // Проверка введеного числа
                            } catch (Exception ex) {
                                ex.printStackTrace();
                            } // тут дичь заканчивается
                            num4 = numberOne % 10; // определяем 4 цифру числа
                            num3 = numberOne / 10 % 10; // определяем 3 цифру числа
                            num2 = numberOne / 100 % 10; // определяем 2 цифру числа
                            num1 = numberOne / 1000;// определяем  цифру 1 числа
                            int[] checkNumber = {numberOne, num1, num2, num3, num4}; // Создаем массив из числа и цифр
                            arrayResult = ValidationFullNumber.checkNumber(checkNumber); //отправляем на проверку число и цифры

                            //если надо будет глянуть какие значения получаем на выходе
           /* for(int i=0; i < 2; i++){
                System.out.println(arrayResult[i]);
            } */
                        } while (!arrayResult[0] || !arrayResult[1]);

                        System.out.println("Надо угадать число " + numberOne);
                        //Не знаю как еще, но пусть пока экран идет просто наверх, нужно как то чистить
                        for (int v = 0; v < 20; v++)   System.out.println();



                        System.out.println("Игрок 2 угадывает");
                        // Проверяем число, которое было введено ( эта проверка уже есть выше)
                        theTry = 1;
                        do {
                            numberTwo = 0;
                            System.out.println("Твоя попытка номер - " + theTry);
                            do { // Вводим число для проверки
                                System.out.println("Введите 4х значное число, без повторяющихся цифр");
                                try { //тут начинается какая то дичь, надо сюда вернуться, когда дойду до главы соответствующей
                                    String s = fullNumber.readLine();
                                    numberTwo = Integer.parseInt(s);
                                    // System.out.println(numberOne); // Проверка введеного числа
                                } catch (Exception ex) {
                                    ex.printStackTrace();
                                } // тут дичь заканчивается
                                tryNum4 = numberTwo % 10; // определяем 4 цифру числа
                                tryNum3 = numberTwo / 10 % 10; // определяем 3 цифру числа
                                tryNum2 = numberTwo / 100 % 10; // определяем 2 цифру числа
                                tryNum1 = numberTwo / 1000;// определяем  цифру 1 числа
                                int[] checkNumber = {numberTwo, tryNum1, tryNum2, tryNum3, tryNum4}; // Создаем массив из числа и цифр
                                arrayResult = ValidationFullNumber.checkNumber(checkNumber); //отправляем на проверку число и цифры и впихиваем результат

                                //если надо будет глянуть какие значения получаем на выходе
           /* for(int i=0; i < 2; i++){
                System.out.println(arrayResult[i]);
            } */
                            } while (!arrayResult[0] || !arrayResult[1]);
                            // Проверяем, что у нас числа  и цифры правильно сохранились
                            // System.out.println("Мы загадали numberOne " + numberOne + "\nПервая цифра " + num1 + "\nВторая цифра " + num2 + "\nТретья цифра " + num3 + "\nЧетвертая цифра " + num4);
                            // System.out.println("Мы пытаемся догадаться numberOne " + numberTwo + "\nПервая цифра " + tryNum1 + "\nВторая цифра " + tryNum2 + "\nТретья цифра " + tryNum3 + "\nЧетвертая цифра " + tryNum4);
                            int[] actual = {num1, num2, num3, num4}; // Создаем массив из цифр которые загадали
                            int[] expected = {tryNum1, tryNum2, tryNum3, tryNum4}; // Создаем массив из цифр которые угадываем

                            // Проверяем быков
                            countBulls = DVbulls.checkBulls(expected, actual);
                            // Провереям коров
                            countCows = DVcows.checkCows(expected, actual); //отправляем на проверку число и цифры и впихиваем результат

                            if (countBulls != 4) {
                                System.out.println("Коров:" + countCows);
                                System.out.println("Быков:" + countBulls);
                                System.out.println("Попытайся еще раз :D");
                            }
                            theTry++;
                            System.out.println(" ");
                        } while (countBulls < 4);
                        System.out.println("Урашечки, победа! ");
                        System.out.println("Количсетво твоих попыток: " + (theTry - 1));
                        System.out.println("Если хочешь  выйти введи N");
                        play = fullNumber.readLine();



                    break;
                case 2:
                    System.out.println("Уровень в работе");
                    break;
                default:
                    System.out.println("Где ты видишь этот пункт? :D ");
                    System.out.println(" ");
                    break;
            }
        } while (!play.equals("N"));
    System.out.println("Спасибо за игру :)");
    }


}
