package ch02.study;

public class Exam2 {
    public static void main(String[] args) {
        int comm = 0; //지역변수이다
        //지역변수는 외부에 다른 클래스에서 사용이 불가하다
        //전역변수는 클래스 전역에서 사용이 가능하고 다른 클래스에서도 사용이 가능하다
        int x = 300;
        //아래 = 은 같다가 아니라 오른쪽의 값을 왼쪽에 대입하라는 대입연산자이다
        comm = x;
        System.out.println(comm); //300
    }
}
