package dahka;

public class ExampleDinInn {
    public static void main (String [] args) {

        double a = 3.0, b = a + 0.0;

        if (a == b) {
            double c = Math.sqrt(a * a + b * b);
            System.out.println("Если обе стороны равны " + b + ", то тогда гипотенцза будет равна " + c);
        }
        else{

                //динамическая инициализация переменно с
                double c = Math.sqrt(a * a + b * b);
                System.out.println("Если одна сторона равна " + a + ", а другая " + b + ", то тогда гипотенцза будет равна " + c);
            }
        }
    }

