package dahka;

public class ExampleLifeTime {
    public static void main (String[] args) {

        int x;
        for (x = 0; x < 3; x++) {
            int y = -1; // переменная иниуиализируется при каждом вхождении в блок
             System.out.println("y is: " + y); // тут всегда у равно -1
             y = 100;
             System.out.println("and here y always is: " + y); // тут всегда 100

        }

    }
}
