package сhapter5.oprContinue;

public class Ex2 {
    public static void main(String [] args) {

        outer: for (int i = 0; i<10; i++){ //Натыкаясь на это каждый раз заново, разве мы не делаем i = 0?
            for (int j =0; j<10; j++){
                if (j>i){
                    System.out.println();
                    continue outer;
                }
                System.out.print(" " + (i*j));
            }
        }
        System.out.println();
    }
}
