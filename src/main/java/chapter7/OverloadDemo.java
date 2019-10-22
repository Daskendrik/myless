package chapter7;

public class OverloadDemo {
    void test () {
        System.out.println("Параметры отсутствуют");
    }

    //Перегружаемый метод, проверяющий наличие одного целочисленного параметра
    void test(int a){
        System.out.println("a:" + a);
    }

    //Перегружаемый метод, проверяющий наличие двух целочисленных параметра
    void  test(int a, int b) {
        System.out.println("a and b: " + a + b);
    }

    //Перегружаемый метод, проверяющий наличие double параметра
    double test(double a) {
        System.out.println("double a:" + a);
        return a * a;
    }
}
class Overload {
    public static void main(String [] args){
        OverloadDemo ob = new OverloadDemo();
        double result;

        ob.test();
        ob.test(10);
        ob.test(10, 20);
        result = ob.test(123.25);
        System.out.println("Результат вызова: " + result);
    }
}
