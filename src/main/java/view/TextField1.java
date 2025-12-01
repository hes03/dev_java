package view;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextField1 implements ActionListener {
    //선언부
    JFrame jf = new JFrame();
    JButton btn_send = new JButton("전송");
    JTextField jtf_msg = new JTextField(20);
    String msg = "";
    //화면그리기 메서드 구현
    public void initDisplay(){
        System.out.println("initDisplay 호출");
        //이벤트 소스와 이벤트 처리를 담당하는 객체 매핑하기
        btn_send.addActionListener(this);
        boolean isView = false;
        int width = 500;
        int height = 400;
        jf.add("North", jtf_msg);
        jf.add("South", btn_send);
        jf.setSize(width, height);
        //화면에 출력하려면 true, 비활성화하려면 false를 준다.
        isView = true;
        jf.setVisible(isView);
    }
    //메인메서드 구현
    public static void main(String[] args) {
        TextField1 tf1 = new TextField1();
        tf1.initDisplay();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String sendLabel = e.getActionCommand();
        System.out.println(sendLabel);
        if ("전송".equals(sendLabel)){
            jtf_msg.setText("안녕하세요.");
        }
    }
}
