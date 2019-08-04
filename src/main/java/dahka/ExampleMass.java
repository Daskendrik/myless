package dahka;

public class ExampleMass {
    public static void main (String[] args) {
//Первый способ объявления массива и его внутренних
       int[] days;
        days = new int [3];
        days[0] = 1;
        days[1] = 2;
        days[2] = 3;
        System.out.println(days[2]);

//Второй способ объявления массива и его внутренних
        int[] month = new int[3];
        month[0] = 1;
        month[1] = 2;
        month[2] = 3;
        System.out.println(month[1]);

//Трейти способ объявления массива и его внутренних
        int[] year = {2015, 2016, 2017, 2018, 2019, 2020};
        System.out.println(year[4]);

        // Программа, вычисляющая среднее значение
        double[] somenum = {10.1 ,11.2, 12.3, 13.4, 14.5};
        double result = 0;
        int i;
        for (i = 0; i<5; i++)
            result = result + somenum[i];
        System.out.println("Среднее значение равно " + result / 5);
    }

}
