package ch05;


public class A4 {
    int i = 1;
    A4 a5 = null;
    A4 a51 = new A4();
    void methodA(){
        System.out.println(a5.i);
    }
    //entry point가 main메서드이다. main thread라고 함.
    public static void main(String[] args) {
        A4 a5 = new A4();
        a5.methodA();
    }
}
