package сhapter5.oprFor;

public class Example2operFor {
    public static void main (String[] args) {

       int a,b;

       for (a = 1, b = 5; a!=b; a++, b--){ // используем 2 переменные для изменения
           System.out.println(a + " is not " + b);
       }
       System.out.println(a + " is " + b + "\na is b so good :)");
    }
}
