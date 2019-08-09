package dahka;

public class TerOpp {
    public static void main(String[] args) {

        int i, k;
        i = 10;
        k = i < 0 ? -i : i; //получилось вбсолютное значение переменной i
        System.out.println( "Абсолютное значение " + i + " равно " + k);
        System.out.println("");
        i = -10;k = i < 0 ? -i : i; //получилось вбсолютное значение переменной i
        System.out.println( "Абсолютное значение " + i + " равно " + k);

    }
}
