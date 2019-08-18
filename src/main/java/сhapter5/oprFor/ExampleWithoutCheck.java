package сhapter5.oprFor;

public class ExampleWithoutCheck {
    public static void main (String[] args) {

        int i = 0;
        boolean done = false;
        for (;!done;) {
            System.out.println(" i is not " + i);
            if ( i ==10) done = true;
            i++;
        }

    }
}
