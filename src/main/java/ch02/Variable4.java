package ch02;

public class Variable4 {
    //사용자 정의 메서드 구현
    //b=1; 재정의에 대한 위치에 따라 결과가 달라질 수 있다.
    void methodA(){
        int a = 1;
        int b = 2;
        System.out.println("methodA before a:"+a+", b:"+b);
        b = 1;
        a = b;
        System.out.println("methodA after a:"+a+", b:"+b);
    }
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        System.out.println("before a:"+a+", b:"+b);
        a = b;
        b = 1;
        System.out.println("after a:"+a+", b:"+b);
        System.out.println("============[main]==============");
        //내 안에 선언한 메서드이더라도 main안에서 호출할 땐 인스턴스화 해야함
        Variable4 v4 = new Variable4();
        v4.methodA();
        System.out.println("methodA 호출 후");
    }
}
