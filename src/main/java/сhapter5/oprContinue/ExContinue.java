package сhapter5.oprContinue;

public class ExContinue {
    public static void main(String[] args){

        for (int i = 0; i<10; i++){
            System.out.print(i + " ");
            if (i%2 ==0) continue; // Получается, что тут мы возвращаемся к началу цикла, если равно 0
            System.out.println("");
        }

    }
}
