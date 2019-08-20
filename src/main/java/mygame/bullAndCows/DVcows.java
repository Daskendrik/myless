package mygame.bullAndCows;

class DVcows {
    static int checkCows(int[] expected, int[] actual){
        int cows = 0;
        for (int i: actual) {
            for (int j: expected){
                if (i == j) {
                    cows++;
                    break;
                }
            }
        }
        return cows;
    }

}
