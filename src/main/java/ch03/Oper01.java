package ch03;

public class Oper01 {
    public static void main(String[] args) {
        int i = 1;
        int j = 2;
        int hap = i + j;
        System.out.println("두 수의 합은 "+ hap);
        System.out.printf("두 수의 합은 %d\n", hap);
        hap = i - j;
        hap = i*j;
        hap = i/j;
        // 아래 코드는 정수형으로 출력됨
        System.out.println(hap);
        // 아래는 실수형으로 출력됨
        double d = i/(double)j;
        System.out.println(d);
        System.out.println(i==j);//false
    }
}
