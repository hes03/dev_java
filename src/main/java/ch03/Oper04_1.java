package ch03;

public class Oper04_1 {
    public static void main(String[] args) {
        int a = 2; //호출하면 값이 나온다
        //출력이 먼저인가, 증가연산자 처리가 먼저인가
        System.out.println(a++); //출력이 먼저: 2 증가연산자 처리가 먼가: 3
        //아래 초기화를 주석으로 하면 a = 2, a= 4가 출력됨
        //주석을 풀면 a =2, a=3이 출력됨
        //a = 2;
        System.out.println(++a);
    }
}
