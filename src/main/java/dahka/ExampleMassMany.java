package dahka;

public class ExampleMassMany {
    public static void main (String[] args) {

        int[][] massmany = new int[4][5];
        int i, j, k = 0;
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 5; j++) {
                massmany[i][j] = k;
                k++;
            }
        }
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 5; j++) {
                System.out.print(massmany[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println();
        //Как представить двухмерный массив подругому
        int[][] TwoMas = new int[4][]; //Тут мы резервируем только строчки, тк столбы можно потом
        TwoMas[0] = new int [1];
        TwoMas[1] = new int [2];
        TwoMas[2] = new int [3];
        TwoMas[3] = new int [4];
        for (i = 0; i < 4; i++) {
            for (j = 0; j < i + 1; j++){
                TwoMas[i][j] = k;
                k++;
            }
        }
        for (i = 0; i<4; i++) {
            for (j = 0; j < i + 1; j++) {
                System.out.print(TwoMas[i][j] + "  ");
            }
        System.out.println("<--Это строчка " + (i+1) + ", тут " + j + " строчка по вертикали");
        }
        System.out.println("");
        //Инициализация двухмерного массива
        double [][] ThMas = {
                {0*0, 1*0, 2*0, 3*0},
                {0*1, 1*1, 2*1, 3*1},
                {0*2, 1*2, 2*2, 3*2},
                {0*3, 1*3, 2*3, 3*3}
        };
        for (i = 0; i<4; i++) {
            for (j = 0; j < 4; j++) {
                System.out.print(ThMas[i][j] + "  ");
            }
        System.out.println("");
        }
    }
}
