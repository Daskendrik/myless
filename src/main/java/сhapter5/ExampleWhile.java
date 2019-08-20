package сhapter5;

public class ExampleWhile {
    public static void main (String[] args) {

        int n = 10;
        while (n>0){
            System.out.println("Tik tak number " + n);
            n--;
        }
        System.out.println(" ");
        int i, j;
        i = 100;
        j = 200;

        //Расчитаем средене значение переменной  ( но скорее это медиана)
        while (++i < --j);
        System.out.println("average value is " + i);
    }
}
