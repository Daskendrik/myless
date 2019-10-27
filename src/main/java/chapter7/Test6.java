package chapter7;

class Test6 {
    int a;

    Test6(int i){
        a = i;
    }

    Test6 incrByTen() {
        Test6 temp = new Test6(a + 10);
        return temp;
        //  return new Test6(a + 10);
    }

    void upset(Test6 o) {
        o.a++;
    }
}

class RetOb {
    public static void main (String [] args){
        Test6 ob1 = new Test6(2);
        Test6 ob2;

        ob2 = ob1.incrByTen();
        System.out.println("ob1.a " + ob1.a );
        System.out.println("ob2.a " + ob2.a);

        ob2 = ob2.incrByTen();
        System.out.println("После второго увеличения " + ob2.a);

        ob1.upset(ob1);
        System.out.println(ob1.a);
    }
}


