package chapter7.classString;

public class StringDemo {
    public static void main (String[] args) {
        String a = "Первая строчка";
        String b = "Вторая строчка";
        String c = a;
        System.out.println("Длина строки a: " + a.length());
        System.out.println("Символ по индексу 3 в строке a: " + a.charAt(3));
        if(a.equals(b))
            System.out.println("a==b");
        else
            System.out.println("a!=b");

        if (a.equals(c))
            System.out.println("a==c");
        else
            System.out.println("a!=c");

    }
}