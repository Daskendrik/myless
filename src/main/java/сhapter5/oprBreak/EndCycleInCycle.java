package сhapter5.oprBreak;

public class EndCycleInCycle {
    public static void main(String[] args) {

        for (int i = 0; i<3; i++){
            System.out.print("Проход " + i + ": ");
            for (int j = 0; j<100; j++){
                if (j ==10) break; //Выходим из цикла, если j == 10
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println("Cycle is end");
    }
}
