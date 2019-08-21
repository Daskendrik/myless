package mygame.bullAndCows;

public class DVbulls {
    static int checkBulls(int[] expected, int[] actual){
        int bulls = 0;
        int j = 0;
        for (int i: actual) {
            if (i == expected[j] ) {
                bulls++;
            }
            j++;
        }
        return bulls;
    }
}
