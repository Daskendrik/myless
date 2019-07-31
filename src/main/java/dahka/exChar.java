public class exChar {
    public static void main (String[] args) {

        char ch1, ch2, ch3, ch4;
        ch1 = 88;
        ch2 = 'Y';
        ch3 = ch1++;
        ch4 = ch2--;
        System.out.println ("Символ Y в системе 88, а X 89");
        System.out.println("Первая переменная равна " + ch1 + " , а вторая переменная равна " + ch2);
        System.out.println("Теперь мы как бы добавили символу Y (88)(его значению 1, то есть чтобы он стал следующим символом (89)) " + ch3);
        System.out.println("Теперь мы отняли у символа X (89) (у его значения 1, то есть чтобы он стал предыдущим (88)) " + ch4);

    }
}
