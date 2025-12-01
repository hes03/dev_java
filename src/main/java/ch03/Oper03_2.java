package ch03;

import javax.swing.*;
import java.util.Scanner;

public class Oper03_2 {
    public static void main(String[] args) {
        int first = 0;
        int second = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("첫번째 숫자를 입력하세요.");
        first = sc.nextInt();
        System.out.println("두번째 숫자를 입력하세요.");
        second = sc.nextInt();
        System.out.println("두 수의 합은 1 ===> " + (first+second));
        System.out.println("두 수의 합은 2 ===> " + first+second);
    }
}
