package ch03;

public class B {
    //전역변수 선언 위치에서는 선언과 초기화를 분리하지 않는다.
    int i = 1;

    public static void main(String[] args) {
        int i = 2;
        i = 5;
    }
}
