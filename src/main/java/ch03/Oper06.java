package ch03;
/*
만약(조건식)이 참이면 이 코드를 실행하고, 아니면 다른 코드를 실행하시오
이런 문장을 코드로 표현한 것이 조건문이다.
 */
public class Oper06 {
    public static void main(String[] args) {
        int age = 0;
        if(age <= 19){
            System.out.println("미성년자");
        }else if(age > 19){
            System.out.println("성인");
        }
    }
}
