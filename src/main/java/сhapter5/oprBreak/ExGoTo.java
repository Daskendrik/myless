package сhapter5.oprBreak;

public class ExGoTo {
    public static void main (String[] args){

        boolean t = true;

        first: {
            second:{
                third:{
                System.out.println("Предшествует оператору break");
                if (t) break second; //Переход к концу 2 метки
                    System.out.println("Этого не будет");
                }
                System.out.println("Этого не будет");
            }
            System.out.println("Этот оператор идет после конца 2 блока, поэтому он будет");
        }

    }
}
