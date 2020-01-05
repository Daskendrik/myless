package chapter8;

class A {
    int i;
}

class C extends A{
    int i;

    C(int a, int b){
        super.i = a;
        i = b;
    }
    void show1 (){
        System.out.println("Член i в суперклассе равен " + super.i);
        System.out.println("Член i в подклассе равен " + i);
    }
}

class UseSuper {
    public static void main (String[] args) {
        C sub_sub = new C(1, 2);
        sub_sub.show1();
    }
}
