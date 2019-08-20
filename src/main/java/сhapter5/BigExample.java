package сhapter5;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BigExample {
    public static void main (String[] args)
    throws java.io.IOException{

        char choice;
        do {
            System.out.println("help operator");
            System.out.println("    1. if");
            System.out.println("    2. switch");
            System.out.println("    3. while");
            System.out.println("    4. do-while");
            System.out.println("    5. for ");
            System.out.println(" select the desired item ");
            choice = '6'; //Тут интересно считывается введеный симвл, если написать 87 и нажать ентр, он этот шаг пропустит 2 раза, но прокрутит do
            BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
            try{
                String s = r.readLine();
                System.out.println(s);
            }catch (Exception ex){
                ex.printStackTrace();
            }
        } while (choice<'1' || choice>'5');

        switch (choice) {
            case '1':
                System.out.println("if:");
                System.out.println("if(условеи) оператор;");
                System.out.println("else оператор;");
                break;
            case '2':
                System.out.println("switch:");
                System.out.println("switch (выражение) {");
                System.out.println(" case константа:");
                System.out.println(" breake;");
                System.out.println("// ...");
                System.out.println("}");
                break;
            case '3':
                System.out.println("while: ");
                System.out.println("while (условие) оператор;");
                break;
            case '4':
                System.out.println("do-while: ");
                System.out.println("do {");
                System.out.println("    оператор;");
                System.out.println("} while (условеи)");
                break;
            case '5':
                System.out.println("for: ");
                System.out.println("for (инициализация; условеи; итерация) ");
                System.out.println(" оператор");
                break;
        }

    }
}
