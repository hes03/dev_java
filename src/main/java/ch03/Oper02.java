package ch03;

import javax.swing.*;

//대화형 프로그래밍 연습해보기
public class Oper02 {
    public static void main(String[] args) {
        //메서드를 호출할 때 파라미터 개수와 타입을 맞춰야 한다
        //이 말은 같은 이름의 메서드를 허용한다는 것
        //자바에서는 같은 이름의 메서드를 중복하여 선언할 수 있다.
        //단, 파라미터의 개수가 다르거나 타입이 다르면 된다
        //내가 구현하는 능력을 키우기 위해 라이브러리를 적극적으로 활용해 보기
        String r1 = JOptionPane.showInputDialog("1부터 9사이의 숫자를 입력하세요.");
        String r2 = JOptionPane.showInputDialog("1부터 9사이의 숫자를 입력하세요.", 0);

        if (1<= Integer.parseInt(r1) && Integer.parseInt(r1)<=9){
            System.out.println(r1);
        }else{
            System.out.println("1부터 9사이의 숫자만 입력해야 합니다.");
            return; //다음 로직으로 이동할 수 없다. - 유효성체크 - front end - 자바스크립트
        }
        //System.out.println(r1);
        System.out.println("else인 경우 여기가 실행기회를 갖지 못합니다.\n");
        System.out.println(r2);
    }
}
