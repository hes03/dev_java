package ch02;

import java.util.Scanner;
// 자바가상머신이 제공하는 클래스가 있다.
// 클래스 구성 요소 중 한가지는 메서드이다.
// 제공되는 parseInt메서드를 활용할 수 있다.
public class Variable8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("0부터 9사이의 숫자를 입력하시오 \n");
        String userInput = sc.nextLine();
        System.out.println("당신이 입력한 숫자는 " + userInput + " 입니다.");
        System.out.println(userInput instanceof String);
        //문자열 + 숫자 = 문자열
        System.out.println(userInput+2);
        System.out.println(Integer.parseInt(userInput)+2);
        int imsi = Integer.parseInt(userInput);
        System.out.println(imsi);
        //원시형 타입에는 8가지가 있다.
        //char, byte, short, int, long, float, double, boolean(if, for, 조건문사용)
        //원시형 타입은 호출하면 값이 출력된다.
        //참조형 타입은 호출하면 주소번지가 16진수로 출력된다.
    }
}
