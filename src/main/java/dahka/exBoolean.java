public class exBoolean {
    public static void main (String [] args) {

        boolean b;
        b = false;
        System.out.println("Сейчас переменная скажет нам " + b);

        b = true;
        System.out.println("Но потом она поменяет свое мненеие и скажет " + b);

        // с помощью boolen  можно управлять if
        if (b) System.out.println("Мы увидим эту надпись, но вот следующую нет, хоть там и интересный контент");

        b = false;
        if (b) System.out.println("Dasha kakasha :D");

        //результат значения, это значение типа boolean
        System.out.println("10 > 9 и это результат  - " + (10>9));
        System.out.println("Некоторые личности говорят, что 2+2 = 5, но мы то знаем, что это " + (2+2==5));


    }
}
