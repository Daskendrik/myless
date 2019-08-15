package сhapter5;

public class exampleSwitch {
    public static void main (String[] args) {

        for (int i=0; i<6; i++) { //добавили переменную прямо в операторе
            switch (i) {
                case 0:
                    System.out.println("i is 0");
                    break;
                case 1:
                    System.out.println("i is 1");
                    break;
                case 2:
                    System.out.println("i is 2");
                    break;
                case 3:
                    System.out.println("i is 3");
                    break;
                default:
                    System.out.println("i is more then 3");
            }
        }

    }
}
