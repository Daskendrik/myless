package interesProgramm;
// Определяем число, простое или нет. (2,3,5,7,11...)
public class FindePrime {
    public static void main (String[] aargs) {

        int num;
        boolean isPrime;

        num = 9;

        if (num < 2) { //Это иф нужен, чтобы в случае, если не попадем в for, на isPrime было значение.
            isPrime = false; // 1,0 и все отрицательные числа это не простые числа, а волшебные :D
        } else {
            isPrime =true;
        }

        for (int i=2; i <=num/i; i++) { // i живет только в этом цикле
            if ((num % i) == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) System.out.println("It is prime number");
        else System.out.println("It is not prime number");
    }
}
